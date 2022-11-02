package com.example.studytest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class timeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)


        val btnBack : Button = findViewById(R.id.backbutton)
        btnBack.setOnClickListener {
            finish()
        }
    }
}