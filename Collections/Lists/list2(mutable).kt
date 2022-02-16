fun main(){
    var listPrograms = mutableListOf<String>("Kotlin", "Java", "Python", "Ruby", "C++")
    println("----The first version----")
    for (item in listPrograms) println(item)
    println()

    println("----The element change----")
    listPrograms[1] = "JavaScript"
    for (item in listPrograms) println(item)
    println()

    println("----The element add----")
    listPrograms.add("C#")
    for (item in listPrograms) println(item)
    println()

    println("----delete by element name----")
    listPrograms.remove("java")
    for (item in listPrograms) println(item)
    println()

    println("----delete by element index value")
    listPrograms.removeAt(0)
    for (item in listPrograms) println(item)

}