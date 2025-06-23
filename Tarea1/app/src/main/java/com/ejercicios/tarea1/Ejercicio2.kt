package com.ejercicios.tarea1

// Simulación de una clase Socket para este ejercicio
class Socket {
    fun send(message: String) {
        println("Mensaje enviado: $message")
    }
}

class ChatManager {
    lateinit var socket: Socket

    // Función que simula una conexión y asigna una instancia al socket
    fun connect() {
        socket = Socket()
    }

    // Función para enviar un mensaje a través del socket
    fun sendMessage(message: String) {
        // Verificamos si el socket ya fue inicializado
        if (::socket.isInitialized) {
            // Si lo está, enviamos el mensaje
            socket.send(message)
        } else {
            // Si no lo está, mostramos un error
            println("Error: Socket no inicializado.")
        }
    }
}

// Función principal donde se ejecuta el flujo del programa
fun main() {
    // Creamos una instancia de ChatManager
    val chatManager = ChatManager()

    // Simulamos la conexión, lo que inicializa el socket
    chatManager.connect()

    // Enviamos un mensaje, ahora que el socket ya fue inicializado
    chatManager.sendMessage("Hola, ¿como estas?")
}

