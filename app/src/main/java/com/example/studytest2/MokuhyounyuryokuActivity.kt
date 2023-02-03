package com.example.studytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MokuhyounyuryokuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mokuhyounyuryoku)

        var editText = findViewById<EditText>(R.id.Edittext50)
        var inputText = editText.editableText

        var button50 = findViewById<Button>(R.id.button50)

        button50.setOnClickListener {
            if (editText.text.length >= 21) {
                AlertDialog.Builder(this)
                    .setTitle("ERROR!")
                    .setMessage("20文字を超えています")
                    .setPositiveButton("OK") {dialog,which ->}
                    .show()
            }
            else if(editText.length() <= 20){
                val  intent = Intent(this,MokuhyoukakuninActivity::class.java)
                intent.putExtra("INPUT_TEXT",inputText.toString())
                startActivity(intent)
            }
        }
    }
}