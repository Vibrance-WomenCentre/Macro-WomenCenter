package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.womencenter.ui.login_register.LoginActivty

class NewScreen_3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_screen3)
        supportActionBar?.hide()

        val btnNext : Button = findViewById(R.id.btn_next3)
        btnNext.setOnClickListener(this)

        val btnLewati : Button = findViewById(R.id.btn_lewati3)
        btnLewati.setOnClickListener(this)
    }

    override fun onClick(L: View) {
        when (L.id){
            R.id.btn_next3 -> {
                val ab = Intent(this@NewScreen_3, NewScreen_4::class.java)
                startActivity(ab)
            }
            R.id.btn_lewati3 -> {
                val ba = Intent(this@NewScreen_3, LoginActivty::class.java)
                startActivity(ba)
            }
        }
    }
}