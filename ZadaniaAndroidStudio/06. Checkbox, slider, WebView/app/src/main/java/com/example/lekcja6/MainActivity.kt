package com.example.lekcja6

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lekcja6.databinding.ActivityMainBinding
import com.example.lekcja6.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        val binding2 = ActivitySecondBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        with (binding){
            buttonStrona.setOnClickListener {
                setContentView(binding2.root)
            }

        }
        binding2.webview.getSettings().setJavaScriptEnabled(true)
        binding2.webview.loadUrl("https://infotech.edu.pl")

        binding.checkBox.setOnClickListener {
            if (binding.checkBox.isChecked) {
                binding.editTextText3.visibility = View.VISIBLE
            } else {
                binding.editTextText3.visibility = View.GONE
            }
        }
    }
}