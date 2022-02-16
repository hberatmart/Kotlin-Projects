/* codes that help convert to another type;
toByte() toShort(), toInt(), toLong(), toFloat, toDouble() or toChar() */
fun main(){
    val x: Int = 7
    val y = x.toByte()
    println("Byte: $y")

    val a = x.toShort()
    println("Short: $a")

    val b = x.toLong()
    println("Long: $b")

    val c = x.toFloat()
    println("Float: $c")

    val d = x.toDouble()
    println("Double: $d")

    val e = x.toChar()
    println("Char: $e") // Because This is a character
}