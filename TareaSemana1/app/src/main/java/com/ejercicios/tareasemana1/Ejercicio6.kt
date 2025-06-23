package com.ejercicios.tareasemana1

//Este ejemplo simula el manejo de diferentes tipos de unidades (Soldado, Arquero y Mago)
//en un juego, usando clases selladas para garantizar seguridad en tiempo de compilación
//al usar expresiones `when`

sealed class Unit {

    class Soldier : Unit()
    class Archer : Unit()
    class Wizard : Unit()
}
//Función que maneja una unidad según su tipo

fun handleUnit(unit: Unit){
    when (unit){
        is Unit.Soldier -> println("¡Soldado desplegado!")
        is Unit.Archer -> println("¡Arquero desplegado!")
        is Unit.Wizard -> println("¡Mago desplegado!")
    }
}

//Función principal que crea unidades y las procesa
fun main(){
    val unit1 = Unit.Soldier()
    val unit2 = Unit.Archer()
    val unit3 = Unit.Wizard()

    //Despliegue de cada unidad
    handleUnit(unit1)
    handleUnit(unit2)
    handleUnit(unit3)

}