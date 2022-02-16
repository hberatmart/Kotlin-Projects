/*
toString normal class'da kullanılırsa referansı yazdırır. ama data class'da ne yazıldıysa onu yazar
java da propertyler yazılarak başlar
contract oluşturuluyor
getter ve setter oluşuyor
equels, toString and hashcode methodlarını birlikte kullanıyoruz
sonuç olarak data class oluşmuş oluyor ve kotlin de ne kadar kolay bir şekilde data class oluşturuldu anlaşılmıştır.
 */

package OOP.dataClass

import kotlin.contracts.contract

fun main() {
    val person = Person("Berat", 23)
    println("Name: ${person.name}, Age: ${person.age}")
    println("Name: ${person.component1()}, Age: ${person.component2()}")

    val person2 = person.copy("Yalcin")
    println("Name: ${person2.name}, Age: ${person2.age}")

    println(person2.toString())

    val person3 = person2.copy()
    println("Person hashcode = ${person.hashCode()}\nPerson2 hashcode = ${person2.hashCode()}\nPerson3 hashcode = ${person3.hashCode()}\n")

    if (person.equals(person2)) println("person is equel to person2")
    else println("person is not equel to person2")

    if (person2.equals(person3)) println("person2 is equel to person3")
    else println("person2 is not equel to person3")
}

private data class Person(var name: String, var age: Int)
