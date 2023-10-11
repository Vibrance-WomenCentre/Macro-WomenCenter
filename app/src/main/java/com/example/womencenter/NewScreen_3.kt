package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NewScreen_3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_screen3)

        val btnNext : Button = findViewById(R.id.btn_next3)
        btnNext.setOnClickListener(this)

        val btnLewati : Button = findViewById(R.id.btn_lewati3)
        btnLewati.setOnClickListener(this)
    }

    override fun onClick(L: View) {
        when (L.id){
            R.id.btn_next3 -> {
                val ab = Intent(this@NewScreen_3, NewScreen_4::class.java)
            }
            R.id.btn_lewati3 -> {
                val ba = Intent(this@NewScreen_3, NewScreen_2::class.java)
            }
        }
    }
}