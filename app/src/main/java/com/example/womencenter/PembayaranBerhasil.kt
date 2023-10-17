package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PembayaranBerhasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran_berhasil)

        val btnGoToHome = findViewById<Button>(R.id.btn_goToHome)
        btnGoToHome.setOnClickListener {
            // Tambahkan kode untuk mengarahkan pengguna ke beranda aplikasi
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}




