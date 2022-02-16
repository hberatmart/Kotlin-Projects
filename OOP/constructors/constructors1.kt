class Car1(var brand: String, var model: String, var year: Int)



fun main() {
    val c1 = Car1("Ford", "Mustang", 1969)
    val c2 = Car1("BMW", "X5", 1999)
    val c3 = Car1("Tesla", "Model S", 2020)

    println("Car1\n ${c1.brand}\n ${c1.model}\n ${c1.year}\n")
    println("Car2\n ${c2.brand}\n ${c2.model}\n ${c2.year}\n")
    println("Car3\n ${c3.brand}\n ${c3.model}\n ${c3.year}\n")
}