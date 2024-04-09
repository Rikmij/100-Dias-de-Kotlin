// fuente: https://github.com/jaennova/kotlin/tree/main/1.%20declaracion%20de%20variables/enunciados

fun ejDeclaraVariables1() {
    var sol1 = 5
    println("Antes la variable era $sol1")
    sol1 = 7
    println("Ahora la variable es $sol1")
}

fun ejDeclaraVariables4(): Int {
    val ej4Principal = 33
    val ej4Modified = ej4Principal
    return ej4Modified
}

fun ejDeclaraVariables8(): String {
    val (x, y, z) = Triple(1, 2, 3)
    return "La primera variable es $x, la segunda es $y y la tercera es $z"
}

fun ejConcatena2(): String{
    val name = "Rick"
    val age = 26
    return "Me llamo $name y tengo $age años"
}

fun ejConcatena8(): String{
    val tshirt = 15
    val trousers = 23
    return ("El precio total ha sido ${tshirt + trousers}")
}

fun ejconversionDatos1(){
    val ejConversion1 = "123.45"
    ejConversion1.toDouble()
    println(ejConversion1::class.simpleName)    //Así se imprime el tipo de dato que es
}

fun ejconversionDatos9(){
    val ejConversion9 = 123
    ejConversion9.toString()
    println(ejConversion9::class.simpleName)
}

fun main() {
    ejDeclaraVariables1()
    println(ejDeclaraVariables4())
    println(ejDeclaraVariables8())
    println(ejConcatena2())
    println(ejConcatena8())
    ejconversionDatos1()
    ejconversionDatos9()
}
