package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.womencenter.ui.login_register.LoginActivty

class Call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)
        supportActionBar?.hide()

        val btncallend: ImageButton = findViewById(R.id.callBatalButton)
        btncallend.setOnClickListener {
            // Tambahkan logika yang ingin Anda jalankan saat tombol ditekan di sini
            val bb = Intent(this@Call, ChatActivity::class.java)
            startActivity(bb)
        }
    }
}

