package com.example.basicandroid.Services

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.basicandroid.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.log

class AlarmAppActivity : AppCompatActivity(){

    private val mainScope = CoroutineScope(Dispatchers.IO)
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

        mainScope.launch {
            Log.d("MyTag", "mainScope: Start")
            testFunction()
            Log.d("MyTag", "mainScope: End")
        }


    }


    suspend fun testFunction(){
        Log.d("MyTag", "testFunction: Start")
        delay(4000)
        Log.d("MyTag", "testFunction: End")
    }
}