package org.example

fun breakContinue3() {
    val oddNumbers = mutableListOf<Int>()
    for (n in 1..20) {
        if (n % 2 == 0) continue
        oddNumbers.add(n)
    }
    println(oddNumbers)
}

fun breakContinue4(listNames: List<String>): List<String> {
    val nameslen5 = mutableListOf<String>()
    for (name in listNames) {
        if (name.length < 5) continue
        nameslen5.add(name)
    }
    return nameslen5
}

fun breakContinue6(): List<Int> {
    val primeNumbers = mutableListOf<Int>()
    var num = 2 //Un número primo siempre es mayor que 1
    while (primeNumbers.size < 50) {
        var primeNum = true
        for (iterator in 2 until num) {
            if (num % iterator == 0) {
                primeNum = false
                break
            }
        }
        if (primeNum) {
            primeNumbers.add(num)
        }
        num += 1
    }
    return primeNumbers
}

fun main() {
    breakContinue3()
    println(breakContinue4(listOf("Ana", "Ricardo", "Jose Antonio", "Juan")))
    println(breakContinue6())
}
