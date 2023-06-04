package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_view)
        findViewById<Button>(R.id.btnAddImage)?.setOnClickListener {
            val ivImage = findViewById<ImageView>(R.id.ivImage)
            ivImage.setImageResource(R.drawable.sinovuyo_ngolomi)
        }
    }
}