package com.example.studytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.studytest2.databinding.ActivitySubjectBinding

class SubjectActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubjectBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_subject)

        // ListViewオブジェクトを取得
        val ivMenu = binding.SubjectList
        // ListViewに表示するリストデータを作成
        var _menuList: MutableList<String> = mutableListOf()
        // アダプタオブジェクトを作成
        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, _menuList)
        // リストビューにアダプターオブジェクトを設定
        ivMenu.adapter = adapter
        val vtClick = binding.SjButton
        val Listener = HelloListener(adapter)
        vtClick.setOnClickListener(Listener)
        binding = ActivitySubjectBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.SjButton.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            intent.putExtra("SUBJECT", binding.subject.text.toString())
            startActivity(intent)
        }


        binding.BackButton.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
        }
    }
    private inner  class HelloListener(val adapter: ArrayAdapter<String>) : View.OnClickListener {
        override fun onClick(v: View?) {
            // EditTextオブジェクトを取得
            val editText = binding.subject
            //EditTextのテキストを取得し、onCreateメソッドで作成したアダプターオブジェクトに追加
             adapter.add(editText.text.toString())
        }
    }
}