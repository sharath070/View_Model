package com.sharath070.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sharath070.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var factory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        factory = MainActivityViewModelFactory(100)

        viewModel = ViewModelProvider(this, factory)[MainActivityViewModel::class.java]

        binding.textView.text = viewModel.getCurrentCount().toString()

        binding.button.setOnClickListener {
            binding.textView.text = viewModel.updateCounter().toString()
        }

    }
}