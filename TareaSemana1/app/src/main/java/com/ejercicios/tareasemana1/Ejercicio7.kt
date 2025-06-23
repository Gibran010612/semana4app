package com.ejercicios.tareasemana1

//Importamos las herramientas necesarias para trabajar con las corrutinas
import kotlinx.coroutines.*

//Función que simlua la obtención de noticias
fun fetchNews(){
    println("Solicitando noticias...")

    //Lanzamiento de corrutina en un alcance global
    GlobalScope.launch {
        delay(2000) //Simular una solicitud de red con unretrso de 2 segundos
        println("Noticias recibidas: Lorem ipsum dolor sit amet.")
    }

}

fun main(){
    fetchNews()
    println("Mostrando otras secciones de la aplicación mientras se cargan las noticias...")
    Thread.sleep(3000) //Simular otras operaciones mientras cargan las noticias

}