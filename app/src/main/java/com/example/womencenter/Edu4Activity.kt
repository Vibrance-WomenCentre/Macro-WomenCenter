package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar

class Edu4Activity : AppCompatActivity() {
    private lateinit var Edu2Toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edu4)

        Edu2Toolbar=findViewById(R.id.Edu2Toolbar)
        Edu2Toolbar.title = "Artikel Edukasi"
        setSupportActionBar(Edu2Toolbar)

        //looking for click-able
        val layout1 = findViewById<LinearLayout>(R.id.myToolbar)
        layout1.setOnClickListener{
            val inten1 = Intent(this, Edu2Activity::class.java)
            startActivity(inten1)
        }
    }
}