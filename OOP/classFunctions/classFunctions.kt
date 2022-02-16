class Car2(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive(){
        println("Wroooom!")
    }

    // Class function with parameters
    fun speed(maxspeed: Int){
        println("Max speed is: $maxspeed")
    }
}

fun main(){
    val c1 = Car2("Ford", "Mustang", 1969)
    println(c1.model)
    //cal the function
    c1.drive()
    c1.speed(250)
}
