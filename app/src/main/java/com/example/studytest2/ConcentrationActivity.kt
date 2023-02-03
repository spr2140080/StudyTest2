package com.example.studytest2

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.example.studytest2.databinding.ActivityConcentrationBinding

class ConcentrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConcentrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concentration)
        binding = ActivityConcentrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.conText.movementMethod = ScrollingMovementMethod()


    }
}