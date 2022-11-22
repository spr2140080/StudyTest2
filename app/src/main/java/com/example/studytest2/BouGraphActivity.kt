package com.example.studytest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class BouGraphActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bou)

        val entries = ArrayList<BarEntry>()
        entries.add(BarEntry(1f,1f))
        entries.add(BarEntry(2f,2f))
        entries.add(BarEntry(3f,3f))
        entries.add(BarEntry(4f,4f))
        entries.add(BarEntry(5f,4f))



        //表示するデータをDataSetに追加
        val dataSet = BarDataSet(entries, "Label")

        //DataSetをDataに追加
        val data = BarData(dataSet)

        //ビューを取得
        val chart = findViewById<BarChart>(R.id.bar_chart)

        //ChartにDataを追加
        chart.data = data

        //チャートを更新
        chart.invalidate()
    }
}
