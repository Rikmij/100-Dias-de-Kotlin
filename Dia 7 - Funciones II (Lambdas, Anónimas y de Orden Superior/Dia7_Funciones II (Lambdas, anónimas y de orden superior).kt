package org.example

/*
El día anterior vimos las funciones, cómo se declaran, pasarles parámetros y cómo llamarlas, pero
existen otro tipo de funciones, que vamos a tratar ahora
 */

fun squareArea (n1: Int, n2: Int) = n1 * n2
fun triangleArea (n1: Int, n2: Int) = (n1 * n2) / 2

fun main() {
    /*
    Las funciones lambdas son funciones que no se declaran pero se pasan inmediatamente como una expresión.
    Sigue la expresión de parámetros -> salida, donde en los parámetros se le especifican los tipos y la salida
    se podría inferir. Por ejemplo:
    (Int, Int) -> Int, donde pasas 2 números como parámetros y devolverá un número
     */
    val concat = {s1: String, s2: String -> "$s1 $s2"}
    println(concat("Hola", "concat"))

    val sum = {n1: Int, n2: Int -> n1 + n2}
    println(sum(10, 20))

    //Las lambdas no tienen por qué ser de 1 línea
    val saludarAlguien = {name: String, surname: String ->
        println("Hola $name $surname")
    }
    saludarAlguien("Antonio", "Gomez")
        //Esto también es una lambda. Se especifica el/los parámetro/s y hace algo, sin declarar función

    /*
    Las funciones anónimas son parecidas a las funciones lambda. No tienen nombre pero hay que declararlas
    con fun, seguido de una expresión lambda
     */
    val calcularDoble = fun(n:Int) = n * 2
    println(calcularDoble(20))

    /*
    Las funciones de orden superior son funciones que pueden recibir como parámetros otras funciones o
    incluso devolver funciones
     */
    fun calcularArea(n1: Int, n2: Int, operation: (Int, Int) -> Int): Int {
        return operation(n1, n2)
    }

    val area1 = calcularArea(4, 7, ::squareArea)
        // El :: hace referencia a una clase o función
    println(area1)
    val area2 = calcularArea(5, 5, ::triangleArea)
    println(area2)
}
