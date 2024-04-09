package org.example

/*
Las funciones estándar son funciones en las cuales (a través de una expresión lambda), se forma
un alcance temporal (en sus llaves) donde puedes acceder al objeto sin nombrarlo, sólo refiriéndote a él
a través de "it" o "this".
it -> el objeto al que se referencia se trata como argumento
this -> el objeto al que se referencia actúa como receptor
 */

fun main() {
    /*
    let
    Uno de sus usos más comunes es comprobar la nulabilidad, pero también puede usarse simplemente para
    devolver un bloque donde hagas algo con el valor al que te refieras (it)
     */
    val num: Int? = null
    //println(num + 3)   ERROR, null + Int da error
    num?.let {
        println(num + 3)
        //Simplemente no imprime, sabe que es nulo
    }

    val num2: Int? = 31
    num2?.let {
        println(it + 2)
        //Imprime el resultado, porque no es nulo
    }

    val listaNames = listOf("Agustín", "Jose", "Mario")
    listaNames.let { name ->    //por defecto asigna it, pero se le puede poner un nombre
        name.forEach { println("Hola, soy $it") }
    }

    /*
    with
    Se usa sobre t0do cuando no es necesario usar el resultado que retorna. Es hacer algo con un objeto
     */
    val listaNums = mutableListOf(10, 20, 30)
    with(listaNums) {
        var suma = 0
        this.forEach {
            suma += it
        }
        println(suma)
    }

    with(listaNames) {
        println("El primero es ${first()}")
        println("El segundo es ${listaNames[1]}")
    }

    /*
    run
    Run es útil cuando dentro de la lambda se inicializan los datos.
     */
    val totalArea = run {
        val circle1 = 3.1415f * (8 * 8)    //círculo de radio 8
        val circle2 = 3.1415f * (3 * 3)    //círculo de radio 3
        circle1 + circle2
    }
    println(totalArea)

    //Run puede cambiar la propiedad externa
    fun presentacion(name: String, age: Byte) {
        println("Hola! Soy $name y tengo $age años")
    }
    val person = presentacion("Juan", 22)
    person.run {
        presentacion("Enrique", 32)
    }

    /*
    apply
    no devuelve, sino que opera con las propiedades del objeto que se le pasa
     */
    fun square(side: Short, color: String) {
        println("Cuadrado $color de $side de lado")
    }
    val cuadrado = square(8, "rojo")

    cuadrado.apply {
        square(16, "azul")
    }

    /*
    also
    Hace referencia al propio objeto, no a sus propiedades. Puedes añadirle con also una función extra
     */
    listaNums.also {
        println("La lista es $it")
        listaNums.addLast(60)
    }
    println(listaNums)
}
/*
Habrás observado que varias funciones se parecen mucho y podrían usarse unas u otras por igual, y en cierto
sentido sí, podemos guiarnos por la semántica y usar el que mejor suene.
Eso si, tienen cosas en común pero leves sutilezas como que with no necesita de un objeto para inicializarse y
apply sí, o que let soporta la clave it y run no
 */
