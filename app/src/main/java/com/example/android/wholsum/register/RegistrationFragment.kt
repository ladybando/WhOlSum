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
//TODO add onclick listener to drawable https://stackoverflow.com/questions/33650575/click-listener-for-drawableleft-in-edittext-in-android
  /*
  fun showPassword(){
  val editText = binding.tvPassword
    editText.setOnTouchListener(new OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        final int DRAWABLE_LEFT = 0;
        final int DRAWABLE_TOP = 1;
        final int DRAWABLE_RIGHT = 2;
        final int DRAWABLE_BOTTOM = 3;

       if(event.getRawX() <= (editText.getCompoundDrawables()[DRAWABLE_LEFT].getBounds().width()))
        {
              // your action here
             return true;
        }
        return false;
    }
});
    }*/
}