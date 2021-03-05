package com.example.animalsworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import android.content.Intent
import android.widget.ImageButton


class Choose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        val Cat0 = findViewById<ImageButton>(R.id.image1)
        Cat0.setOnClickListener {
            val intent = Intent(this, animal_activity::class.java).apply{}
            startActivity(intent)
        }
    }

}