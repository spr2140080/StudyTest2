package com.example.studytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studytest2.databinding.ActivitySubject2Binding

class SubjectActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivitySubject2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_subject

        binding = ActivitySubject2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SjButton.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            intent.putExtra("SUBJECT",binding.subject.text.toString())
            startActivity(intent)
        }


        binding.BackButton.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
        }
    }
}