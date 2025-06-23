package com.ejercicios.tarea1


fun main() {
        val taskTitle: String? = null
        val displayTitle = taskTitle ?: "Titulo no disponible"
        println("Titulo de la tarea: $displayTitle")
    }