package org.example

fun main() {
    /*
    En una función, Return devuelve un valor.
    Por defecto, devuelve el resultado de la función donde esté declarado o
    una función anónima
     */
    fun sumaNums(vararg nums: Int): Int {
        var suma = 0
        nums.forEach {
            suma += it
        }
        return suma
    }
    println(sumaNums(1, 2, 3))

    val calculateCuadrado = fun(num: Int) = num * num
    // función anónima, no tiene nombre. Usa automáticamente return
    println(calculateCuadrado(11))

    /*
    Break
    Rompe la iteración que esté haciendo, pero sólo en el loop que esté iterando. Si es un
    bucle anidado, el principal no lo romperá
     */
    fun acceptThree(nameList: List<String>) {
        var count = 0
        val charactersSD = mutableListOf<String>()
        for (name in nameList) {
            charactersSD.add(name)
            count ++
            if (count >= 3) break
        }
        println(charactersSD)
    }
    acceptThree(listOf("Scooby Doo", "Shaggy", "Daphne", "Fred", "Velma"))

    fun acceptThree2(nameList: List<String>) {
        val lettersSD = mutableListOf<String>()
        for (name in nameList) {
            for (letter in name) {
                if (letter == 'e') break
                lettersSD.add(letter.toString())
            }
        //El bucle se rompe en cada nombre, pero sigue iterando en el siguiente String
        }
        println(lettersSD)
    }
    acceptThree2(listOf("Scooby Doo", "Shaggy", "Daphne", "Fred", "Velma"))

    /*
    Continue
    Si cumple la condición, se salta el elemento que la cumpla y continúa la iteración
     */
    fun calcularImparestill20() {
        val oddsNumberstill20 = mutableListOf<Int>()
        for (number in 0..20) {
            if (number % 2 != 0){
                oddsNumberstill20.add(number)
            } else continue
            }
        println(oddsNumberstill20)
        }
    calcularImparestill20()

    /*
    Labels o etiquetas
    Sirven para especificar algo, y si quieres retornar o hacer break/return puedes especificar
    con estas labels. Simplemente hay que poner algo seguido de un @
     */
    fun colorElements() {
        val clothes = listOf("Camisetas", "Zapatillas")
        val colors = listOf("Rojas", "Azules", "Verdes")

        ropa@ for (ropa in clothes) {
            for (color in colors){
                if ("$ropa $color" == "Camisetas Azules") break@ropa
                //Un break normal rompería la iteración de camisetas y seguiría con Zapatillas,
                //pero al romper el primer bucle, se rompe por completo
                println("$ropa $color")
            }
        }
    }
    colorElements()

    fun colorElements2() {
        val clothes = listOf("Chaquetas", "Zapatillas", "Chanclas")
        val colors = listOf("Azules", "Rojas", "Verdes")

        cloth@ for (ropa in clothes) {
            for (color in colors){
                if (ropa == "Zapatillas") continue@cloth
                //igual que break, sólo que se salta t0do lo relacionado con Zapatillas y sigue
                println("$ropa $color")
            }
        }
    }
    colorElements2()

    fun countNo2y5Label() {
        val nums = 1..20
        val res = mutableListOf<Int>()

        nums.forEach banNum@{
            if (it % 2 == 0 && it % 5 == 0) return@banNum
            //como no se especifica nada en el return, no devuelve nada,
            //así que es una forma de expulsar valores que no queremos
            res.add(it)
        }
        println(res)
    }
    countNo2y5Label()

    fun countNo2y5fE() {
        val nums = 1..20
        val res = mutableListOf<Int>()

        nums.forEach {
            if (it % 2 == 0 && it % 5 == 0) return@forEach
            //e igual que el otro pero sin crear labels, sino
            //usando directamente una label de forEach
            res.add(it)
        }
        println(res)
    }
    countNo2y5fE()


    run sel@{
        //run es un tipo de función que te permite ejecutar un bloque de código
        listOf("perro", "gato", "serpiente", "elefante", "ballena").forEach {
            if (it == "serpiente" || it == "ballena") return@sel
            //aquí con este label, deja de iterar en cuanto no coincide el primer elemento
            println(it)
        }
    }
    print("Estos animales tienen 4 patas")
}
