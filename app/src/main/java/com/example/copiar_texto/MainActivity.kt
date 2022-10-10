package com.example.copiar_texto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.copiar_texto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showbutton.setOnClickListener{
            val message = binding.message.text
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            binding.salida.text = "Bienvenido " + binding.message.text
        }

        binding.limpiar.setOnClickListener {
            binding.message.text.clear()
        }

    }
}