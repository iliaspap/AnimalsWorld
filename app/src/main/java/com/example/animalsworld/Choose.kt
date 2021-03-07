package com.example.animalsworld

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.ImageButton


class Choose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        val lion = findViewById<ImageButton>(R.id.image1)
        lion.setOnClickListener {
            val intent = Intent(this, animal_activity::class.java)
            startActivity(intent)
        }
        val Prefs = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedBoolean = Prefs.getBoolean("BOOLEAN_KEY",false)
        if(savedBoolean){
            val star1 = findViewById<ImageView>(R.id.imageView7)
            star1.setImageResource(android.R.drawable.btn_star_big_on)
        }
    }
    fun back(view: View){
        val intent = Intent(this,Categories::class.java)
        startActivity(intent)
    }

    fun next(view: View){
        val intent = Intent(this, Choose2::class.java)
        startActivity(intent)
    }
}