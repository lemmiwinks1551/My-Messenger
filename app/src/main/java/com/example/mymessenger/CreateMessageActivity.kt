package com.example.mymessenger

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class CreateMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
    }

    //Вызвать onSendMessage() при щелчке на кнопке
    fun onSendMessage(view: View) {
        // Создать явный интент для запуска активности ReceiveMessage
        val intent = Intent(this, ReceiveMessageActivity::class.java)
        // Создать экземпляр EditView
        val messageView = findViewById<View>(R.id.message) as EditText
        // Получить строковое значения из поля text messageView
        val messageText = messageView.text.toString()
        // Добавить в интент информацию о тексте messageView
        intent.putExtra(ReceiveMessageActivity().EXTRA_MESSAGE, messageText)
        // Запустить активность из интента
        startActivity(intent)
    }
}