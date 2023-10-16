package com.example.womencenter.ui.fragment_pengacara_psikologi

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.womencenter.R
import com.example.womencenter.ui.login_register.LoginActivty

/**
 * A simple [Fragment] subclass.
 * Use the [PsikologFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PsikologFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_psikolog, container, false)

        val imageView = view.findViewById<ImageView>(R.id.ivAnto)
        imageView.setOnClickListener {
            val intent = Intent(activity, LoginActivty::class.java)
            startActivity(intent)
        }
        return view
    }

}