package com.example.androidfundamentals.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.example.androidfundamentals.R

class SharedPreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        findViewById<Button>(R.id.btnSharedPreferencesSave).setOnClickListener {
            val name = findViewById<EditText>(R.id.etSharedPreferencesName).text.toString()
            val age = findViewById<EditText>(R.id.etSharedPreferencesAge).text.toString().toInt()
            val isAdult = findViewById<CheckBox>(R.id.cbSharedPreferencesAdult).isChecked
            editor.apply {
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", isAdult)
                // Async
                apply()
            }
        }

        findViewById<Button>(R.id.btnSharedPreferencesLoad).setOnClickListener {
            val name = sharedPref.getString("name", null)
            val age = sharedPref.getInt("age", 0)
            val isAdult = sharedPref.getBoolean("isAdult",false)
            findViewById<EditText>(R.id.etSharedPreferencesName).setText(name)
            findViewById<EditText>(R.id.etSharedPreferencesAge).setText( age.toString())
            findViewById<CheckBox>(R.id.cbSharedPreferencesAdult).isChecked = isAdult
        }

    }
}