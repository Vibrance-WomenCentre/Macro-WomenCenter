package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.womencenter.R.id.btn_Jadwal

class Profile_Consult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_consult)

        val btnSetJadwal = findViewById<Button>(R.id.btn_Jadwal)
        btnSetJadwal.setOnClickListener {
            val intent = Intent(this@Profile_Consult, MetodePembayaran::class.java)
            startActivity(intent)
        }
    }
}