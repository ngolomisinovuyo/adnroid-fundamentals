package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastsAndContextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toats_and_context)
        findViewById<Button>(R.id.btnShowToast).setOnClickListener {
            // we can also use the applicationContext
           // Toast.makeText(this,"Hi, I'm a toast", Toast.LENGTH_LONG).show()
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.clToast))
                show()
            }
        }
    }
}