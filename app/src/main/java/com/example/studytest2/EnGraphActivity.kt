package com.example.studytest2

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate


class EnGraphActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_en_graph)

        val pieChart = findViewById<PieChart>(R.id.chart)

        pieChart.setUsePercentValues(true)
        pieChart.getDescription().setEnabled(false)
        pieChart.setExtraOffsets(5f, 10f, 5f, 5f)

        pieChart.setDragDecelerationFrictionCoef(0.95f)

        pieChart.setDrawHoleEnabled(false)
        pieChart.setHoleColor(Color.BLACK)
        pieChart.setTransparentCircleRadius(61f)

        val yValues = ArrayList<PieEntry>()

        yValues.add(PieEntry(54.73f, "道徳"))
        yValues.add(PieEntry(12.77f, "倫理"))
        yValues.add(PieEntry(13.08f, "理科"))
        yValues.add(PieEntry(12.36f, "数学"))
        yValues.add(PieEntry(7.06f, "英語"))


        val description = Description()
        description.setText("過去一年間やった教科の割合")

        description.setTextSize(20f)
        pieChart.setDescription(description)



        val dataSet = PieDataSet(yValues, "教科名")
        dataSet.sliceSpace = 3f
        dataSet.selectionShift = 5f
        dataSet.setColors(*ColorTemplate.JOYFUL_COLORS)

        val data = PieData(dataSet)
        data.setValueTextSize(10f)
        data.setValueTextColor(Color.BLACK)

        pieChart.setData(data)
    }

}