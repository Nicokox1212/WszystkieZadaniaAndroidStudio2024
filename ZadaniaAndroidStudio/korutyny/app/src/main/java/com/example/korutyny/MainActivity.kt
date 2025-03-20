package com.example.korutyny

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.korutyny.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        var time : Long = System.currentTimeMillis()
        var sekunda = 0
        var numer = 0
        lifecycleScope.launch {
            while (true) {
                binding.textView1.text = sekunda.toString()
                delay(1000)
                sekunda += 1
            }
        }
        lifecycleScope.launch {
            while (true) {
            val time2: Long = System.currentTimeMillis()
            binding.textView2.text = (time2 - time).toString()
            delay(10)
            }

        }
        binding.button1.setOnClickListener{
            sekunda = 0
            binding.textView1.text = sekunda.toString()
    }
        binding.button2.setOnClickListener{
            time = System.currentTimeMillis()
        }
        binding.button3.setOnClickListener{
            numer = numer + 1
            val time2: Long = System.currentTimeMillis()
            binding.textView3.text = binding.textView3.text.toString() + "\n"+numer.toString()+":"+ (time2 - time).toString()
        }
    }
}