package com.example.basicandroid.Services

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.basicandroid.R
import java.security.Provider.Service

class ServiceActivity : AppCompatActivity() {

    lateinit var startBtn :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        startBtn = findViewById(R.id.startService)

    }
}

//class ForeGround : Service(){
//
//
//
//}