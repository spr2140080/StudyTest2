package com.example.studytest2.ui.trivia

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.R
import com.example.teststudy1.ui.trivia.NavigationTriviaViewModel


class navigation_trivia : Fragment() {

    companion object {
        fun newInstance() = navigation_trivia()
    }

    private lateinit var viewModel: NavigationTriviaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.navigation_trivia_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NavigationTriviaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}