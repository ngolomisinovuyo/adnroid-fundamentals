package com.example.androidfundamentals.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.androidfundamentals.R

class IntentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intents_and_starting_activities)
        findViewById<Button>(R.id.btnApply).setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val age = findViewById<EditText>(R.id.etAge).text.toString().toInt()
            val country = findViewById<EditText>(R.id.etCountryOnIntents).text.toString()
            val person = Person(name,age, country)
            Intent(this, SecondActivity::class.java)
                .also {
//                    it.putExtra("EXTRA_NAME", name)
//                    it.putExtra("EXTRA_AGE", age)
//                    it.putExtra("EXTRA_COUNTRY", country)
                    it.putExtra("EXTRA_PERSON", person)
                    startActivity(it)
                }
        }
    }
}