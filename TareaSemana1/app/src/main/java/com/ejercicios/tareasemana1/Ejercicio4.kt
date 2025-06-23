package com.ejercicios.tareasemana1

//Este ejercicio muestra una forma sencilla de filtrar canciones por género en kotlin
//Primero creamos la clase "Song" y le agregamos las variables
data class Song(val title: String, val genre: String)

//En la función principal creamos una lista inmutable de objetos "Songs"
fun main(){
    val songs = listOf(
        Song("Canción 1", "Pop"),
        Song("Canción 2", "Rock"),
        Song("Canción 3", "Pop"),
        Song("Canción 4", "Electrónica")
    )

    //Filtrar las canciones por género
    val popSongs = songs.filter { it.genre == "Pop" }
    println("Canciones Pop: $popSongs")
}