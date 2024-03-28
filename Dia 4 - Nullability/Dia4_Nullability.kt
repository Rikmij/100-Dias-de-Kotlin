package org.example

/*
Hemos visto que hay varios tipos de datos en Kotlin: Strings, Int, Long, Bool...
Pero hay otro tipo que es el null, sólo que éste no guarda un valor. Null es una
ausencia de valor.
Hay que evitar usar null siempre que sea posible, pero hay veces que es necesario su uso, como
para evitar el NullPointerException, o no asignarle valor a una variable/constante
 */

fun main() {
    val str = "Esto es un string"
    //str = null  Da error, no es una variable nulable
    println(str)

    // para declarar una variable nulable hay que hacerle la inferencia de tipo seguido de un '?'
    var str2: String? = "Esto es un string o null"
    str2 = null
    println(str2)

    //A una variable null no puedes acceder a sus métodos como accedes a una variable que tiene un valor.
    //Para acceder a sus métodos tienes que usar el operador de llamada segura '?'
    str.length

    str2?.length    //devuelve null porque recordemos que no tiene valor, es null

    /*
    ¿Y si tenemos una variable nulable pero ésta sí tiene valor? No podemos acceder a sus métodos de forma
    común. Para eso hay que asegurar que tiene valor con el operador de aserción no nulo '!!'

    CUIDADO, esto puede generar un NullPointerException si la variable es null, así que mejor usarlo
    cuando estemos seguros que la variable tiene valor o hay un control de excepciones
     */

    val str3: String? = "Mondongo"
    //str3.uppercase()  //Error porque es nulable y no hemos asegurado que sea null
    println(str3!!.uppercase())

    //Esto podemos aplicarlo con condicionales (y comprobar de paso si una variable es nula o no)
    if (str3 != null) {
        println(str3.reversed())
        //Vemos que no necesitamos '!!', porque es en caso que no sea nulo, que tenga valor sí o sí

    } else {
        println("Da nulo")
    }

    val str4: String? = null

    if (str4 != null) {
        println(str4.lowercase())
    } else {
        println("Da nulo")
    }

    //Más allá, se puede usar if/else para verificar que no sea nulo y convertirlo en no nulable
    val lowerString = if (str3 != null) {
        println(str3.lowercase())
    } else {
        println("Ingresa algo: ")
        val newStr3 = readln()
        println(newStr3.lowercase())
    }

    var num: Int? = null

    val sumNum1 = if (num != null) {
        num += 1
        println(num)
    } else {
        println(num)
    }

    //Otra forma de hacer esto es con el Operador Elvis '?:', se llama así porque parece el peinado de Elvis Presley
    /*
    Creamos la variable, y la primera parte del igual es lo que especificamos qué haría la variable si
    tuviera un valor, y después del operador ?: lo que hará si la variable es null
     */
    
    val lowerString2 = str3?.lowercase() ?: "Da nulo"
    println(lowerString2)
    //Si tiene valor hará lowercase. Si es null imprimirá "Da nulo"

    val lowerString2_5 = str3.lowercase() ?: "Da nulo"
    println(lowerString2_5)    //No es necesario el '?.' porque sabemos 100% que tiene valor, pero mejor usarlo

    val lowerString3 = str4?.reversed() ?: "Es nulo"
    println(lowerString3)

    //Si tenemos una serie de elementos y quieres filtrar los no-nulos, puedes usar '.filterNotNull' para borrarlos
    val nullableArray = arrayOf(1, 2, null, 4)
    val intArray: List<Int> = nullableArray.filterNotNull()
    println(intArray)
}
