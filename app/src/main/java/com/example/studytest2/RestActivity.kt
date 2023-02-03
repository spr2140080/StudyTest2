package com.example.studytest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ScrollView
import com.example.studytest2.databinding.ActivityRestBinding


class RestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rest)
        binding = ActivityRestBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}