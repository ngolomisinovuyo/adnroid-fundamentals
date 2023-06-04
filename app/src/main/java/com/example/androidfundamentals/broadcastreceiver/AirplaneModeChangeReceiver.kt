package com.example.androidfundamentals.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModelEnabled = intent?.getBooleanExtra("state", false)
            ?: return
        if(isAirplaneModelEnabled) {
            Toast.makeText(context, "Airplane mode enabled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Airplane mode disabled", Toast.LENGTH_LONG).show()
        }
    }
}