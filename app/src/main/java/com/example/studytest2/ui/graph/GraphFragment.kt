package com.example.studytest2.ui.graph

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.BouGraphActivity
import com.example.studytest2.EnGraphActivity
//import com.example.studytest2.BouGraphActivity
//import com.example.studytest2.EnGraphActivity

import com.example.studytest2.databinding.FragmentGraphBinding


class GraphFragment : Fragment() {


    companion object {
        fun newInstance() = GraphFragment()

    }
    private lateinit var binding: FragmentGraphBinding
    private lateinit var viewModel: GraphViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGraphBinding.inflate(inflater,container,false)
        binding.boubutton.setOnClickListener {
            val intent = Intent(context , BouGraphActivity::class.java)
            startActivity(intent)
        }
        binding.enbutton.setOnClickListener {
            val intent = Intent(context, EnGraphActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GraphViewModel::class.java)
        // TODO: Use the ViewModel

    }

}



