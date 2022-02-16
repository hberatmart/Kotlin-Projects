// check if an element exists
fun main(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Ford" in cars){
        println("it exists!")
    } else{
        println("it does not exist.")
    }
}