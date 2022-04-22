package com.example.android.wholsum.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.wholsum.R

class RegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

  /*
  fun showPassword(){
    showHideBtn.setOnClickListener {
        if(showHideBtn.text.toString().equals("Show")){
            pwd.transformationMethod = HideReturnsTransformationMethod.getInstance()
            showHideBtn.text = "Hide"
        } else{
            pwd.transformationMethod = PasswordTransformationMethod.getInstance()
            showHideBtn.text = "Show"
        }
     }
    }*/
}