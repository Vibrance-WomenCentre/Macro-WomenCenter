package com.example.womencenter.ui.login_register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.womencenter.R

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnregistr: Button =  findViewById(R.id.btn_register)
        btnregistr.setOnClickListener(this)
    }

    override fun onClick(p: View) {
        when(p.id) {
            R.id.btn_register -> {
                val bb = Intent(this@RegisterActivity, LoginActivty::class.java)
                startActivity(bb)
            }
        }
    }
}