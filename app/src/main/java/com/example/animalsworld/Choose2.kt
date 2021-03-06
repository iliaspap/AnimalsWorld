package com.example.animalsworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Choose2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose2)
    }
    fun back(view: View){
        val intent = Intent(this,Categories::class.java)
        startActivity(intent)
    }
    fun prev(view: View){
        val intent = Intent(this,Choose::class.java)
        startActivity(intent)
    }
}