package com.example.studytest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.*
import com.example.studytest2.databinding.ActivityTimeBinding

class TimeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTimeBinding
    inner class MyCountDownTimer(
        millisInFuture: Long, countDownInterval: Long
    ) : CountDownTimer(millisInFuture, countDownInterval) {
        var isRunning = false
        override fun onTick(millisUntilFinished: Long) {
            val minute = millisUntilFinished / 1000L / 60L
            val second = millisUntilFinished / 1000L % 60L
            binding.timerText.text = "%2d:%2$02d".format(minute, second)
        }
        override fun onFinish() {
            binding.timerText.text = "00:00"
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.timerText.text = "15:00"
        var timer = MyCountDownTimer(15 * 60 * 1000, 100)
            timer.isRunning = when (timer.isRunning) {
                false -> {
                    binding.startButton.setOnClickListener {
                        timer.start()
                    }
                    binding.stopButton.setOnClickListener {
                        timer.cancel()
                    }
                    true
                }
                true -> {
                    false
                }
        }
            binding.spinner.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener {

                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        timer.cancel()
                        val spinner = parent as? Spinner
                        val item = spinner?.selectedItem as? String
                        item?.let {
                            if (it.isNotEmpty()) binding.timerText.text = it
                            val times = it.split(":")
                            val min = times[0].toLong()
                            val sec = times[1].toLong()
                            timer = MyCountDownTimer((min * 60 + sec) * 1000, 100)
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {}
                }
            binding.subjectButton.setOnClickListener {
                val intent = Intent(this, SubjectActivity::class.java)
                startActivity(intent)
            }
            binding.backbutton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            val text = intent.getStringExtra("SUBJECT")
            binding.SubjectText.text = text
    }
}