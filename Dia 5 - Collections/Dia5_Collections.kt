package org.example

/*
El 1er día vimos los tipos de datos que hay (Strings, Números, Booleanos...), pero estos tipos
de datos se pueden almacenar en unas colecciones como son las listas, sets o los mapas/diccionarios
En Kotlin, estas colecciones pueden ser mutables o no mutables (sólo de lectura)
 */

fun main() {
    /*
    LISTAS
    Son colecciones ordenadas de elementos, y se puede acceder a éstos por su índice.
    Pueden tener elemetos duplicados
     */
    println("${"-".repeat(5)} LISTAS ${"-".repeat(5)}")
    //Listas no mutables
    val colors = listOf("rojo", "azul", "verde", "amarillo", "negro", "blanco")
    //Algunos de sus métodos:
    //Aparecen métodos de borrar y añadir, pero si no es una lista mutable dará error al compilar
    println("El primer elemento de la lista es: ${colors.first()}")
        //imprime el primer elemento de la lista
    println("El último elemento de la lista es: ${colors.last()}")
        //imprime el último elemento de la lista
    println("El tercer elemento de la lista es: ${colors.get(2)}")
        //imprime el elemento del índice que se le pida (empieza por 0)
    println("El color azul tiene en la lista el índice: ${colors.indexOf("Azul")}")
        //imprime el índice del elemento que se le pide
    println("El color gris tiene en la lista el índice: ${colors.indexOf("Gris")}")
        //Si metes un elemento que no existe devuelve -1
    println("El rango de la lista es: ${colors.indices}")
        //Para ver la cantidad de elementos de la lista
    println(colors.isEmpty())
        //Para saber si está vacía
    println("La lista tiene ${colors.size} elementos")
        //Para ver el número de elementos que tiene
    println(colors.shuffled())
        //Para mezclar los elementos de la lista
    println(colors.reversed())
        //Devuelve la lista al revés

    //Se puede usar bucles para iterar en listas. Son elementos iterables
    for (color in colors) {
        if ("a" in color) {
            println(color)
        } else continue
    }

    colors.forEach {
        val index = colors.indexOf(it)
        println("Soy $it y tengo el índice $index")
    }

    //Listas mutables
    //Se pueden hacer los mismos métodos que con las no mutables, y aemás añadir y/o borrar elementos
    //Se pueden crear vacías e irles añadiendo elementos según se necesiten, pero esepcificando el tipo que tendrán
    val dbPers = mutableListOf("Goku", "Gohan", "Piccolo")

    //Si la lista es de Strings, sólo puedes añadir Strings, no otro tipo de datos
    dbPers.add("Roshi")
    println(dbPers)

    val dbPers2 = listOf("Krilin", "Satan", "Vegeta")
    dbPers.addAll(dbPers2)
    println(dbPers)

    dbPers.remove("Satan")
    println(dbPers)

    val dbPers3 = listOf("Krilin", "Roshi")
    dbPers.removeAll(dbPers3)
    println(dbPers)

    dbPers.shuffle()
    println(dbPers)   //En no mutables era 'shufled()' pero en las mutables existe shufle() también

    /*
    SETS
    Es una colección de datos que no permite elementos repetidos y no es ordenada
     */
    println("${"-".repeat(5)} SETS ${"-".repeat(5)}")
    //Sets no mutables
    val forms = setOf("Cuadrado", "Círculo", "Triángulo")
    println(forms.isEmpty())
        //Comprueba si está vacío
    println(forms.size)
        //Devuelve el tamaño del set
    println(forms.shuffled())
        //Mezcla el orden del set
    println(forms.first())
        //Devuelve el primer elemento
    println(forms.last())
        //Devuelve el último elemento
    println(forms.contains("Triángulo"))
        //Comprueba si existe el elemento
    println(forms.reversed())
        //Devuelve el set al revés

    forms.forEach {
        val index = forms.indexOf(it)
        println("Soy $it y soy el índice $index")
    }     //Son iterables al igual que las listas, por lo que también se pueden hacer bucles con los sets

    //Sets mutables
    //Se pueden crear vacíos e irles añadiendo elementos según se necesiten, pero esepcificando el tipo que tendrán
    val weekDays = mutableSetOf("Lunes", "Martes", "Miércoles", "Jueves")
    weekDays.add("Viernes")
    println(weekDays)

    val weekendDays = setOf("Sábado", "Domingo")
    weekDays.addAll(weekendDays)
    println(weekDays)

    weekDays.remove("Lunes")
    println(weekDays)

    weekDays.removeAll(weekendDays)
    println(weekDays)

    /*
    MAPS/DICCIONARIOS
    Es una colección de datos basada en clave-valor. Cada clave es única y tiene un valor asignado (el valor
    puede asociarse a varias claves)
     */
    println("${"-".repeat(5)} MAPS ${"-".repeat(5)}")
    //Maps no mutables
    val fruits = mapOf("Manzana" to "Rojo", "Pera" to "Verde", "Plátano" to "Amarillo", "Tomate" to "Rojo")
    println(fruits.entries)
        //Devuelve las claves con sus valores
    println(fruits.keys)
        //Devuelve las claves
    println(fruits.values)
        //Devuelve los valores
    println(fruits.size)
        //Devuelve el número de entradas (clave-valor) que tiene el diccionario
    println(fruits.containsKey("Pera"))
        //Devuelve si el map tiene la clave especificada
    println(fruits.containsValue("Morado"))
        //Devuelve si el map tiene el valor especificado
    println(fruits.get("Plátano"))
        //Devuelve el valor que tiene la clave

    for (fruit in fruits) {
        println("La fruta ${fruit.key} es de color ${fruit.value}")
    }

    //Maps mutables
    val pokemons = mutableMapOf("Bulbasaur" to "Planta", "Squirtle" to "Agua", "Charmander" to "Fuego")
    pokemons.put("Pikachu", "Eléctrico")
    println(pokemons)

    pokemons["Pidgey"] = "Volador"
    println(pokemons)

    val pokemons2 = mapOf("Nidoran" to "Veneno", "Mankey" to "Lucha", "Abra" to "Psíquico")
    val sumPokes = pokemons + pokemons2
    println(sumPokes)

    val restPokes = sumPokes - pokemons2.keys
    //Hay que especificar que se borran las claves
    println(restPokes)

    pokemons.remove("Pikachu")
        //Hay que hacerlo con este porque es el mutable, el resto son no mutables
    println(pokemons)
}
