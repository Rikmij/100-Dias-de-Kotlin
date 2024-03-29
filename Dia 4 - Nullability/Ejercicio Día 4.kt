package org.example

fun main() {
    println("Nombre: ")
    val name = readln()
    println("Apellido: ")
    var surname = readlnOrNull()

    if (surname == "") {
        surname = null
    }

    println("Hola, soy $name ${surname ?: ""}")

    if (surname == null) {
        println("- Encantado $name")
    } else {
        println("- Encantado señor ${surname?.uppercase()}")
        //Aquí no es necesario el '?.' pero por practicar y darle uso...
    }
}
