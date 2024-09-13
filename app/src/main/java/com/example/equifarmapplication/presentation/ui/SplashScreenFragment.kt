package com.example.equifarmapplication.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels


class SplashScreenFragment : Fragment() {

    private lateinit var binding: SplashScreenBinding

    class SplashScreenBinding {

    }

    private val viewModel: SplashScreenViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout and set up data binding
        binding = SplashScreenBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        // Simulate some work here and navigate when done
        // For example, navigate to the main screen after a delay
        binding.root.postDelayed({
            // Navigate to another fragment or activity
            // findNavController().navigate(R.id.action_splashScreenFragment_to_mainFragment)
        }, 2000) // 2-second delay

        return binding.root
    }
}
