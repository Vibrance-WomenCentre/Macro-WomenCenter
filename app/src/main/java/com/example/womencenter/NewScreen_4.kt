package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.womencenter.ui.login_register.LoginActivty

class NewScreen_4 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_screen4)
        supportActionBar?.hide()

        val btnNext : Button = findViewById(R.id.btn_next4)
        btnNext.setOnClickListener(this)

        val btnLewati : Button = findViewById(R.id.btn_lewati4)
        btnLewati.setOnClickListener(this)
    }

    override fun onClick(L: View) {
        when (L.id){
            R.id.btn_next4 -> {
                val ab = Intent(this@NewScreen_4, LoginActivty::class.java)
                startActivity(ab)
            }
            R.id.btn_lewati4 -> {
                val ba = Intent(this@NewScreen_4, LoginActivty::class.java)
                startActivity(ba)
            }
        }
    }
}