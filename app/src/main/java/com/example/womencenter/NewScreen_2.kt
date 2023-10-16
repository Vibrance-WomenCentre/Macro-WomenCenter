package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.womencenter.ui.login_register.LoginActivty

class NewScreen_2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_screen2)
        supportActionBar?.hide()

        val btnNext : Button = findViewById(R.id.btn_next2)
        btnNext.setOnClickListener(this)

        val btnLewati : Button = findViewById(R.id.btn_lewati2)
        btnLewati.setOnClickListener(this)
    }

    override fun onClick(L: View) {
        when (L.id){
            R.id.btn_next2 -> {
                val ab = Intent(this@NewScreen_2, NewScreen_3::class.java)
                startActivity(ab)
            }
            R.id.btn_lewati2 -> {
                val ba = Intent(this@NewScreen_2, LoginActivty::class.java)
                startActivity(ba)
            }
        }
    }
}