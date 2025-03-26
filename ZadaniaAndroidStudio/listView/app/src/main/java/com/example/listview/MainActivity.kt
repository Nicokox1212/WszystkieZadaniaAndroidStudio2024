package com.example.listview




import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var productList: MutableList<String>
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Użycie View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicjalizacja listy produktów
        productList = mutableListOf()

        // Tworzenie adaptera i ustawienie go na ListView
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, productList)
        binding.listViewProducts.adapter = adapter

        // Obsługa kliknięcia przycisku "Dodaj"
        binding.buttonAddProduct.setOnClickListener {
            val product = binding.editTextProduct.text.toString().trim()

            // Walidacja, aby nie dodawać pustych wpisów
            if (product.isNotEmpty()) {
                productList.add(product)
                adapter.notifyDataSetChanged() // Odświeżenie listy
                Toast.makeText(this, "Produkt dodany: $product", Toast.LENGTH_SHORT).show()
                binding.editTextProduct.setText("") // Wyczyść pole EditText
            } else {
                Toast.makeText(this, "Wpisz nazwę produktu", Toast.LENGTH_SHORT).show()
            }
        }

        // Obsługa kliknięcia na element listy
        binding.listViewProducts.setOnItemClickListener { _, _, position, _ ->
            val removedProduct = productList.removeAt(position)
            adapter.notifyDataSetChanged() // Odświeżenie listy
            Toast.makeText(this, "Produkt usunięty: $removedProduct", Toast.LENGTH_SHORT).show()
        }
    }
}
