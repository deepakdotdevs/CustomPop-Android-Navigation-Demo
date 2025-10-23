package com.example.custompop

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var Button1 = findViewById<Button>(R.id.buttonone)
        Button1.setOnClickListener { v ->
            val intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
        }
    }
}