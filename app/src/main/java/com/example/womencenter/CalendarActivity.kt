package com.example.womencenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.womencenter.ui.fragment_pengacara_psikologi.PengacaraFragment
import com.example.womencenter.ui.fragment_pengacara_psikologi.PsikologFragment

class CalendarActivity : AppCompatActivity() {

    private lateinit var btnPengacara : Button
    private lateinit var btnPsikolog : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        btnPengacara = findViewById(R.id.btn_pengacara)
        btnPsikolog = findViewById(R.id.btn_psikolog)

        btnPengacara.setOnClickListener{replaceFragment(PengacaraFragment())}
        btnPsikolog.setOnClickListener{replaceFragment(PsikologFragment())}
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()

    }
}