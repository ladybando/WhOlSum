package com.example.android.wholsum.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

    //TODO add phrases to text views
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        /* show images that are stored in drawable in horizontal recycler view
        * this set of images shows places that donate food*/
        val imagePhotoList = listOf(R.drawable.cater, R.drawable.foodbank, R.drawable.restimages)
        val recyclerView = binding.wholsumRecyclerv
        val adapter = WholsumRecycleViewAdapter(imagePhotoList)
        recyclerView.adapter = adapter
        val horizontalLayoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = horizontalLayoutManager
        /*show next set of images stored in drawable in another horizontal recycler view
        * this set of images shows work done by app*/
        val supportImagePhotoList =
            listOf(R.drawable.mansitting, R.drawable.rollbread, R.drawable.giving, R.drawable.tombasil)
        val supportView = binding.wholsumSupportRecyclerv
        val supportAdapter = SupportRecyclerViewAdapter(supportImagePhotoList)
        supportView.adapter = supportAdapter
        val supportLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        supportView.layoutManager = supportLayoutManager
        onClick()
    }
    private fun onClick(){
        binding.bottomAppBar.setNavigationOnClickListener{

        }
        binding.bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId){
                R.id.login -> {
                    findNavController().navigate(R.id.action_mainLandingFragment_to_loginFragment)
                    true
                }
                R.id.register -> {
                    true
                }
                else -> false
            }
        }
    }
}