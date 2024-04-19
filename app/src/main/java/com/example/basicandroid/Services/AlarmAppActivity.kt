package com.example.basicandroid.Services

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicandroid.R

class AlarmAppActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create an Intent for the BroadcastReceiver
        val intent = Intent(this, AlarmReceiver::class.java)
        intent.action = "com.example.basicandroid.Services.ALARM_TRIGGERED"

        // Create a PendingIntent
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent,PendingIntent.FLAG_MUTABLE)

        // Get an instance of AlarmManager
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Set the alarm to fire after 10 seconds (adjust time as needed)
        val triggerTime = System.currentTimeMillis() + 2000 // 10 seconds
        alarmManager.set(AlarmManager.RTC_WAKEUP, triggerTime, pendingIntent)


    }


    suspend fun testFunction(){

    }
}