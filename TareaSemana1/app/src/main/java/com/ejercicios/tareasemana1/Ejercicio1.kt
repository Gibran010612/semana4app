package com.ejercicios.tareasemana1
fun main() {
    // Título de la tarea obtenido de algún origen de datos
    val taskTitle: String? = null

    // Mostrar el título de la tarea, o un texto predeterminado si es nulo
    val displayTitle = taskTitle ?: "Título no disponible"
    println("Título de la tarea: $displayTitle")
}