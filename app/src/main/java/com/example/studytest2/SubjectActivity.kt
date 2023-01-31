package com.example.studytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studytest2.databinding.ActivitySubjectBinding

class SubjectActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubjectBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject)

        binding = ActivitySubjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BackButton.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
        }
        binding.addButton.setOnClickListener {
            val intent = Intent(this,TimeActivity::class.java)
            intent.putExtra("SUBJECT", binding.SjText.text.toString())
            startActivity(intent)
        }
    }
}