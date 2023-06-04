package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_text)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val firstNumber = findViewById<EditText>(R.id.etFirstName).text.toString().toInt()
            val secondNumber = findViewById<EditText>(R.id.etSecondNumber).text.toString().toInt()
            val txtResult = findViewById<TextView>(R.id.txtResult)
            txtResult.text = (firstNumber + secondNumber).toString()
        }
    }
}