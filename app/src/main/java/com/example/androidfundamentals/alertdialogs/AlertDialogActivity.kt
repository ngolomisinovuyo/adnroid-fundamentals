package com.example.androidfundamentals.alertdialogs

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.androidfundamentals.R

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want ot add Mr Who to your contact list")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Mr Who was added to your contact list",
                    Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this, "Mr Who was not added to your contact list",
                    Toast.LENGTH_SHORT).show()
            }.create()
        findViewById<Button>(R.id.btnDialog1).setOnClickListener {
            addContactDialog.show()
        }
        val options = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these items")
            .setSingleChoiceItems(options, 0) { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}",
                    Toast.LENGTH_SHORT).show()
            }.setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the single choice dialog",
                    Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") {_,_ ->
                Toast.makeText(this, "You declined the single choice dialog",
                    Toast.LENGTH_SHORT).show()
            }.create()
        findViewById<Button>(R.id.btnDialog2).setOnClickListener {
            singleChoiceDialog.show()
        }
        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these items")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)) { _, i, isChecked ->
                if(isChecked) {
                    Toast.makeText(this, "You clicked on ${options[i]}",
                        Toast.LENGTH_SHORT).show()
                }

            }.setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the mutli choice dialog",
                    Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") {_,_ ->
                Toast.makeText(this, "You declined the multi choice dialog",
                    Toast.LENGTH_SHORT).show()
            }.create()
        findViewById<Button>(R.id.btnDialog3).setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}