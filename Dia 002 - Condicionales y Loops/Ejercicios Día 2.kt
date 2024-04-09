package org.example

fun ejIf2(param: String) {
    val vocals = arrayOf("a", "e", "i", "o", "u")

    if (param in vocals) {
        println("Es una vocal")
    } else {
        println("No es una vocal")
    }
}

fun ejIf9(num: Int) {
    if (num in 100..999) {
        println("Es un número de 3 cifras")
    } else {
        println("No es un número de 3 cifras")
    }
}

fun ejIf11(num: Int) {
    if (num % 7 == 0) {
        println("Es divisible por 7")
    } else {
        println("No es divisible por 7")
    }
}

fun ejWhen4(mark: Float) {
    when (mark) {
        in 0.0f..4.0f -> println("F")
        5.0f -> println("D")
        in 6.0f..7.0f -> println("C")
        in 8.0f..9.0f -> println("B")
        10.0f -> println("A")
        else -> println("Esta nota no es válida")
    }
}

fun ejWhen6() {
    println("¿Qué año quieres comprobar? ")
    val year = readln().toInt()

    when {
        year % 4 == 0 && year % 100 != 0 -> println("Es un año bisiesto")
        else -> println("No es bisiesto")
    }
}

fun ejDoWhile2() {
    val die = 1..6

    do {
        println(die.random())
        continue
    } while( die.random() == 6)
}

fun ejForEach3(numList: List<Int>) {
    var contador = 0
    numList.forEach { num ->
        contador += num
    }
    println(contador / numList.size)
}

fun ejForEach8(numList: List<Int>) {
    val compatibles = mutableListOf<Int>()
    numList.forEach { num ->
        if (num % 2 == 0 && num % 3 == 0) {
            compatibles.add(num)
        }
    }
    println(compatibles)
}

fun main() {
    ejIf2("u")
    ejIf9(30)
    ejIf11(121)
    ejWhen4(6.3f)
    ejWhen6()
    ejDoWhile2()
    ejForEach3(listOf(2, 3, 4, 10, 12, 11))
    ejForEach8(listOf(3, 6, 12, 14, 23))
}
