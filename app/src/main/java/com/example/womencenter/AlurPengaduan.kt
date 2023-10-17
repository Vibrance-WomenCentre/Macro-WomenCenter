package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlurPengaduan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alur_pengaduan)
        supportActionBar?.hide()

        val btninfo: Button = findViewById(R.id.btn_back)
        btninfo.setOnClickListener {
            // Tambahkan logika yang ingin Anda jalankan saat tombol ditekan di sini
            val bb = Intent(this@AlurPengaduan, InformasiPengaduan::class.java)
            startActivity(bb)
        }
    }
}