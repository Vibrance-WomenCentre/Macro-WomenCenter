package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.womencenter.ui.login_register.LoginActivty

class NewUser : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)
        supportActionBar?.hide()

        val btnNext : Button = findViewById(R.id.btn_next)
        btnNext.setOnClickListener(this)

        val btnLewati : Button = findViewById(R.id.btn_lewati)
        btnLewati.setOnClickListener(this)
    }

    override fun onClick(L: View) {
        when (L.id){
            R.id.btn_next -> {
                val ab = Intent(this@NewUser, NewScreen_2::class.java)
                startActivity(ab)
            }
            R.id.btn_lewati -> {
                val ba = Intent(this@NewUser, LoginActivty::class.java)
                startActivity(ba)
            }
        }

    }
}

