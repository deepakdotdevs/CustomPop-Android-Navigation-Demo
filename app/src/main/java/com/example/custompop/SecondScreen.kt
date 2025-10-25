package com.example.custompop

import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_screen)

        val toast = Toast(this)

        val view = TextView(this).apply {
            text = "Successfully Clicked!!"
            setTextColor(Color.CYAN)
            setBackgroundColor(Color.BLACK)
            setPadding(32, 16, 32, 16)
        }

        toast.view = view
        toast.duration = Toast.LENGTH_SHORT
        toast.show()


        val Buttonsecond: Button = findViewById(R.id.button)
        Buttonsecond.setOnClickListener { v ->
            finish()
        }
    }
}