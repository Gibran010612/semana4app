package com.ejercicios.tareasemana1


//En este archivo añadimos un método de extensión llamado `formatDate` a la
//clase `Date`.  De esta forma, cualquier instancia de `Date` podrá invocar
//directamente `myDate.formatDate()` para obtener una cadena con la fecha
//formateada.

import java.text.SimpleDateFormat
import java.util.Date

//Creamos un formateador con patrón: día, mes y año
fun Date.formatDate(): String{
    val formatter = SimpleDateFormat("dd/MM/yyy Hh:mm:ss")
    return formatter.format(this)
    // `this` se refiere a la instancia de Date que invoca la extensión
}

fun main() {
    val currentDate = Date()
    println("Fecha formateada: ${currentDate.formatDate()}")

}