package com.example.thecheezery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent


class welcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        val btnGoRegister = findViewById<Button>(R.id.btnSignIn)
        btnGoRegister.setOnClickListener {
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }

    }
}