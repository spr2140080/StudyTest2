package com.example.studytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.studytest2.ui.target.TargetFragment

class MokuhyoukakuninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mokuhyoukakunin)
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