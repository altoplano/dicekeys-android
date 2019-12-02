package com.keysqr.readkeysqrdemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.keysqr.readkeysqr.ReadKeySqrActivity
import com.keysqr.readkeysqr.keySqrFromJsonFacesRead

class MainActivity : AppCompatActivity() {

    val RC_READ_KEYSQR = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_start).setOnClickListener{
            val intent = Intent(this, ReadKeySqrActivity::class.java)
            startActivityForResult(intent, RC_READ_KEYSQR)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == RC_READ_KEYSQR) {
            if(resultCode == Activity.RESULT_OK)
            {
                if(data!=null) {
                    val humanReadableForm: String = data.getStringExtra("result")
                    findViewById<TextView>(R.id.txt_json).text = humanReadableForm
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }


}