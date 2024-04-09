package org.example

/*
Ya hemos usado varias funciones en estos días anteriores.
Las funciones son bloques de código que realizan una función específica, y no interfieren
en la ejecución del código a menos que se las llame o las imprima.
La función principal en Kotlin es main. T0do lo que vaya a ejecutarse debe estar dentro de ésta,
ya que si está fuera no imprimirá nada. Se pueden crear funciones fuera, pero hay que llamarlas desde
main para que se ejecuten.
Las funciones pueden devolver o imprimir, y pueden tener o no argumentos que pasarles
 */

fun presentation(name: String) {
        //Es necesario especificar el tipo de dato que es cada variable
    println("Hola, bienvenido $name")
}

fun main() {
    //Función sin return ni argumentos
    fun func1() {
        println("Soy una función que no necesita parámetros ni devuelve nada")
    }
    func1()    //La función imprime por sí, no hace falta imprimirla. Con llamarla vale

    //Función sin return y con parámetros
    presentation("Usuario")
        //Se puede crear la función fuera y llamarla dentro de main()

    //Función con return sin parámetros
    fun func2(): String {
            //Si devuelve algo hay que especificar el tipo de dato que devuelve
        return "Soy una función sin parámetros pero tengo retorno"
    }
    println(func2())    //Si devuelve y no imprime, sí hay que imprimir la función porque si no no mostrará nada

    //Función con parámetros y return
    fun suma(n1: Int, n2: Int): Int {
        return n1 + n2
    }
    println(suma(3, 7))

    //Función con número indefinido de argumentos
    fun numerar(vararg names: String) {
        var count = 1
        names.forEach {
            println("Hola, soy $it y soy el número $count")
            count++
        }
    }
    numerar("Juan", "Jose", "Beatriz")

    fun sumarVarios(vararg nums: Int): Int {
        var sum = 0
        for (n in nums) {
            sum += n
        }
        return sum
    }
    println(sumarVarios(1, 2, 3, 4, 5))
}
