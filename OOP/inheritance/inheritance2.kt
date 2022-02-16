import Businessman as Businessman

fun main() {
    val teacher = Teacher("Ferit", 24)
    teacher.giveAlesson()
    println()

    val businessman =  Businessman("Irem", 22)
    businessman.working()
    println()

    val footballer = Footballer("Berat", 23)
    footballer.playFo0tball()
}

open class Person(var name: String? = null, var age: Int? = null) {
    init {
        println("Name: ${name}\n Age: ${age}")
    }
}

class Teacher(name: String, age: Int): Person(name, age) {
    fun giveAlesson() = println("$name gives a lecture")
}

class Businessman(name: String, age: Int): Person(name, age) {
    fun working() = println("$name is working")
}

class Footballer(name: String, age: Int): Person(name, age) {
    fun playFo0tball() = println("$name is playing football")
}