package org.example

fun main() {
    /*
    Condición if
    Expresa una condición que devuelve un valor si es verdadero, aunque se puede especificar
    qué hacer si el código no cumple esa condición
     */
    if (5 < 7) {
        println("Es mayor")
    } else {
        println("No es mayor")
    }

    //No sólo se pueden comparar números, sino comprobar un ingreso de usuario, compatibilidad...
    println("¿Te gustan las manzanas?")
    val answerIf = readln()     //así se hace un ingreso de usuario por terminal

    if (answerIf == "si") {
        println("Te gustan las manzanas")
    } else {
        println("No te gustan las manzanas")
    }

    /*
    Condición when
    Es una expresión condicional con varias condiciones, que va comparando 1 a 1 hasta que encuentra
    alguna que cumpla con lo establecido
     */
    println("Ingresa un número mayor a 0")
    val a = readln().toInt()

    when (a) {
        in 1..100 -> println("Está entre 1 y 100")
        in 100..500 -> println("Está entre 100 y 500")
        else -> println("Es mayor de 500")
        //El else en when es OBLIGATORIO. A menos que cubra toooodos los casos, pero eso no suele ser, así que
        //mejor ponerlo siempre
    }

    fun calculateDoble(param: Any) {
        when (param) {
            is Byte -> println(param * 2)
            is Short -> println(param * 2)
            is Int -> println(param * 2)
            is Long -> println(param * 2)
            is Float -> println(param * 2)
            is Double -> println(param * 2)
            else -> println("No es un número, no se puede calcular su doble")
        }
    }
    calculateDoble("Mondongo")
    calculateDoble(33)

    /*
    For loop
    Recorre cualquier cosa que se pueda iterar
     */
    for (num in 1..5) {   //iteración en un rango de números
        println(num)
    }

    for(num in 6 downTo 1 step 2) {   //iteración contando hacia atrás de 2 en 2
        println(num)
    }

    for (l in "hola") {   //iteración en un string
        println(l)
    }

    val arrayIndex = arrayOf("Diez", "Veinte", "Treinta")
    //¿cómo accedemos a los índices si vamos iterado?
    for ((index, value ) in arrayIndex.withIndex()) {
        println("Índice $index -> $value")
    }

    //forEach es como el for pero se accede como un método
    val pokeInitials = listOf("Bulbasaur", "Squirtle", "Charmander")
    pokeInitials.forEach { println("Elijo a $it") }
    //it es una palabra que hace referencia al elemento que en ese momento está recorriendo

    val numsCuadrados = listOf(1, 2, 3, 4)
    numsCuadrados.forEach { println("Su cuadrado es ${it * it}") }
    /*
    numsCuadrados.forEach { num ->
    "Su cuadrado es ${num * num}"
    }       otra forma de hacerlo
     */

    /*
    While loop
    Recorre una iteración sin parar mientras cumpla una condición que hay que especificarle.
    Si no se le especifica, sigue recorriendo sin fin (o hasta que el ordenador pete)
     */
    var contando = 0
    while (contando < 7) {
        contando += 1
        println(contando)
    }

    /*
    do while loop
    Es un while sólo que primero ejecuta y luego comprueba, por lo que como mínimo hará 1 ejecución.
    While primero comprueba y luego ejecuta, do while primero ejecuta y luego comprueba
     */
    var contando2 = 0
    while (contando2 > 7) {
        contando2 += 1
        println(contando)
    }

    do {
        contando2 += 1
        println(contando2)
    } while (contando2 > 7)
    /*
    Vemos que ambas condiciones son falsas, pues la variable es 0 y comparamos si es mayor que 7. La
    diferencia es que en el while no entra, mientras que en el do while imprime un 1, porque ha entrado
    en el bucle, hecho lo que se pedía y después comprobado, y al ser menor que 7, sale del bucle, pero da
    un resultado, el while ni siquiera entra.
     */
}
