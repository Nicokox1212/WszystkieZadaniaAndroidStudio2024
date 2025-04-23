package com.example.a4bt_powtorzenie

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a4bt_powtorzenie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        var listaZadan = arrayListOf<String>()
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listaZadan)
        with(binding){
            listView.adapter = arrayAdapter
            button.setOnClickListener{
                listaZadan.add(editTextText.text.toString())
                arrayAdapter.notifyDataSetChanged()
            }
        }
    }
}