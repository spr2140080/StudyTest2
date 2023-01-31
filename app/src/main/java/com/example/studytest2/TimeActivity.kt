package com.example.studytest2
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.example.studytest2.databinding.ActivityTimeBinding
import kotlinx.coroutines.NonCancellable.start
import java.io.FileOutputStream
import java.lang.Long.getLong
import java.text.SimpleDateFormat
import java.util.*
import java.util.zip.CheckedOutputStream
import kotlin.system.measureTimeMillis
import kotlin.text.Typography.times

class TimeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTimeBinding
    private var remainingTime:Long = 0

    inner class MyCountDownTimer(
        millisInFuture: Long, countDownInterval: Long
    ) : CountDownTimer(millisInFuture, countDownInterval) {
        var isRunning = false



        private fun CountDownTimer(millisUntilFinished: Long):CountDownTimer{
            return object  :CountDownTimer(millisUntilFinished,100){
                override fun onTick(p0: Long) {
                    binding.timerText.text = "${p0/1000}"
                    remainingTime = p0/1000
                }

                override fun onFinish() {
                    TODO("Not yet implemented")
                    binding.timerText.text = ""
                }
            }
        }



        override fun onTick(millisUntilFinished: Long) {
            val minute = millisUntilFinished / 1000L / 60L
            val second = millisUntilFinished / 1000L % 60L
            var remainingTime:Long = 0
            binding.timerText.text = "%2d:%2$02d".format(minute, second)
//            remainingTime =  "%2d:%2$02d".toLong(minute, second)

                    }


        override fun onFinish() {
            binding.timerText.text = "00:00"
            if (binding.timerText.text == "00:00"){
                AlertDialog.Builder(this@TimeActivity)
                    .setTitle("終了！！")
                    .setMessage("お疲れさまでした")
                    .setPositiveButton("OK") {dialog, which ->}
                    .show()
                binding.startButton.isEnabled = true
                binding.stopButton.isEnabled  = false
            }else{

            }

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var timer = MyCountDownTimer(20 * 60 * 1000, 100)

        timer.isRunning = when (timer.isRunning) {
            false -> {
                val fileName = "contents.txt"
                binding.startButton.setOnClickListener {
                    if (binding.subjectText.text.length == 0) {
                        AlertDialog.Builder(this@TimeActivity)
                            .setTitle("科目が設定されていません！")
                            .setMessage("科目設定した上でタイマーをスタートしてください")
                            .setPositiveButton("OK") {dialog, which ->}
                            .show()
                    }
                    else {
                        binding.startButton.isEnabled = false
                        binding.stopButton.isEnabled = true
                        timer.start()
                    }
                }

                binding.stopButton.setOnClickListener {
                    timer.cancel()
                    binding.stopButton.isEnabled = false
                    binding.startButton.isEnabled = true
                    val times1 = binding.timerText.text.split(":")
                    val sharedPreferences = getSharedPreferences("time_file", Context.MODE_PRIVATE)
                    sharedPreferences.edit().putLong("hidari", times1[0].toLong()).apply()
                    sharedPreferences.edit().putLong("migi", times1[1].toLong()).apply()
                    val min1 = sharedPreferences.getLong("hidari",0)
                    val sec1 = sharedPreferences.getLong("migi",0)
                    timer = MyCountDownTimer((min1 * 60 + sec1) * 1000,100)

                }
//                binding.RestartButton.setOnClickListener {
//                    val sharedPreferences = getSharedPreferences("timekei",Context.MODE_PRIVATE)
//                    val min = getSharedPreferences("hidari", )
//                    val sec = getSharedPreferences("migi", 0)
//                    val times2  = binding.timerText.text.split(":")
//                    timer = MyCountDownTimer((min * 60 + sec) * 1000,100)
//                }

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
                        val min2 = times[0].toLong()
                        val sec2 = times[1].toLong()
                        timer = MyCountDownTimer((min2 * 60 + sec2) * 1000, 100)
                    }

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {}
            }
        binding.subjectButton.setOnClickListener {
            val intent = Intent(applicationContext, SubjectActivity::class.java)
            startActivity(intent)
        }
        binding.backbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val text = intent.getStringExtra("SUBJECT")
        binding.subjectText.text = text
    }
}
