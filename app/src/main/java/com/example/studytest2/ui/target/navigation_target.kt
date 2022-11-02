package com.example.studytest2.ui.target

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.R
import com.example.teststudy1.ui.target.NavigationTargetViewModel


class navigation_target : Fragment() {

    companion object {
        fun newInstance() = navigation_target()
    }

    private lateinit var viewModel: NavigationTargetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.navigation_target_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NavigationTargetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}