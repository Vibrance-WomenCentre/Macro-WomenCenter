package com.example.womencenter

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.womencenter.ui.login_register.LoginActivty

/**
 * A simple [Fragment] subclass.
 * Use the [favPsikologFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class favPsikologFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fav_psikolog, container, false)

        val imageView = view.findViewById<ImageView>(R.id.ivAntoo)
        imageView.setOnClickListener {
            val intent = Intent(activity, LoginActivty::class.java)
            startActivity(intent)
        }
        return view
    }
}