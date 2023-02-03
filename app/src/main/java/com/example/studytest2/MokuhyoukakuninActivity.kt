package com.example.studytest2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.studytest2.databinding.ActivityMokuhyoukakuninBinding

class MokuhyoukakuninActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMokuhyoukakuninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMokuhyoukakuninBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val getText = findViewById<TextView>(R.id.textView71)
        val intentText = intent.getStringExtra("INPUT_TEXT")
        val modoru = findViewById<Button>(R.id.button70)
        val kakunin = findViewById<Button>(R.id.button71)
        val editTextkey = findViewById<EditText>(R.id.Edittext50)

        getText.text = intentText

        modoru.setOnClickListener {
            val intent = Intent(this, MokuhyounyuryokuActivity::class.java)
            startActivity(intent)
        }
        kakunin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}