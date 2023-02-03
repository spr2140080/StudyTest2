package com.example.studytest2.ui.trivia

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.R
import com.example.teststudy2.ui.trivia.TriviaViewModel


class TriviaFragment : Fragment() {

    companion object {
        fun newInstance() = TriviaFragment()
    }

    private lateinit var viewModel: TriviaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_trivia, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TriviaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}