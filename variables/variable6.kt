// null variable

fun main(){
    // if we want to define a null variable  we have to use the question mark
    val name: String? = "Berat"
    // If another operator is to be used in printing, a question mark must be used.
    println(name?.length)

    // if we are sure it is not null, we can use this (!!)
    println(name!!.length)
}