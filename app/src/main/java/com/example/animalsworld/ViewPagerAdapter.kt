package com.example.animalsworld

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.animalsworld.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPagerAdapter (val images: List<Int>) :RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    //private lateinit var binding: ResultProfileBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent, false )
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage=images[position]
        holder.itemView.ivImage.setImageResource(curImage)
    }

}