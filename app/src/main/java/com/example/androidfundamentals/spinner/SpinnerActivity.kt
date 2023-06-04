package com.example.androidfundamentals.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.androidfundamentals.R

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        val customList = listOf<String>("First", "Second","Third")
        val adapter = ArrayAdapter<String>(this,
            R.layout.support_simple_spinner_dropdown_item,customList)
        findViewById<Spinner>(R.id.spMonths).adapter = adapter;
        findViewById<Spinner>(R.id.spMonths).onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@SpinnerActivity,
                    "You selected ${parent?.getItemAtPosition(position).toString()}",
                Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}