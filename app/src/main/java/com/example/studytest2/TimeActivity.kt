package com.example.studytest2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.example.studytest2.databinding.ActivityTimeBinding
import kotlinx.coroutines.NonCancellable.start
import java.util.zip.CheckedOutputStream
import kotlin.system.measureTimeMillis

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
//            var remainingTime:Long = 0
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
            }else{

            }

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
                    if (binding.subjectText.text.length == 0) {
                        AlertDialog.Builder(this@TimeActivity)
                            .setTitle("科目が設定されていません！")
                            .setMessage("科目設定した上でタイマーをスタートしてください")
                            .setPositiveButton("OK") {dialog, which ->}
                            .show()
                    }
                    else {
                        timer.start()
                    }
                }
                binding.stopButton.setOnClickListener {

                    timer.cancel()


                }
                binding.RestartButton.setOnClickListener {



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
