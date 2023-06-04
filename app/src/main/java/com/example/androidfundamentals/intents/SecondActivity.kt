package com.example.androidfundamentals.intents

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfundamentals.R

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE", 0)
//        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        findViewById<TextView>(R.id.tvDisplayData).text = "${person.name} is ${person.age} years old" +
                " and lives in ${person.country}"
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}