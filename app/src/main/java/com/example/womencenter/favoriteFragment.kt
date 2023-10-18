package com.example.womencenter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class favoriteFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_favorite, container, false)

        val showChildFragmentButton = view.findViewById<Button>(R.id.btn_psikologg)
        showChildFragmentButton.setOnClickListener {
            val childFragment = favPsikologFragment()
            childFragmentManager.beginTransaction()
                .replace(R.id.childFragmentContainer, childFragment)
                .addToBackStack(null)
                .commit()
        }

        val showChildFragmentButton1 = view.findViewById<Button>(R.id.btn_pengacaraa)
        showChildFragmentButton1.setOnClickListener {
            val childFragment = favlawyerFragment()
            childFragmentManager.beginTransaction()
                .replace(R.id.childFragmentContainer, childFragment)
                .addToBackStack(null)
                .commit()
        }
        return view

    }
}