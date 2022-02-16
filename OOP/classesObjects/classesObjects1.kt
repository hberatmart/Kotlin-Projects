// Create a class
class Car{
    var brand = ""
    var model = ""
    var year = 0
}

fun main() {
    // Create a c1 object of the car class
    val c1 = Car()
    val c2 = Car()

    // Access the properties and add some values to it
    //c1 car
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    //c2 car
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}