package com.example.equifarmapplication.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SplashScreenViewModel : ViewModel() {
    private val _message = MutableLiveData<String>("Hello, World!")
    val message: LiveData<String> get() = _message

    // Add any other logic or methods if needed
}
