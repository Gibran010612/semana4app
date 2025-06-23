package com.ejercicios.tareasemana1

class Socket {
    /**
     * Envía un mensaje al servidor.
     * En este ejemplo, solo imprimimos el texto para ilustrar el flujo.
     */
    fun send(message: String) {
        println("Mensaje enviado: $message")
    }
}


// Este gestor de chat mantiene la conexión y envía mensajes.

class ChatManager {

    // La variable `socket` es no nula, pero se inicializará más adelante.
    // Usamos `lateinit` para evitar inicializarla en el constructor.
    private lateinit var socket: Socket

    /**
     * Conecta el gestor de chat con el servidor.
     * Aquí simplemente instanciamos nuestro `Socket`.
     */
    fun connect() {
        // Inicializar el socket cuando se establezca la conexión
        socket = Socket()
    }

    /**
     * Envía un mensaje por el socket, si ya está listo.
     *
     * @param message Texto que se enviará al servidor.
     */
    fun sendMessage(message: String) {
        // Verificamos si el socket está inicializado antes de usarlo
        if (::socket.isInitialized) {
            socket.send(message)
        } else {
            println("Error: Socket no inicializado.")
        }
    }
}

// Función principal para ejecutar el programa
fun main() {
    // Crear instancia del gestor de chat
    val chatManager = ChatManager()

    // Establecer la conexión (inicializa el socket)
    chatManager.connect()

    // Enviar un mensaje
    chatManager.sendMessage("Hola, ¿cómo estás?")
}

