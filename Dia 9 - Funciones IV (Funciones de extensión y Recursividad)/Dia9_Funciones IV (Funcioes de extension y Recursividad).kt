package org.example

/*
Las funciones de extensión son funciones que tú puedes crear para cualquier tipo de objetos.
Puedes crear funciones para cualquier tipo de dato
 */
fun String.log() {
    val tag = "Hola, voy a decir: "
    println("$tag: $this")
}

fun Int.doble(): Int {
    return (this * 2)
}

fun main() {
    val text = "MONDONGO"
    text.log() // Usage

    val num = 4
    println(num.doble())

    
    /*
    RECURSIVIDAD
    La recursividad es un concepto que consiste en que una función se llame a sí misma repetidamente.
    Si no ponemos una condición de fin, puede ser un bucle infinito
     */

    //Uno de los usos más comunes de la recursividad es para calcular la sucesión de Fibonacci
    fun fibonacci(n: Int): Int {
        if (n <= 1) {
            return n
            //Le ponemos la condición de final, que cuando llegue a 1 se pare
        }
        return fibonacci(n - 1) + fibonacci(n - 2)
        //Que sume los 2 números anteriores para que de el siguiente
    }

    val length = 10
    val fibos = mutableListOf<Int>()

    for (i in 0 until length) {
        fibos.add(fibonacci(i))
        /*
        Recorremos cada número entre 0 y el elegido para la longitud y hacemos lo especificado
        en la función fibonacci para crear la secuencia
         */
    }
    println(fibos)

    // Para hacer suma recursiva de todos los valores hasta él
    fun sumHasta(num: Int): Int {
        if (num <= 0) {
            return 0
            //Establecemos la condición de final, porque si no sumará hasta el infinito
        }
        return num + sumHasta(num - 1)
    }
    println(sumHasta(3))
}
