package com.example.androidfundamentals
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener {
            val name = findViewById<EditText>(R.id.etFirstName).text.toString()
            val lastName = findViewById<EditText>(R.id.etLastName).text.toString()
            val dob = findViewById<EditText>(R.id.etBirthdate).text.toString()
            val country = findViewById<EditText>(R.id.etCountry).text.toString()
            Toast.makeText(this,"$name $lastName was born in $dob in $country",Toast.LENGTH_LONG)
        }
    }

    override fun onPause() {
        super.onPause()
        println("Activity is pausing")
    }
}