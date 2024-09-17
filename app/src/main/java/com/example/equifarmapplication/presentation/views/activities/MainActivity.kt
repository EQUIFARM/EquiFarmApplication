package com.example.equifarmapplication.presentation.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.equifarmapplication.R
import com.example.equifarmapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initializing navController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        //set up bottomnavigationviewwith navController
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController)

    }
}