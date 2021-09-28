package com.example.messageapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.messageapp.databinding.FragmentMessagesListBinding

class MessagesList : Fragment(R.layout.fragment_messages_list) {

    private var _binding : FragmentMessagesListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMessagesListBinding.inflate(inflater, container, false)
        return binding.root
    }

/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val messagesList = arrayListOf(
            "Oi",
            "Bom dia",
            "Boa tarde",
            "Boa noite",
            "Tchau")
        val listView = binding.listViewMessages
        val adapter = activity?.let { ArrayAdapter(it.baseContext, android.R.layout.simple_list_item_1, messagesList) }
        listView.adapter = adapter
        adapter?.notifyDataSetChanged()
    }
*/

    // to avoid memory leaks
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}