package com.example.equifarmapplication.presentation.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.equifarmapplication.R


class SplashScreen : Fragment(R.layout.fragment_splash_screen) {

    private lateinit var viewModel: SplashScreenViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SplashScreenViewModel::class.java)

        // Navigate to the next screen after a delay
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_mainActivity)
        }, 2000) // 2-second delay
    }
}
