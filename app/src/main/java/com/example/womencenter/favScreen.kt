package com.example.womencenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class favScreen : AppCompatActivity() {

    private lateinit var btnFavPengacara : Button
    private lateinit var btnFavPsikolog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fav_screen)
        btnFavPengacara = findViewById(R.id.btn_pengacara_fav)
        btnFavPsikolog = findViewById(R.id.btn_psikolog_fav)

        btnFavPengacara.setOnClickListener {replaceFragment(favlawyerFragment())}
        btnFavPsikolog.setOnClickListener { replaceFragment(favPsikologFragment())}
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}