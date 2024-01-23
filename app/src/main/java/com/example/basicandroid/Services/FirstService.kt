package com.example.basicandroid.Services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.example.basicandroid.Activity.LearnActivity;
import com.example.basicandroid.Utils.Constansts


class FirstService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(Constansts.TAG, "onStartCommand: "+Thread.currentThread().name)
        return super.onStartCommand(intent, flags, startId)

    }
    override fun onBind(intent: Intent?): IBinder? {
        Log.d(Constansts.TAG, "onBind: ")
        TODO("Not yet implemented")
    }
}