package com.example.myapplication

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var treeTextView: TextView
    private lateinit var grassTextView: TextView
    private lateinit var lewandowskiTextView: TextView
    private lateinit var numberInput: EditText
    private lateinit var quantityMessage: TextView
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicjalizowanie widoków
        treeTextView = findViewById(R.id.tree_text)
        grassTextView = findViewById(R.id.grass_text)
        lewandowskiTextView = findViewById(R.id.lewandowski_text)
        numberInput = findViewById(R.id.number_input)
        quantityMessage = findViewById(R.id.quantity_message)
        submitButton = findViewById(R.id.submit_button) // Jeśli masz przycisk

        // Sprawdzanie, który język jest ustawiony w systemie
        val language = Locale.getDefault().language

        // Ustawienie odpowiednich tłumaczeń w zależności od języka
        if (language == "pl") {
            treeTextView.text = getString(R.string.tree_nearby_pl)
            grassTextView.text = getString(R.string.grass_is_green_pl)
            lewandowskiTextView.text = getString(R.string.lewandowski_is_king_pl)
        } else {
            treeTextView.text = getString(R.string.tree_nearby)
            grassTextView.text = getString(R.string.grass_is_green)
            lewandowskiTextView.text = getString(R.string.lewandowski_is_king)
        }

        // Akcja przycisku, aby pobrać liczbę i wyświetlić komunikat
        submitButton.setOnClickListener {
            // Pobieranie liczby z EditText
            val inputText = numberInput.text.toString()
            val number = inputText.toIntOrNull() ?: 0 // Jeśli nie wprowadzono liczby, ustawia na 0

            // Pobranie komunikatu z plural strings w zależności od liczby
            val message = resources.getQuantityString(R.plurals.number_message, number, number)

            // Ustawienie tekstu w TextView
            quantityMessage.text = message
        }
    }
}
