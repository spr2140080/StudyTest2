package com.example.studytest2.ui.target
import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studytest2.BouGraphActivity
import com.example.studytest2.EnGraphActivity
import com.example.studytest2.MokuhyounyuryokuActivity
import com.example.studytest2.TimeActivity
//import com.example.studytest2.MokuhyounyuryokuActivity
import com.example.studytest2.databinding.FragmentTargetBinding
import com.example.studytest2.ui.graph.GraphViewModel
import com.example.studytest2.ui.todolist.ToDoListViewModel
//import com.example.teststudy1.ui.target.TargetViewModel
import com.example.teststudy2.ui.target.TargetViewModel


class TargetFragment : Fragment() {

    companion object {
        fun newInstance() = TargetFragment()
    }

    private lateinit var binding: FragmentTargetBinding
    private lateinit var viewModel: TargetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTargetBinding.inflate(inflater, container, false)
        binding.target.setOnClickListener {
            val intent = Intent(context,MokuhyounyuryokuActivity::class.java)
            startActivity(intent)

        }
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TargetViewModel::class.java)
        // TODO: Use the ViewModel
    }
}