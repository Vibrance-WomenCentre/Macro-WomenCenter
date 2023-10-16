package com.example.womencenter.ui.login_register

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.womencenter.CalendarActivity
import com.example.womencenter.R

class LoginActivty : AppCompatActivity(), View.OnClickListener {
    private lateinit var etusername : EditText
    private lateinit var etpassword : EditText
    private lateinit var history : TextView

    val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data : Intent? = result.data
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activty)


        etusername = findViewById(R.id.edt_username)
        etpassword = findViewById(R.id.edt_password)

        val bundle: Bundle? = intent.extras
        if(bundle != null){
            etusername.setText(bundle.getString("username"))
            etpassword.setText(bundle.getString("password"))
        }

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)

        val btndaftar: TextView = findViewById(R.id.textView3)
        btndaftar.setOnClickListener(this)

    }

    override fun onClick(L: View) {
        when(L.id) {
            R.id.btn_login -> {
                val kiki = Intent(this@LoginActivty, CalendarActivity::class.java)
                resultLauncher.launch(kiki)
            }
            R.id.textView3 -> {
                val aa = Intent(this@LoginActivty, RegisterActivity::class.java)
                resultLauncher.launch(aa)
            }
        }
    }
}