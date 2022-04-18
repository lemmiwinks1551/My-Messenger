package com.example.mymessenger

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ReceiveMessageActivity : AppCompatActivity() {
    // Создать константу с именем данных для получения
    val EXTRA_MESSAGE = "message"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)
        // Получить интент в инстанс
        val intent = intent
        // Получить текст из интента по имени данных из константы
        val messageText = intent.getStringExtra(EXTRA_MESSAGE)
        // Создать TextView
        val messageView = findViewById<View>(R.id.message) as TextView
        // Установить в TextView полученный из интента текст
        messageView.text = messageText
    }
}