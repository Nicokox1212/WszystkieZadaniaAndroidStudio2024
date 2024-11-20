package com.example.lekcja7

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lekcja7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        with(binding) {
            button.setOnClickListener {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("email",editTextTextEmailAddress.text.toString())
                startActivity(intent)
            }
        }
    }
}