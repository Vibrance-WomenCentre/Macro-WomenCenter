package com.example.womencenter.ui.fragment_pengacara_psikologi

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.womencenter.Profile_Consult
import com.example.womencenter.R
import com.example.womencenter.ui.login_register.LoginActivty

/**
 * A simple [Fragment] subclass.
 * Use the [PengacaraFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PengacaraFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pengacara, container, false)

        val imageView = view.findViewById<ImageView>(R.id.ivVera)
        imageView.setOnClickListener {
            val intent = Intent(activity, Profile_Consult::class.java)
            startActivity(intent)
        }
        return view
    }
}