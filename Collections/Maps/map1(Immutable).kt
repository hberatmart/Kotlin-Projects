fun main() {
    var map = mapOf<Int, String>(1 to "Berat", 2 to "Yalcin", 3 to "Ferit", 4 to "Ali") //fixed
    for (key in map.keys) println("Key: $key, Value: ${map[key]}")
}