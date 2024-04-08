package org.example

/*
La herencia es una propiedad de la POO por el cual una clase puede heredar atributos de otra
(al igual que los seres vivos heredan de sus ancestros, las clases también pueden).
La clase de la que se hereda se conoce como clase padre o Superclase, y la que hereda es la
clase hijo o Subclase.
Como curiosidad, en Kotlin t0do tiene la superclase Any, de la que hereda t0do lo demás
 */

fun main() {
    //Para que la clase pueda heredarse, debemos establecerla como open (abierta)
    open class Persona(val name: String, val age: Int) {
        val extremidades = 4
        val idioma = "español"

        fun hablar(): String {
            return "Hola qué tal"
        }
    }

    class Programador(name: String, age: Int, val programmingLang: String): Persona(name, age) {
        fun trabajar(): String {
            return "Estoy trabajando usando $programmingLang"
        }
    }

    class Child(name: String, age: Int, val colegio: Boolean): Persona(name, age) {
        fun escolarizado(): String {
            return if (colegio) {
                "Soy $name y voy al colegio"
            } else {
                "Soy $name y no voy al colegio"
            }
        }
    }

    val antonio = Programador("Antonio", 36, "Kotlin")
    println("Soy Antonio y hablo ${antonio.idioma}")
    println(antonio.trabajar())
    val jose = Child("Jose", 9, true)
    println(jose.escolarizado())

    //Hay lenguajes que soportan Herencia Múltiple (que una clase herede de más de 1 clase), pero
    //Kotlin no es el caso

    /*
    Overriding
    Al heredar, hay atributos que pueden cambiar. Para estos casos, se pueden sobreescribir aquellos atributos
    o métodos en las clases hijas. Para ello
     */

    open class Monkey {
        open val pelo = "Mucho pelo"
        open val andar = "Encorbado"
        val extremidades = 4

        open fun sonido(): String {
            return "Uhahaha"
        }

        fun cogerAlgo(): String {
            return "He cogido algo"
        }
    }

    class Humano(val name: String): Monkey() {
        override val pelo = "Poco pelo"
        override val andar = "Erguido"

        override fun sonido(): String {
            return "Hola, soy $name"
        }
    }
    val paco = Humano("Paco")
    println(paco.andar)
    println(paco.extremidades)   //Si no las sobreescribes, los parámetros serán los de la superclase
    println(paco.cogerAlgo())

    /*
    DATO: cuando se inicializa el programa, empieza por las clases base y de ahí va subiendo a las que
    van heredando de éstas
     */

    open class Base {
        init{
            println("Soy la clase Base")
        }
    }
    open class Heredada: Base() {
        init{
            println("Estoy heredando de la clase Base")
        }
    }
    class Heredada2: Heredada() {
        init{
            println("Estoy heredando de la clase Heredada, que a su vez hereda de la Base")
        }
    }
    Heredada2()

    /*
    Aunque inicialicemos un objeto en una clase que hereda de otra, podemos llamar a algun/os atributos
    de la superclase usando "super"
     */
    open class DibujarFigura(val shape: String) {
        open fun drawShape(): String {
            return "Dibujando $shape"
        }
    }

    class funcionarFigura(shape: String, val function: Boolean): DibujarFigura(shape) {
        override fun drawShape(): String {
            if (function) {
                return "Ya he dibujado la figura ${super.drawShape()} y funciono"
            } else {
                return "Ya he dibujado la figura ${super.drawShape()} pero no funciono aún"
            }
        }
    }
    val figura = funcionarFigura("rectángulo", true)
    println(figura.drawShape())
}
