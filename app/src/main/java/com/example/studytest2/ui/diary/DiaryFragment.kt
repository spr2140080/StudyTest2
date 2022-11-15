package com.example.studytest2.ui.diary

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.R
import com.example.studytest2.ui.diary.DiaryViewModel
import com.example.teststudy1.ui.trivia.TriviaViewModel


class DiaryFragment: Fragment() {

    companion object {
        fun newInstance() = DiaryFragment()
    }

    private lateinit var viewModel: DiaryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_diary, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DiaryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}