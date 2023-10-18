package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar

class Edu2Activity : AppCompatActivity() {
    private lateinit var Edu2Toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edu2)

        Edu2Toolbar=findViewById(R.id.Edu2Toolbar)
        Edu2Toolbar.title = "Artikel Edukasi"
        setSupportActionBar(Edu2Toolbar)

        //looking for click-able
        val layout1 = findViewById<LinearLayout>(R.id.myToolbar)
        layout1.setOnClickListener{
            val inten1 = Intent(this, EduActivity::class.java)
            startActivity(inten1)
        }
        val layout2 = findViewById<LinearLayout>(R.id.KlikEdu2)
        layout2.setOnClickListener{
            val inten2 = Intent(this, Edu4Activity::class.java)
            startActivity(inten2)
        }

    }
}