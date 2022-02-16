fun main(){
    var list = arrayListOf<String>("Book", "Pen", "Paper", "Newspaper", "Eraser")

    println(list.reversed())
    println()

    for (item in list) println(item)

    list.swap(0, 4)

    println()

    for (item in list) println(item)
}

fun ArrayList<String>.swap(x: Int, y: Int) {
    val helper = this[x]
    this[x] = this[y]
    this[y] = helper

}