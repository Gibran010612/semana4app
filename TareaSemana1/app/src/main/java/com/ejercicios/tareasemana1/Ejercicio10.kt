package com.ejercicios.tareasemana1


package com.ejercicios.tareasemana1

// Clase sellada que representa el resultado de una búsqueda.

sealed class SearchResult {

    data class Success(val items: List<String>) : SearchResult()
    data class Error(val message: String) : SearchResult()
}

// Función que procesa el resultado de la búsqueda.
// Utiliza una expresión `when` para determinar si fue éxito o error.

fun processSearchResult(result: SearchResult) {
    when (result) {
        is SearchResult.Success -> println("Resultados encontrados: ${result.items}")
        is SearchResult.Error   -> println("Error al buscar: ${result.message}")
    }
}

// Función principal para probar ambos casos de búsqueda.
fun main() {

    // Simulamos un resultado exitoso con dos elementos
    val successfulResult = SearchResult.Success(listOf("Resultado 1", "Resultado 2"))

    // Simulamos un error de conexión
    val errorResult = SearchResult.Error("No se pudo conectar al servidor")

    // Procesamos ambos resultados
    processSearchResult(successfulResult)
    processSearchResult(errorResult)
}
""")
