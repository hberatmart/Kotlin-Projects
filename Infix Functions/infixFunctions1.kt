fun main(){
    //1 downTo 2
    //or
    //2.downTo(1)
    val result = 4 add 5
    println(result)

    val result2 = 5.add(4)
    println(result2)

    println("Berat ".concat("Mart"))
    println("Berat " concat "Mart")

}

infix fun Int.add(number: Int): Int = this + number

infix fun String.concat(lastname: String): String = this + lastname