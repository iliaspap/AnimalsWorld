package com.example.animalsworld

import android.content.Context
import android.content.Intent
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.coroutines.delay
import java.lang.Exception

class animal_activity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal_activity)

        val images = listOf(
            R.drawable.lion,
            R.drawable.lion2
        )
        val adapter = ViewPagerAdapter(images)
        val viewer = findViewById<ViewPager2>(R.id.viewPager)
        viewer.adapter = adapter
        val but = findViewById<ImageView>(R.id.imageView11)
        Handler().postDelayed({
            but.visibility = View.GONE
        }, 2000)
    }
    fun back(view:View){
        val intent = Intent(this,Choose::class.java)
        startActivity(intent)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun play_Sound(view: View){
        val url = "https://firebasestorage.googleapis.com/v0/b/animalsworld1-98d4c.appspot.com/o/sounds%2Flion.mp3?alt=media&token=978d2be6-3f80-4815-bf9f-99ab87b6202f"
        try {
            val mediaPlayer = MediaPlayer().apply {
                AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
                setDataSource(url)
                prepare()
                start()
            }
        }catch(e: Exception){
            Log.d("Fail", "Fail to play sound")
        }
    }
    fun play_info(view: View){
        val Prefs = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val editor = Prefs.edit()
        editor.apply {
            putBoolean("BOOLEAN_KEY", true)
        }.apply()
    }
}