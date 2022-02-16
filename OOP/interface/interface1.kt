/*
interface InterfaceName {
    properties
    methods
}
*/

fun main() {
   /*val myInterface = InterfaceImpl()
    println("Name: ${myInterface.name}")

    myInterface.hello()*/
    val bird = Bird()
    println("${bird.family()}\n ${bird.range()}")
}

interface Flyable{

    fun range(): String
}
interface Animal {
    fun family(): String
    /*var name: String

    fun hello() = println("Hello world!")*/
}

class Bird: Animal, Flyable {
    /*override var name: String = "Kotlin"*/
    override fun range(): String {
        return "100km"
    }

    override fun family(): String {
        return "This is from bird animal."
    }

}