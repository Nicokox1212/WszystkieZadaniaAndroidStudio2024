package com.example.lekcja5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            // Przełącz na layout do wprowadzania e-maila
            setContentView(R.layout.email_layout)

            // Obsługa widoków w email_layout
            val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
            val textView2 = findViewById<TextView>(R.id.textView2)
            val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

            buttonSubmit.setOnClickListener {
                val email = editTextEmail.text.toString()
                textView2.text = if (email.isNotEmpty()) {
                    "Twój adres e-mail to: $email"
                } else {
                    "Proszę podać adres e-mail."
                }
                textView2.visibility = View.VISIBLE
            }
        }
    }
}