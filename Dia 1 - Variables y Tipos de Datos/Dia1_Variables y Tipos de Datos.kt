// Esto es un comentario de 1 línea. Los comentarios no afectan al código

/*
Esto es un comentario de varias líneas.
Puedes escribir las que quieras y añadir sin importar
que no afecta al código
 */

fun main() {
    //Para que el código se ejecute debe estar dentro de la función main, si no no se mostrará

    val value = "a"
    //letter = b
    println(value)
    /**esto es otro comentario multilínea pero más para documentación
     *
     * no se puede reasignar porque es un valor, para que se pueda reasignar
     * hay que crearlo como variable, con la palabra reservada var
     */

    var variable = "a"
    println("La variable antes era $variable")
    variable = "b"
    println("Ahora la variable es $variable")

    //Existe una forma de asignar 2 valores a la vez a 2 variables: el "destructuring declaration"
    val (a, b) = Pair(3, "Hola")
    println("a es $a y b es $b")


    println("\n ${"*".repeat(7)}" + " DATA TYPES " + "*".repeat(7))
    //Números enteros: hay 4 tipos de datos numéricos enteros
    val byteNum: Byte = 8
    val shortNum: Short = 40
    val intNum = 369
    val longNum = 1234567891234567899
    val longNum2 = 21071997L    //otra forma de declarar Longs

    //Números decimales: hay 2 tipos de datos numéricos decimales
        // Para especificar Floats, hay que añadir una "f" al final
    val floatNum = 4.8f     //Kotlin usa por defecto Double.
    val doubleNum = 3.141592654

    //Se pueden hacer operaciones con ellos
    println(byteNum + intNum)
    println(shortNum - doubleNum)
    println(longNum2 - intNum)
    println(longNum / floatNum)

    //Unsigned integers
    /*
    Estos tipos de datos están aún en fase experimental, pero actúan como números normales
    con 1 diferencia. SÓLO ACEPTA NÚMEROS POSITIVOS, así que mientras un byte tenía de rango (-128 - 127),
    un UnsignedByte (UByte) tiene de rango (0 - 255), el doble ya que no tiene esos negativos
     */
    val unsignedByte: UByte = 8u
    val unsignedShort: UShort = 300u
    val unsignedInt = 36921u
    val undignedLong = 123456789uL

    println("Resultado unsigneds: ${unsignedInt - (unsignedByte + unsignedShort)}")
    //al parecer, con los Long no se pueden hacer operaciones

    //Strings
    val str = "Soy un string"
    val str2 = "2"  //los números pueden ser strings si van entre comillas

    ///se pueden concatenar strings
    println(str + str2)
    ///falta un espacio. Podemos añadirlo en los strings o formatear la cadena con $ antes de la variable
    println("$str $str2")

    ///con la concatenación además se pueden hacer operaciones entre números
    println("$str y esto cuesta ${shortNum - byteNum} euros")

    //Chars (strings de 1 letra)
    val letter = 'a'    //hay que usar las comillas simples, si no será un String

    //Arrays
    val arrayNames = arrayOf("Antonio", "Beatriz", "Carlos")
    var arrayNums = arrayOf(100, 200, 300, 400)
    /*
    Puedes añadir todos los que quieras, pero del mismo tipo. Si es un Array de Strings,
    todos los elementos deben ser strings, y si son números, todos números
     */
    arrayNums += 500
    println(arrayNames.joinToString())  //Si no lo conviertes a String no podrás imprimir su contenido
    println(arrayNums.joinToString())

    //Bools
    val trueBool = true
    val falseBool = false

    //Los booleanos se usan sobre t0do para comparar y para cosas que sean sí o no
    println(trueBool == falseBool)
    println(intNum > shortNum)
    println(trueBool && falseBool)  //operador AND -> xxxxxxx && yyyyyyy
    println(trueBool || falseBool)  //operador OR -> xxxxxx || yyyyyyy
    println(!falseBool)     //negación -> !xxxxxxx

    //println(trueBool::class.simpleName)  Con esto puedes ver el tipo de dato de la variable en terminal
}
