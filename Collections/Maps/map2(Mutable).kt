fun main(){
    var map1 = HashMap<Int, String>()
    map1.put(1, "Berat") //== add
    map1.put(2, "Yalcin")
    map1.put(3, "Ferit")
    map1.put(4, "Ali")

    for (key in map1.keys) println("Key: $key, Value: ${map1[key]}")
    println()

    println("----Replace----")
    map1.replace(4, "Fatma")
    for (key in map1.keys) println("Key: $key, Value: ${map1[key]}")
    println()

    println("----Remove----")
    map1.remove(3)
    for (key in map1.keys) println("Key: $key, Value: ${map1[key]}")
    println()

    println("----hashMapOf----")
    var map2 = hashMapOf<Int, String>(1 to "Berat", 2 to "Yalcin", 3 to "Ferit", 4 to "Ali")
    for (key in map2.keys) println("Key: $key, Value: ${map2[key]}")
    println()

    println("----mutableMapOf----")
    var map3 = mutableMapOf<Int, String>(1 to "Berat", 2 to "Yalcin", 3 to "Ferit", 4 to "Ali")
    for (key in map3.keys) println("Key: $key, Value: ${map3[key]}")
}