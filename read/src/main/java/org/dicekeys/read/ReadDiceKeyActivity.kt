package org.dicekeys.read

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Matrix
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.widget.*
import androidx.camera.core.*
import androidx.camera.core.ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST
import androidx.camera.lifecycle.*
import androidx.camera.view.PreviewView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.common.util.concurrent.ListenableFuture
import java.util.concurrent.Executors

// FIXME - resolve API update: Moved rotationDegrees from class Analyzer to ImageInfo.


class ReadDiceKeyActivity : AppCompatActivity() {
    companion object {
        object Parameters {
            const val requestId = "requestId"
            object Response {
                const val diceKeyAsJson = "diceKeyAsJson"
            }
        }
    }

    // This is an arbitrary number we are using to keep track of the permission
    // request. Where an app has multiple context for requesting permission,
    // this can help differentiate the different contexts.
    private val REQUEST_CODE_PERMISSIONS = 10

    // This is an array of all the permission specified in the manifest.
    private val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)

    // Add this after onCreate
    private val executor = Executors.newSingleThreadExecutor()


    private lateinit var cameraProviderFuture : ListenableFuture<ProcessCameraProvider>
    private lateinit var previewView: PreviewView
    private lateinit var imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cameraProviderFuture = ProcessCameraProvider.getInstance(this)

        setContentView(R.layout.activity_read_key_sqr)

        imageView = findViewById(R.id.overlay_view)
        previewView = findViewById(R.id.preview_view)

        if(allPermissionsGranted()) {
            imageView.post{startCamera()}
        }
        else
        {
            ActivityCompat.requestPermissions(
                    this, REQUIRED_PERMISSIONS, REQUEST_CODE_PERMISSIONS)
        }
    }

    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
    ) {
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            if (allPermissionsGranted()) {
                // viewFinder.post { startCamera() }
                imageView.post { startCamera() }
            } else {
                Toast.makeText(this,
                        "Permissions not granted by the user.",
                        Toast.LENGTH_SHORT).show()
                setResult(Activity.RESULT_CANCELED, Intent().apply{
                    putExtra(Parameters.requestId, intent.getStringExtra(Parameters.requestId))
                })
                finish()
            }
        }
    }

    /**
     * Check if all permission specified in the manifest have been granted
     */
    private fun allPermissionsGranted() = REQUIRED_PERMISSIONS.all {
        ContextCompat.checkSelfPermission(
                baseContext, it) == PackageManager.PERMISSION_GRANTED
    }

    private fun startCamera() {
        cameraProviderFuture.addListener(Runnable {
            val cameraProvider = cameraProviderFuture.get()
            bindPreview(cameraProvider)
        }, ContextCompat.getMainExecutor(this))
    }

    private fun bindPreview(cameraProvider : ProcessCameraProvider) {
        var cameraSelector : CameraSelector = CameraSelector.Builder()
                .requireLensFacing(CameraSelector.LENS_FACING_BACK)
                .build()
        //val previewSize = Size(viewFinder.width, viewFinder.height)
        val previewSize = Size(previewView.width, previewView.height)


        // Build the viewfinder use case
        val preview: Preview = Preview.Builder()
                .setTargetResolution(previewSize)
                .build()

        val pWidth = previewView.width
        val pHeight = previewView.height
        val analyzerSize: Size =
                if (pWidth * 9 > pHeight * 16)
                // Wider than 16x9, so fix width=1920 and calculate a height which will be <= 1080
                    Size(1920, (1920 * pHeight) / pWidth)
                else if (pHeight * 16 > pWidth * 9)
                // Taller than 16x9, so fix height=1920 and calculate a width which will be <= 1080
                    Size((1920 * pWidth) / pHeight, 1920)
                else if (pWidth > pHeight)
                // Wider than 1x1 but less than 16x9, so fix height=1080 and calculate width <=1920
                    Size((1080 * pWidth / pHeight), 1080)
                else
                // Taller than 1x1, or 1x1, so fix width at 1080 and calculate height 1080<=x<=1920
                    Size(1080, (1080 * pHeight / pWidth) )
        val diceKeyImageAnalyzerUseCase = ImageAnalysis.Builder()
                // In our analysis, we care more about the latest image than
                // analyzing *every* image
                .setBackpressureStrategy(STRATEGY_KEEP_ONLY_LATEST)
                .setTargetResolution(analyzerSize)
                .build()

        var analyzeDiceKey = DiceKeyAnalyzer(this)
        diceKeyImageAnalyzerUseCase.setAnalyzer(
                // Stuart is guessing with this next parameter
                executor, // ContextCompat.getMainExecutor(this),
                analyzeDiceKey
        )
        // analyzerConfig.setTargetRotation()

        analyzeDiceKey.onActionOverlay = fun(overlayBitmap){
            val matrix = Matrix()
            // FIXME - not sure this will be correct if scanning in landscape.
            // I'd assume this angle should be derived/read from somewhere.
            // https://github.com/dicekeys/read-dicekey-android/issues/18
            matrix.postRotate(90f)
            val rotatedBitmap = Bitmap.createBitmap(overlayBitmap, 0, 0, overlayBitmap.getWidth(), overlayBitmap.getHeight(), matrix, true);

            imageView.setImageBitmap(rotatedBitmap)
        }

        analyzeDiceKey.onActionDone = fun(diceKeyAsJson){
            var newIntent = Intent()
            newIntent.putExtra(Parameters.requestId, intent.getStringExtra(Parameters.requestId))
            newIntent.putExtra(Parameters.Response.diceKeyAsJson, diceKeyAsJson)
            setResult(RESULT_OK, newIntent)
            cameraProviderFuture.get().unbindAll()
            finish()
        }

        // Bind the camera selector use case, the preview, and the image analyzer use case
        // to this activity class
        var camera = cameraProvider.bindToLifecycle(this, cameraSelector, preview, diceKeyImageAnalyzerUseCase)
//        var camera = cameraProvider.bindToLifecycle(this as LifecycleOwner, cameraSelector, preview)

//        preview.setSurfaceProvider(previewView.createSurfaceProvider(camera.cameraInfo))
        preview.setSurfaceProvider(previewView.surfaceProvider)

    }

}
