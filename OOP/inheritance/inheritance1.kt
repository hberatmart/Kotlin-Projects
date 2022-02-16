// SuperClass
open class OurNumClass {
    val x = 5
}

// SubClass
class MyNumClass: OurNumClass() {
    fun myFunctions() {
        println(x) // x is now inherited from the superclass
    }
}

// Create an object of MyNumClass and call myFunctions
fun main() {
    val myObj = MyNumClass()
    myObj.myFunctions()
}