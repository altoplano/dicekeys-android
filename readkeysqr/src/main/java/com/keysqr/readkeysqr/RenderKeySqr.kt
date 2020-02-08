package com.keysqr.readkeysqr

import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat
import com.keysqr.Face
import com.keysqr.FaceDimensionsFractional
import com.keysqr.FaceRead
import com.keysqr.KeySqr


class KeySqrRenderer(private val typeface: Typeface?) {

    // Typeface inconsolata = Typeface.createFromAsset(assetManager, pathToFont) / ResourcesCompat.getFont(context, R.font.Inconsolata700)
    private fun textPaintForFaceSize(faceSize: Float): Paint {
        val paint = Paint()
        if (typeface != null) {
            paint.typeface = typeface
        }
        paint.textAlign = Paint.Align.CENTER
        paint.textSize = faceSize * FaceDimensionsFractional.fontSize
        paint.color = Color.BLACK
        return paint
    }

    fun <T : Face<T>> renderFace(
            face: Face<T>,
            canvas: Canvas,
            faceSize: Float = minOf(canvas.width, canvas.height).toFloat(),
            textPaint: Paint = textPaintForFaceSize(faceSize),
            x: Float = 0f,
            y: Float = 0f
    ) {
        val whitePaint = Paint()
        whitePaint.color = Color.WHITE
        val blackPaint = Paint()
        blackPaint.color = Color.BLACK
        val undoverlineDotWidth = FaceDimensionsFractional.undoverlineDotWidth * faceSize
        val undoverlineDotHeight = FaceDimensionsFractional.undoverlineDotHeight * faceSize

        // Draw an underline or overline
        fun renderUndoverline(isOverline: Boolean) {
            val undoverlineDotTop = y + (
                    if (isOverline)
                        FaceDimensionsFractional.overlineDotTop
                    else
                        FaceDimensionsFractional.underlineDotTop
                    ) * faceSize
            val undoverlineDotBottom = undoverlineDotTop + undoverlineDotHeight
//            // Draw a white box representing a pixel at a given position with the [und|ov]erline
//            fun renderUndoverlineBit(pos: Int) {
//                val undoverlineDotLeft = x +
//                        FaceDimensionsFractional.undoverlineFirstDotLeftEdge * faceSize +
//                        undoverlineDotWidth * pos
//                val undoverlineDotRight = undoverlineDotLeft + undoverlineDotWidth
//                canvas.drawRect(undoverlineDotLeft, undoverlineDotTop, undoverlineDotRight, undoverlineDotBottom, whitePaint)
//            }

            // Calculate the coordinates of the black [und|ov]erline rectangle
            val left = x + FaceDimensionsFractional.undoverlineLeftEdge * faceSize
            val top = y + (
                    if (isOverline)
                        FaceDimensionsFractional.overlineTop
                    else
                        FaceDimensionsFractional.underlineTop
                    ) * faceSize
            val right = left + FaceDimensionsFractional.undoverlineLength * faceSize
            val bottom = top + FaceDimensionsFractional.undoverlineThickness * faceSize
            canvas.drawRect(left, top, right, bottom, blackPaint)

            // Draw the white boxes representing the code in the [und|ov]erline
            // within the [und|ov]erline rectangle.
            val code: Short? = if (isOverline) face.overlineCode else face.underlineCode
            if (code != null) {
                val fullCode = 1024 + (if (isOverline) 512 else 0) + (code.toInt() shl 1)
                for (pos in 0..10) {
                    if (((fullCode shr (10 - pos)) and 1) != 0) {
                        // Draw a white box at position pos because that bit is 1 in the code
                        val undoverlineDotLeft = x +
                                FaceDimensionsFractional.undoverlineFirstDotLeftEdge * faceSize +
                                undoverlineDotWidth * pos
                        val undoverlineDotRight = undoverlineDotLeft + undoverlineDotWidth
                        canvas.drawRect(undoverlineDotLeft, undoverlineDotTop, undoverlineDotRight, undoverlineDotBottom, whitePaint)
                    }
                }
            }
        }

        // Calculate the center of the face (used for rotation below)
        val centerX = x + faceSize / 2
        val centerY = y + faceSize / 2
        // Rotate the canvas in counterclockwise before rendering, so that
        // when the rotation is restored (clockwise) the face will be in the
        // correct direction
        val rotateCanvasBy = 90f *
                (face.clockwise90DegreeRotationsFromUpright ?: 0).toFloat()
        if (rotateCanvasBy != 0f) {
            canvas.save()
            canvas.rotate(rotateCanvasBy, centerX, centerY )
        }

        // Calculate the positions of the letter and digit
        val fractionalXDistFromFaceCenterToCharCenter = (FaceDimensionsFractional.charWidth + FaceDimensionsFractional.spaceBetweenLetterAndDigit) / 2
        val letterX = x + (0.5f - fractionalXDistFromFaceCenterToCharCenter) * faceSize
        val digitX = x + (0.5f + fractionalXDistFromFaceCenterToCharCenter) * faceSize
        val textY = y + FaceDimensionsFractional.textBaselineY * faceSize
        // Render the letter and digit
        canvas.drawText(face.letter.toString(), letterX, textY, textPaint)
        canvas.drawText(face.digit.toString(), digitX, textY, textPaint)
        // Render the underline and overline
        renderUndoverline(false)
        renderUndoverline(true)

        // Undo the rotation used to render the face
        if (rotateCanvasBy != 0f) {
            canvas.restore()
        }

    }

    fun <T : Face<T>> renderKeySqr(
            keySqr: KeySqr<T>,
            canvas: Canvas,
            size: Float = minOf(canvas.width, canvas.height).toFloat(),
            x: Float = (canvas.width - size) / 2,
            y: Float = (canvas.height - size) / 2
    ) {
        val faceDist = size / 5f
        val faceSize = size / 8f
        val left = x + (faceDist - faceSize) / 2f
        val top = y + (faceDist - faceSize) / 2f
        val textPaint: Paint = textPaintForFaceSize(faceSize)

        keySqr.faces.forEachIndexed { index, face ->
            run {
                renderFace(
                        face,
                        canvas,
                        faceSize,
                        textPaint,
                        left + faceDist * (index % 5).toFloat(),
                        top + faceDist * (index / 5).toFloat()
                )
            }
        }
    }
}

class KeySqrDrawable(
    private val context: Context,
    private val keySqr: KeySqr<FaceRead>
) : Drawable() {

    private val inconsolataBold: Typeface? = ResourcesCompat.getFont(context, R.font.inconsolata_bold)
    private val renderer = KeySqrRenderer(inconsolataBold)

    override fun draw(canvas: Canvas) {
        // https://github.com/dicekeys/read-keysqr-android/issues/18
        renderer.renderKeySqr(keySqr.rotate(1), canvas)
    }

    override fun setAlpha(alpha: Int) {
        // This method is required
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        // This method is required
    }

    override fun getOpacity(): Int =
            // Must be PixelFormat.UNKNOWN, TRANSLUCENT, TRANSPARENT, or OPAQUE
            PixelFormat.OPAQUE
}