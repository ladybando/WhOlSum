package com.example.android.wholsum.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.wholsum.databinding.LandingLayoutBinding

class WholsumRecycleViewAdapter(private val photoList: List<Int>) : RecyclerView.Adapter<WholsumRecycleViewAdapter.WholsumViewHolder>() {

    class WholsumViewHolder(private var binding: LandingLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val wholsumCaterImage = binding.caterImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WholsumViewHolder {
        return WholsumViewHolder(
            LandingLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: WholsumViewHolder, position: Int) {
       holder.wholsumCaterImage.setImageResource(photoList[position])

    }

    override fun getItemCount(): Int = photoList.size
}