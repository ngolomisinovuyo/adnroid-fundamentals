package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CheckboxAndRadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checbox_and_radion_button)
        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            val checkedMeatRadioButtonId = findViewById<RadioGroup>(R.id.rgMeat)
                .checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onions = findViewById<CheckBox>(R.id.cbOnion).isChecked
            val salad = findViewById<CheckBox>(R.id.cbSalad).isChecked
            var orderSummary = "You ordered a burger with:\n" +
                    "${meat.text}" +
                    (if(cheese) "\nCheese" else "" )+
                    (if(onions) "\nOnions" else "")+
                    (if(salad) "\nSalad" else "")
            findViewById<TextView>(R.id.tvOrder).text = orderSummary

        }
    }
}