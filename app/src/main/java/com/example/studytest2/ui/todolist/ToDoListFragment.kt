package com.example.studytest2.ui.todolist

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.studytest2.MokuhyounyuryokuActivity
import com.example.studytest2.TimeActivity
import com.example.studytest2.databinding.FragmentTargetBinding
import com.example.studytest2.databinding.FragmentTodolistBinding


class ToDoListFragment : Fragment() {

    private lateinit var toDoListViewModel: ToDoListViewModel


    private lateinit var binding: FragmentTodolistBinding
    // This property is only valid between onCreateView and
    // onDestroyView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentTodolistBinding.inflate(inflater, container, false)
        binding.imageButton.setOnClickListener {
            val intent = Intent(context, TimeActivity::class.java)
            startActivity(intent)


        }
        return binding.root
    }

}