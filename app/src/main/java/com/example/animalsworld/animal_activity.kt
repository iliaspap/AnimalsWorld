package com.example.animalsworld

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
//import com.allilepidrasi.Animal.databinding.ActivityMainBinding

class animal_activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        //val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.animal_activity)

        val images = listOf(
            R.drawable.lion,
            R.drawable.lion
        )
        val adapter = ViewPagerAdapter(images)
        val viewer = findViewById<ViewPager2>(R.id.viewPager)
        viewer.adapter= adapter

    }
    fun back(view:View){
        val intent = Intent(this,Choose::class.java)
        startActivity(intent)
    }
}