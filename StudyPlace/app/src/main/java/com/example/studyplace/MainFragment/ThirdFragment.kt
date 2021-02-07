package com.example.studyplace.MainFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.studyplace.R

class ThirdFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_third, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_third1).setOnClickListener{
            findNavController().navigate(R.id.action_thirdFragment_to_fragment23_1)
        }
        view.findViewById<Button>(R.id.button_third2).setOnClickListener{
            findNavController().navigate(R.id.action_thirdFragment_to_fragment23_2)
        }
        view.findViewById<Button>(R.id.button_third3).setOnClickListener{
            findNavController().navigate(R.id.action_thirdFragment_to_fragment23_3)
        }
    }
}

