package com.example.studyplace.MainFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.studyplace.R

class ForthFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       return inflater.inflate(R.layout.frgment_fourth, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_fourth1).setOnClickListener {
            findNavController().navigate(R.id.action_forthFragment_to_fragment_other1)
        }
        view.findViewById<Button>(R.id.button_fourth2).setOnClickListener {
            findNavController().navigate(R.id.action_forthFragment_to_fragment_21)
        }
        view.findViewById<Button>(R.id.button_fourth3).setOnClickListener {
            findNavController().navigate(R.id.action_forthFragment_to_fragment_other2)
        }
    }
}