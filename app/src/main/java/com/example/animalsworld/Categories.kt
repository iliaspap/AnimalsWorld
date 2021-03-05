package com.example.animalsworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        val Cat0 = findViewById<ImageView>(R.id.imageView)
        Cat0.setOnClickListener {
            val intent = Intent(this, Choose::class.java).apply{}
            startActivity(intent)
        }
    }
}