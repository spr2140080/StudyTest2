package com.example.studytest2.ui.trivia

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.*
import com.example.studytest2.databinding.FragmentTargetBinding
import com.example.studytest2.databinding.FragmentTriviaBinding
import com.example.teststudy2.ui.trivia.TriviaViewModel


class TriviaFragment : Fragment() {

    companion object {
        fun newInstance() = TriviaFragment()
    }

    private lateinit var viewModel: TriviaViewModel
    private lateinit var binding: FragmentTriviaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTriviaBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            val intent = Intent(context, RestActivity::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            val intent = Intent(context, ConcentrationActivity::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent = Intent(context, EfficiencyActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TriviaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}