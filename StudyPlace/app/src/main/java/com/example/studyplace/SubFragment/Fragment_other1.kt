package com.example.studyplace.SubFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studyplace.R

class Fragment_other1:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):View?{
        return inflater.inflate(R.layout.layout_other_ps, container, false)
    }
}