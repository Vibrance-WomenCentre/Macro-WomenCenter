package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class InformasiPengaduan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_pengaduan)
        supportActionBar?.hide()

        val btninfo: Button = findViewById(R.id.btn_info)
        btninfo.setOnClickListener {
            // Tambahkan logika yang ingin Anda jalankan saat tombol ditekan di sini
            val bb = Intent(this@InformasiPengaduan, AlurPengaduan::class.java)
            startActivity(bb)
        }
    }
}