package com.example.fragmenttofragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentB.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentB : Fragment() {

    var inputText: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_b, container, false)
        inputText = arguments?.getString("input_txt")
        if(inputText=="")
            rootView.displayMessage.text="Empty input"
        else
        rootView.displayMessage.text = inputText

        return rootView
    }
    }

