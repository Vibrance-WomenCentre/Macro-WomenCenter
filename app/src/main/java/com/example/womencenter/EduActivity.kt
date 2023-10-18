package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar

class EduActivity : AppCompatActivity() {
    private lateinit var myToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edu)

        myToolbar=findViewById(R.id.myToolbar)
        myToolbar.title = "Media Edukasi"
        setSupportActionBar(myToolbar)

        //looking for click-able
        val constraint1 = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.Selengkapnya1)
        constraint1.setOnClickListener {
            val intent1 = Intent(this, Edu2Activity::class.java)
            startActivity(intent1)
        }
        val constraint2 = findViewById<LinearLayout>(R.id.KlikArt1)
        constraint2.setOnClickListener {
            val intent2 = Intent(this, Edu4Activity::class.java)
            startActivity(intent2)
        }
        val constraint3 = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.Selengkapnya2)
        constraint3.setOnClickListener {
            val intent3 = Intent(this, Edu3Activity::class.java)
            startActivity(intent3)
        }
        val constraint4 = findViewById<LinearLayout>(R.id.KlikArt2)
        constraint4.setOnClickListener{
            val intent4 = Intent(this, Edu4Activity::class.java)
            startActivity(intent4)
        }
    }
}