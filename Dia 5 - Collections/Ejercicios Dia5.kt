package org.example

// Ejs listas -> https://plataforma.josedomingo.org/pledin/cursos/programacion_python3/curso/u29/
// Ejs maps -> https://plataforma.josedomingo.org/pledin/cursos/programacion_python3/curso/u32/index.html

fun ejListas1() {
    /*
    Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10)
    y posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su cubo.
     */
    val numsList = mutableListOf<Int>()
    val nums = 1..10
    while (numsList.size < 10) {
        numsList.add(nums.random())
    }
    println(numsList)
    val numsList2 = mutableListOf<Int>()
    val numList3 = mutableListOf<Int>()

    for (n in numsList) {
        numsList2.add(n * n)
        numList3.add(n * n * n)
    }
    println("La lista con los números al cuadrado es $numsList2")
    println("La lista con los núemros al cubo es $numList3")
}

fun ejListas3(mark1: Byte, mark2: Byte, mark3: Byte, mark4: Byte, mark5: Byte) {
    /*
    Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
    (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
    la nota más alta que ha sacado y la menor.
     */
    val marks = mutableListOf<Byte>()
    marks.add(mark1)
    marks.add(mark2)
    marks.add(mark3)
    marks.add(mark4)
    marks.add(mark5)

    println("Tus notas son: $marks")

    fun calcularMedia(notas: List<Byte>): Int {
        var total = 0
        for (mark in notas) {
            total += mark
        }
        return total/5
    }

    println("La nota media es de: ${calcularMedia(marks)}")

    marks.sort()
    println("La nota más baja es: ${marks.first()}")
    println("La nota más baja es: ${marks.last()}")
}

fun ejMaps2(str: String) {
    val analyzer = mutableMapOf<Char, Int>()

    for (letra in str) {
        if (letra in analyzer) {
            analyzer[letra] = analyzer[letra]!! + 1
            /*
            Hay que hacer una llamada no nulable porque Kotlin al sumar intenta llamar al
            operador "plusAssign(1)" y no puede usarse en un dato nulo
             */
        } else {
            analyzer.put(letra, 1)
        }
    }
    println(analyzer)
}

fun main() {
    ejListas1()
    ejListas3(3, 5, 9, 7, 4)
    ejMaps2("Estamos aprendiendo Kotlin")
}
