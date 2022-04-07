package com.example.android.wholsum.ui


import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.wholsum.R
import com.example.android.wholsum.adapter.SupportRecyclerViewAdapter
import com.example.android.wholsum.adapter.WholsumRecycleViewAdapter
import com.example.android.wholsum.databinding.FragmentMainLandingBinding


class MainLandingFragment : Fragment() {
    private var _binding: FragmentMainLandingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMainLandingBinding.inflate(inflater, container, false)
        return binding.root
    }

    //TODO add image to top half of screen; potentially cover toolbar
    //TODO add phrases to text views
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imagePhotoList = listOf(R.drawable.cater, R.drawable.foodbank, R.drawable.restimages)
        val recyclerView = binding.wholsumRecyclerv
        val adapter = WholsumRecycleViewAdapter(imagePhotoList)
        recyclerView.adapter = adapter
        val horizontalLayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = horizontalLayoutManager

        val supportImagePhotoList =
            listOf(R.drawable.mansitting, R.drawable.pasta, R.drawable.giving, R.drawable.tombasil)
        val supportView = binding.wholsumSupportRecyclerv
        val supportAdapter = SupportRecyclerViewAdapter(supportImagePhotoList)
        supportView.adapter = supportAdapter
        val supportLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        supportView.layoutManager = supportLayoutManager
    }
}