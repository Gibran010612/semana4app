package com.ejercicios.tareasemana1

// Este archivo muestra cómo modelar un conjunto finito de acciones (marcar
// area como completada, eliminar y editar) usando una clase sellada.
sealed class Action{
    object MarkAsComplete : Action()
    object Delete: Action()
    object Edit: Action()

}

fun performAction(action: Action) {
    when (action){
        is Action.MarkAsComplete -> ("Tarea marcada como comlpletada")
        is Action.Delete -> println("Tarea eliminada")
        is Action.Edit -> println("Tarea enviada")

    }
}

//Función principal par aponerla a prueba
fun main(){
    val action1 = Action.MarkAsComplete
    val action2 = Action.Delete
    val action3 = Action.Edit

    performAction (action1)
    performAction (action2)
    performAction (action3)

}
