package co.edu.sena.entrega1

//EXERCISE 1


// Definición de variables
var mutableVariable = "Soy una variable mutable"
val immutableVariable = "Soy una variable inmutable"

// Definición de constantes
const val PI = 3.1416
const val APP_NAME = "MiAplicación"

// Función que demuestra el uso de variables y constantes
fun variablesYConstantes() {
    println("Variable mutable: $mutableVariable")
    println("Variable inmutable: $immutableVariable")
    println("Constante PI: $PI")
    println("Constante APP_NAME: $APP_NAME")
}

// Opcionales y manejo de nulos
fun manejoDeNulos() {
    val nonNullableString: String = "Soy un string no nullable"
    val nullableString: String? = null

    println("String no nullable: $nonNullableString")
    println("String nullable: $nullableString")

    // Uso del operador de llamado seguro
    println("Longitud del string nullable: ${nullableString?.length}")

    // Uso del operador Elvis
    val length = nullableString?.length ?: "Longitud desconocida"
    println("Longitud del string nullable usando operador Elvis: $length")

    // Uso del operador !! (no recomendado) con manejo adecuado de la excepción
    try {
        println("Longitud del string nullable usando !!: ${nullableString!!.length}")
    } catch (e: NullPointerException) {
        println("Error: se intentó acceder a un valor nulo con el operador !!")
    }
}

// Función principal
fun main() {
    variablesYConstantes()
    manejoDeNulos()
}
