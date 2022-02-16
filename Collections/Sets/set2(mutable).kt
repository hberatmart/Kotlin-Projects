fun main() {
    var set1 = mutableSetOf<Int>(1, 2, 3, 4, 5, 5, 5, 6, 7, 8)
    println("----Size----")
    println(set1.size)
    println()

    println("----add----(9)")
    set1.add(9)
    for (item in set1) println(item)
    println()

    println("----Remove----(8)")
    set1.remove(8)
    for (item in set1) println(item)
    println()

    println("----hashSetOf----")
    var set2 = hashSetOf<Int>(1, 2, 3, 4, 5, 5, 5, 6, 7, 8)
    for (item in set2) println(item)


}