package com.example.androidfundamentals.intentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.androidfundamentals.R

class IntentServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)
        findViewById<Button>(R.id.btnStartIntentService).setOnClickListener {

            Intent(this, MyService::class.java).also {
                startService(it)
                findViewById<TextView>(R.id.tvIntentServiceStatus).text = ("Service running")
            }
        }

        findViewById<Button>(R.id.btnStopIntentService).setOnClickListener {
//            MyIntentService.stopService()
//            findViewById<TextView>(R.id.tvIntentServiceStatus).text = ("Service stopped")
            Intent(this, MyService::class.java).also {
                stopService(it)
                findViewById<TextView>(R.id.tvIntentServiceStatus).text = ("Service stopped")
            }
        }
        findViewById<Button>(R.id.btnSendServiceData).setOnClickListener {

            Intent(this, MyService::class.java).also {
                it.putExtra("EXTRA_DATA",
                findViewById<EditText>(R.id.etServiceData).text.toString())
                startService(it)
            }
        }
    }
}