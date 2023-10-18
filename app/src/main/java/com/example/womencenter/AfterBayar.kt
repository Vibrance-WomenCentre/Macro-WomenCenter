package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class AfterBayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_bayar)

        val btncallend: Button = findViewById(R.id.btn_calll)
        btncallend.setOnClickListener {

            val bb = Intent(this@AfterBayar, Call::class.java)
            startActivity(bb)
        }

        val btnchat: Button = findViewById(R.id.btn_cht)
        btnchat.setOnClickListener {

            val bb = Intent(this@AfterBayar, ChatActivity::class.java)
            startActivity(bb)
        }
    }
}