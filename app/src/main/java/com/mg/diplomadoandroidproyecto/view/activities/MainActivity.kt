package com.mg.diplomadoandroidproyecto.view.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mg.diplomadoandroidproyecto.R
import com.mg.diplomadoandroidproyecto.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}