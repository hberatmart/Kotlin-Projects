/*
    Array: mutable (fixed)

    Colections
        Immutable (Read only)(fixed)
            1. Immutable list -> listOf
            2. Immutable Map  -> mapOf
            3. Immutable Set -> setOf

        Mutable (Read and Write)(Dynamic)
            1. Mutable List -> ArrayList, arrayListOf, mutableListOf
            2. Mutable Map -> HashMap, hashMapOf, mutableMapOf
            3. Mutable Set -> mutableSetOf, hashSetOf
 */

fun main(){
    val list = listOf<String>("Kotlin", "Java", "Python", "Ruby","C++") // Immutable (fixed)
    //list[2] = "C" (Elements can not be changed,  deleted, added in the list)
     for (item in 0..list.size - 1) println(list[item])
}