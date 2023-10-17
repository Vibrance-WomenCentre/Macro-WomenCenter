package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class KonfirmasiBayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_bayar)
        supportActionBar?.hide()

        CoroutineScope(Dispatchers.Main).launch {
            delay(4000)
            val intent = Intent(this@KonfirmasiBayar, PembayaranBerhasil::class.java)
            startActivity(intent)
            finish()
        }
    }
}


