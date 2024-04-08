package org.example

/*
En Kotlin hasta ahora hemos visto un tipo de programación donde se crean funciones y se trabaja
con eso y sus métodos, pero existen más paradigmas como la Programación Orientada a Objetos (POO)
en la que establecemos una clase definiendo el objeto y sus características para después
implementarla y usarla.
Una clase realmente es parecido a una composición de un objeto, una descripción de él (no es
código funcional) con valores definidos y/o otros que habrá que definir cuando se le llame
 */

fun main() {
    class Charmander {
        //las clases tienen atributos (características)
        val color = "naranja"
        val fuego = true
        val extremidades = 4

        //las clases también tienen métodos (acciones)
        fun scratch() {
            println("Charmander usó Arañazo")
        }

        fun burn() {
            println("Charmander usó Ascuas")
        }
    }
    //Para llamar sus propiedades, hay que asignarlos a una variable y llamarlos como otros métodos
    val charmander = Charmander()
    println(charmander.color)
    println(charmander.fuego)
    charmander.burn()

    /*
    Las clases pueden tener también unos valores necesarios para iniciarlos llamados constructores
    (que Kotlin puede tener su constructor y otros secundarios, especificcados por constructor
    mientras el principal se le pasa como argumentos. Para tener constructores secundarios debe
    tener uno principal)
    ¿Para qué sirve tener varios constructores? Cuando la entiedad pueda crearse con varias
    combinaciones, es buena idea usar varios constructores. Cada constructor secundario puede
    tener atributos y lógica adicional
     */
    //Clase con 1 constructor
    class Pokemon(val name: String, val type: String) {
        fun attack(attack: String): String {
            return "$name usó $attack"
        }
    }
    val squirtle = Pokemon("Squirtle", "Agua")
    println(squirtle.attack("Pistola Agua"))

    //Clase con 2 o más constructores
    class Access(user: String) {
        constructor(user: String, password: String): this(user)
        constructor(user: String, id: Short): this(user)
    }
    val usuario = Access("Max Verstappen", "Tutututu_Max Verstappen")
    val usuario2 = Access("Fernando Alonso", 33)

    /*
    Las clases pueden definirse dentro de otras, siendo así clases anidadas o internas.
    Las clases anidadas se declaran dentro de otra clase, pero son clases independientes, así
    que no se puede acceder a sus miembros desde la clase anidada.
    Las clases internas sí son parte de las clases que los contiene, por lo que sí se puede
    acceder a los miembros de la clase exterior, pero desde hace poco, ambas son clases
    internas (si intentas crear una clase dentro de otra te marcará un error t pedirá que
    especifiques inner).
     */

    class Coche {
        val ruedas = 4
        val puertas = 5
        val color = "Azul"

        inner class Motor {
            val color = "Negro"
            val arrancar = fun() = "Brumm"

            fun printColor() {
                println(this@Coche.color)
                println(this@Motor.color)
                /*
                En caso de que la clase contenedora y la contenida compartan algún parámetro,
                así se puede especificar a cuál te estás refiriendo
                 */
            }
        }
    }

    val miCoche = Coche()
    println(miCoche.ruedas)
    println(miCoche.Motor().arrancar())
    //println(Coche().Motor().arrancar())   otra forma válida que es lo mismo
    miCoche.Motor().printColor()
}
