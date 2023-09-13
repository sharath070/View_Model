package com.sharath070.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingNum: Int) : ViewModel() {

    private var counter = 0

    init {
        counter = startingNum
    }

    fun getCurrentCount(): Int{
        return  counter
    }
    fun updateCounter(): Int {
        return ++counter
    }

}