// var can change the value
// val can not be reassigned
fun main(){
    var name: String = "Berat"
    name = "Yalçın"
    println("Hello " + name)

    /*try {
        val lastName = "Mart"
        lastName = "delioglu"
        println(lastName)
        //throw IllegalArgumentException("val can not be reassigned")
    }catch (ex:Exception){
        println("val can not be reassigned")
    }*/
}