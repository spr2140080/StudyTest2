//package com.example.studytest2
//
//import android.graphics.Color
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import com.github.mikephil.charting.charts.BarChart
//import com.github.mikephil.charting.data.BarData
//import com.github.mikephil.charting.data.BarDataSet
//import com.github.mikephil.charting.data.BarEntry
//import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
//import com.github.mikephil.charting.utils.ColorTemplate
//
//class BouGraphActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_bou)
//
//        val chart = findViewById<BarChart>(R.id.bar_chart)
//
//        val value1: ArrayList<BarEntry> = ArrayList()
//        value1.add(BarEntry(0F, 100F))
//        value1.add(BarEntry(1F, 150F))
//        value1.add(BarEntry(2F, 200F))
//        value1.add(BarEntry(3F, 150F))
//
//        val value2: ArrayList<BarEntry> = ArrayList()
//        value2.add(BarEntry(0F, 50F))
//        value2.add(BarEntry(1F, 100F))
//        value2.add(BarEntry(3F, 150F))
//
//        val value3: ArrayList<BarEntry> = ArrayList()
//        value3.add(BarEntry( 0F, 100F))
//        value3.add(BarEntry( 2F, 50F))
//        value3.add(BarEntry( 4F, 100F))
//        //chartに設定
//        val dataSet1 = BarDataSet(value1, "道徳")
//        dataSet1.color = Color.BLUE
//        val dataSet2 = BarDataSet(value2, "倫理")
//        dataSet2.color = Color.YELLOW
//        val  dataSet3 = BarDataSet(value3, "理科")
//        dataSet3.color = Color.GREEN
//
//        val dataSets: MutableList<IBarDataSet> = ArrayList()
//        dataSets.add(dataSet1)
//        dataSets.add(dataSet2)
//        dataSets.add(dataSet3)
//
//        chart.data = BarData(dataSets)
//        chart.invalidate() // refresh
//    }
//}
