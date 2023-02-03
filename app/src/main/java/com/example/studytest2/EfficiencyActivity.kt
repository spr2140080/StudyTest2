package com.example.studytest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import com.example.studytest2.R
import com.example.studytest2.databinding.ActivityEfficiencyBinding

class EfficiencyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEfficiencyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_efficiency)
        binding = ActivityEfficiencyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.efficiency.movementMethod = ScrollingMovementMethod()
    }
}