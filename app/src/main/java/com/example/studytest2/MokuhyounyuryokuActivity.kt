package com.example.studytest2
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.studytest2.databinding.ActivityMokuhyounyuryokuBinding

class MokuhyounyuryokuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMokuhyounyuryokuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMokuhyounyuryokuBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_mokuhyounyuryoku)


        var inputText = binding.Edittext50.editableText


        binding.button50.setOnClickListener {
            if (binding.Edittext50.text.length >= 21) {
                AlertDialog.Builder(this)
                    .setTitle("ERROR!")
                    .setMessage("20文字を超えています")
                    .setPositiveButton("OK") {dialog,which ->}
                    .show()
            }
            else if(binding.Edittext50.text.length <= 20){
                val  intent = Intent(this,MokuhyoukakuninActivity::class.java)
                intent.putExtra("INPUT_TEXT",inputText.toString())
                startActivity(intent)
            }
        }
    }
}