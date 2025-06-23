package com.ejercicios.semana4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ejercicios.semana4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Infla el layout usando View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Cambia el texto del TextView dinámicamente
        binding.tvMensaje.text = "¡Hola, este mensaje es dinámico!"
    }
}

