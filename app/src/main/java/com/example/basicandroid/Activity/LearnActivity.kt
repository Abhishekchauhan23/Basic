package com.example.basicandroid.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.basicandroid.MainActivity
import com.example.basicandroid.R
import com.example.basicandroid.Utils.Constansts

class LearnActivity : AppCompatActivity() {


    lateinit var learnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)
        learnButton = findViewById(R.id.button_learn)
        Log.d(Constansts.TAG, "onCreate: ")

        learnButton.setOnClickListener {
            val intent = Intent(LearnActivity@this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(Constansts.TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Constansts.TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Constansts.TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Constansts.TAG, "onStop: ")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(Constansts.TAG, "onDestroy: ")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(Constansts.TAG, "onRestart: ")
    }

}