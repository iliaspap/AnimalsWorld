package com.example.animalsworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import android.content.Intent
import android.view.View
import android.widget.ImageButton


class Choose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        val lion = findViewById<ImageButton>(R.id.image1)
        lion.setOnClickListener {
            val intent = Intent(this, animal_activity::class.java).apply{}
            startActivity(intent)
        }

    }
    fun back(view: View){
        val intent = Intent(this,Categories::class.java)
        startActivity(intent)
    }
}