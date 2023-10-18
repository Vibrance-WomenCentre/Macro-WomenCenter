package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar

class Edu5Activity : AppCompatActivity() {
    private lateinit var myToolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edu5)

        myToolbar=findViewById(R.id.Edu3Toolbar)
        myToolbar.title = "Vidio Edukasi"
        setSupportActionBar(myToolbar)

        //looking for click-able
        val layout1 = findViewById<LinearLayout>(R.id.myToolbar)
        layout1.setOnClickListener {
            val inten1 = Intent(this, Edu3Activity::class.java)
            startActivity(inten1)
        }
    }
}