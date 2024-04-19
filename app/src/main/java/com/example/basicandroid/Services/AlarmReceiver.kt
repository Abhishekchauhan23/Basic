package com.example.basicandroid.Services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        // This method will be called when the alarm is triggered
        Toast.makeText(context, "Alarm triggered!", Toast.LENGTH_SHORT).show()
    }
}
