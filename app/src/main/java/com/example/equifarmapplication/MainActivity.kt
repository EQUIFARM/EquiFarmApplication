package com.example.equifarmapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.equifarmapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the layout resource for this activity

        // Find the TextView by its ID and set text
        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Hello, World!"
    }
}
