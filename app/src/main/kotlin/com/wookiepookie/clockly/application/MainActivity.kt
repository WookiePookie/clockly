package com.wookiepookie.clockly.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.cookiewookie.clockly.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}