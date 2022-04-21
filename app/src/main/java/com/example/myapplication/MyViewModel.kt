package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val name : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}