package com.example.womencenter

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import com.example.womencenter.NewUser
import com.example.womencenter.R
import com.example.womencenter.ui.login_register.LoginActivty

class ChatActivity : AppCompatActivity() {
    private lateinit var chatScrollView: ScrollView
    private lateinit var chatLayout: LinearLayout
    private lateinit var messageInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        supportActionBar?.hide()

        chatScrollView = findViewById(R.id.chatScrollView)
        chatLayout = findViewById(R.id.chatLayout)
        messageInput = findViewById(R.id.messageInput)

        val sendButton: Button = findViewById(R.id.sendButton)
        sendButton.setOnClickListener {
            val messageText = messageInput.text.toString().trim()
            if (messageText.isNotEmpty()) {
                val messageTextView = TextView(this)
                messageTextView.text = messageText
                messageTextView.setTextColor(Color.BLACK)
                chatLayout.addView(messageTextView)
                messageInput.text.clear()
                chatScrollView.post { chatScrollView.fullScroll(ScrollView.FOCUS_DOWN) }
            }
        }

        // Kode ini harus ditempatkan di luar onCreate
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btn_next4 -> {
                val intent = Intent(this@ChatActivity, LoginActivty::class.java)
                startActivity(intent)
            }
            R.id.btn_lewati4 -> {
                val intent = Intent(this@ChatActivity, LoginActivty::class.java)
                startActivity(intent)
            }
        }
    }
}
