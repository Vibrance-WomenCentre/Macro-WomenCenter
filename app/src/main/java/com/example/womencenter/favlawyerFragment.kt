package com.example.womencenter

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

/**
 * A simple [Fragment] subclass.
 * Use the [favlawyerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class favlawyerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favlawyer, container, false)

        val imageView = view.findViewById<ImageView>(R.id.ivVeraa)
        imageView.setOnClickListener {
            val intent = Intent(activity, Profile_Consult::class.java)
            startActivity(intent)
        }
        return view
    }
}
