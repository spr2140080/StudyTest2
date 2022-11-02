package com.example.studytest2.ui.target

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.R
import com.example.teststudy1.ui.target.TargetViewModel


class TargetFragment : Fragment() {

    companion object {
        fun newInstance() = TargetFragment()
    }

    private lateinit var viewModel: TargetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_target, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TargetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}