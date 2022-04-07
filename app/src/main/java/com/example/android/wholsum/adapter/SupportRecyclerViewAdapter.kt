package com.example.android.wholsum.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.wholsum.databinding.SupportLandingLayoutBinding

class SupportRecyclerViewAdapter(private val supportPhotoList: List<Int>) : RecyclerView.Adapter<SupportViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SupportViewHolder {
        return SupportViewHolder(SupportLandingLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SupportViewHolder, position: Int) {
        holder.wholsumBankImage.setImageResource(supportPhotoList[position])
    }

    override fun getItemCount(): Int = supportPhotoList.size
}

class SupportViewHolder(private var binding: SupportLandingLayoutBinding):RecyclerView.ViewHolder(binding.root) {
    val wholsumBankImage  = binding.foodBankImage
}
