package com.example.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class registerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Referencias a los elementos del layout
        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtApellido = findViewById<EditText>(R.id.txtApellido)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val txtContrasenia = findViewById<EditText>(R.id.txtContrasenia)
        val checkTerminos = findViewById<CheckBox>(R.id.checkTerminos)
        val btnSignIn = findViewById<Button>(R.id.btnSignIn)

        btnSignIn.setOnClickListener {

                // Abrir ElegirActivity
                val intent = Intent(this, ElegirActivity::class.java)
                startActivity(intent)

        }
    }
}
