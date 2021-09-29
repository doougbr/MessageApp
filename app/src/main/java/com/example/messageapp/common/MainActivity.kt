package com.example.messageapp.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.messageapp.R
import com.example.messageapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

private var binding: ActivityMainBinding? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        val bottomNav = binding!!.bottomNavigationView
        val navController = findNavController(R.id.fragment)

        bottomNav.setupWithNavController(navController)



    }
}