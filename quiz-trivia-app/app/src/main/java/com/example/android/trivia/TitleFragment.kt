package com.example.android.trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.trivia.databinding.FragmentTitleBinding

class TitleFragment : Fragment(R.layout.fragment_title) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /** Inflates a binding layout and returns the newly-created binding for that layout. */
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)


        return binding.root
    }
}