package com.example.lekcja7

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lekcja7.databinding.ActivityMain2Binding
import com.example.lekcja7.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain2Binding .inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        val tekst = intent.getStringExtra("email")
        with(binding){
            textView2.text = tekst

           }

        }
    }
