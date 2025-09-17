package com.example.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ElegirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elegir)

        val btnColdDrinks = findViewById<Button>(R.id.btnColdDrinks)
        val btnHotDrinks = findViewById<Button>(R.id.btnHotDrinks)
        val btnSweets = findViewById<Button>(R.id.btnSweets)
        val btnSalties = findViewById<Button>(R.id.btnSalties)

        btnColdDrinks.setOnClickListener { openProductos("cold") }
        btnHotDrinks.setOnClickListener { openProductos("hot") }
        btnSweets.setOnClickListener { openProductos("sweets") }
        btnSalties.setOnClickListener { openProductos("salties") }
    }

    private fun openProductos(category: String) {
        val intent = Intent(this, ProductosActivity::class.java)
        intent.putExtra("category", category)
        startActivity(intent)
    }
}
