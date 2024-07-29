package com.example.equifarmapplication.presentation.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.equifarmapplication.R
import com.example.equifarmapplication.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {

    private lateinit var binding: FragmentSplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout and set up data binding
        binding = FragmentSplashScreenBinding.inflate(inflater, container, false)

        // Simulate a delay to show the splash screen
        Handler(Looper.getMainLooper()).postDelayed({
            // Navigate to the next screen after the delay
            findNavController().navigate(R.id.action_splashScreenFragment_to_mainFragment)
        }, 3000) // Delay in milliseconds (3 seconds)

        return binding.root
    }
}
