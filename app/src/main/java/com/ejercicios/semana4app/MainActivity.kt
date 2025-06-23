package com.ejercicios.semana4app

import android.net.Uri
import android.widget.Toast
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ejercicios.semana4app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Declaramos la variable de binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflamos el layout usando View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mostramos un mensaje dinámico en el TextView
        binding.tvMensaje.text = "¡Hola, este mensaje es dinámico!"

        binding.btnIrASegunda.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

        binding.btnCompartir.setOnClickListener {
            val mensaje = "¡Este es un mensaje compartido desde mi app!"

            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, mensaje)
                type = "text/plain"
            }

            // Muestra el menú para elegir app
            val chooser = Intent.createChooser(intent, "Compartir mensaje con...")
            startActivity(chooser)
        }

        binding.btnLlamar.setOnClickListener {
            val numero = binding.etTelefono.text.toString()

            if (numero.isNotBlank()) {
                val intent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:$numero")
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, escribe un número", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnAbrirWeb.setOnClickListener {
            var url = binding.etUrl.text.toString()

            if (url.isNotBlank()) {
                // Añade "https://" si el usuario no lo escribe
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "https://$url"
                }

                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse(url)
                }

                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, escribe una URL", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnEnviarCorreo.setOnClickListener {
            val destinatarios = arrayOf("ejemplo@correo.com") // puedes cambiarlo
            val asunto = "Saludos desde mi app"
            val mensaje = "Este es un mensaje enviado desde mi aplicación Android."

            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // solo apps de correo responderán
                putExtra(Intent.EXTRA_EMAIL, destinatarios)
                putExtra(Intent.EXTRA_SUBJECT, asunto)
                putExtra(Intent.EXTRA_TEXT, mensaje)
            }

            // Verificamos si hay alguna app que pueda manejar el Intent
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "No hay ninguna app de correo instalada", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
