package com.example.womencenter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class KonselorScreen : AppCompatActivity() {

    private lateinit var btnKonselorPengacara : Button
    private lateinit var btnKonselorPsikolog : Button
    private lateinit var btnBackKons : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konselor_screen)
        btnKonselorPengacara = findViewById(R.id.btn_pengacara_kon)
        btnKonselorPsikolog = findViewById(R.id.btn_psikolog_kon)
        btnBackKons = findViewById(R.id.btn_back_konse)

        btnKonselorPengacara.setOnClickListener {replaceFragment(favlawyerFragment()) }
        btnKonselorPsikolog.setOnClickListener {replaceFragment(favPsikologFragment())}

    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}