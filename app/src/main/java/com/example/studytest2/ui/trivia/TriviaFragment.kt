package com.example.studytest2.ui.trivia

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.studytest2.ConcentrationActivity
import com.example.studytest2.EfficiencyActivity
import com.example.studytest2.RestActivity
import com.example.studytest2.databinding.FragmentTriviaBinding

class TriviaFragment : Fragment() {


    companion object {
        fun newInstance() = TriviaFragment()

    }
    private lateinit var binding: FragmentTriviaBinding
    private lateinit var viewModel: TriviaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTriviaBinding.inflate(inflater,container,false)
        binding.conButton.setOnClickListener {
            val intent = Intent(context ,ConcentrationActivity::class.java)
            startActivity(intent)
        }
        binding.efficiencyButton.setOnClickListener {
            val intent = Intent(context, EfficiencyActivity::class.java)
            startActivity(intent)
        }
        binding.restButton.setOnClickListener {
            val intent = Intent(context, RestActivity::class.java)
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



