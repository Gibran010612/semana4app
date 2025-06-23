package com.ejercicios.tareasemana1
//Usando una funcion lambda asignamos un valor "double" para convertir una
//temperatura de Celsius a Fahrenheit
val CelsiusToFahrenheit: (Double) -> Double = { celsius -> celsius * 9 / 5 + 32}

fun main() {
    val temperatureInCelsius = 20.0 //Se define esta temperatura para convertir
    val temperatureInFahrenheit = CelsiusToFahrenheit(temperatureInCelsius) //Manda a llamar a la función y la ejecuta
    println("Temperatura en Fahrenheit: $temperatureInFahrenheit°F")

}