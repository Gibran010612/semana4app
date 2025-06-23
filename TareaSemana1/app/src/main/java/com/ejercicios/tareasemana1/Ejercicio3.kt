package com.ejercicios.tareasemana1

class Bitmap(var width: Int = 0, var height: Int = 0) {

    //Devuelve la resolución como texto
    fun info(): String = "${width}x$height"
}


// Función de extensión para redimensionar un Bitmap
fun Bitmap.resize(newWidth: Int, newHeight: Int): Bitmap {
    println("Redimensionando bitmap de ${this.info()} a ${newWidth}x$newHeight")

    return Bitmap(newWidth, newHeight)
}

fun main() {
    val image = Bitmap(800, 600)          // Bitmap original
    val thumbnail = image.resize(100, 100) // Imagen redimensionada
    println("Miniatura creada: ${thumbnail.info()}")
}
