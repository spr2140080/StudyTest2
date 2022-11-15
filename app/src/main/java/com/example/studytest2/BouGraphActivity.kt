package com.example.studytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studytest2.databinding.ActivityBouBinding
import com.example.studytest2.databinding.FragmentGraphBinding

class BouGraphActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBouBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bou)

        binding = ActivityBouBinding.inflate(layoutInflater)
        setContentView(binding.root)


        }
    }

