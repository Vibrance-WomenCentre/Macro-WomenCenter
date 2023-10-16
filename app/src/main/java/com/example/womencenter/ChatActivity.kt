package com.example.womencenter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView

class ChatActivity : AppCompatActivity() {
    // Deklarasi variabel-variabel dan view yang diperlukan
    private lateinit var chatScrollView: ScrollView
    private lateinit var chatLayout: LinearLayout
    private lateinit var messageInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        // Inisialisasi view
        chatScrollView = findViewById(R.id.chatScrollView)
        chatLayout = findViewById(R.id.chatLayout)
        messageInput = findViewById(R.id.messageInput)

        // Set listener untuk tombol kirim pesan
        val sendButton: Button = findViewById(R.id.sendButton)
        sendButton.setOnClickListener {
            val messageText = messageInput.text.toString().trim()
            if (messageText.isNotEmpty()) {
                // Buat TextView untuk pesan baru
                val messageTextView = TextView(this)
                messageTextView.text = messageText
                messageTextView.setTextColor(Color.BLACK)

                // Tambahkan pesan ke dalam layout chat
                chatLayout.addView(messageTextView)

                // Reset input teks
                messageInput.text.clear()

                // Scroll ke bawah untuk menampilkan pesan terbaru
                chatScrollView.post { chatScrollView.fullScroll(ScrollView.FOCUS_DOWN) }
            }
        }
    }
}
