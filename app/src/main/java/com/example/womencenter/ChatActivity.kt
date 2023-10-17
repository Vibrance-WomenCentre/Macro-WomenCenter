package com.example.womencenter

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView

class ChatActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var sendButton: Button
    private lateinit var messageInput: EditText
    private lateinit var chatScrollView: ScrollView
    private lateinit var btnCall: Button  // Tambahkan ini untuk tombol "btn_call"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        supportActionBar?.hide()

        // Inisialisasi tampilan
        sendButton = findViewById(R.id.sendButton)
        messageInput = findViewById(R.id.messageInput)
        chatScrollView = findViewById(R.id.chatScrollView)
        btnCall = findViewById(R.id.btn_call)  // Inisialisasi tombol "btn_call"

        // Atur pendengar klik untuk tombol kirim
        sendButton.setOnClickListener {
            // Tangani pengiriman pesan
            sendMessage()
        }

        // Tambahkan pendengar klik untuk tombol "btn_call"
        btnCall.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_call -> {
                val intent = Intent(this@ChatActivity, Call::class.java) // Ganti dengan nama aktivitas yang sesuai
                startActivity(intent)
            }
        }
    }

    private fun sendMessage() {
        val messageText = messageInput.text.toString().trim()
        if (messageText.isNotEmpty()) {
            messageInput.text.clear()
        }
    }
}
