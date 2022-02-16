/*
object OnjectExample {
    //property
    //metod
}
*/

fun main() {
  val result = MyObject.multiple(2,5)
  println(result)
  println(Math.min(MyObject.number1, MyObject.number2))

  val person = object : Person4() {
      override fun writeCode() {
          println("I don't write code. Because I am not a programmer")

      }
  }

  person.eat()
  person.talk()
  person.writeCode()

  println(person.javaClass)

  val person2 = Person4()
  println(person2.javaClass)
}

object MyObject {
    var number1: Int = 0
    var number2: Int = 1

    fun multiple(num1: Int, num2: Int): Int = num1 * num2
}

open class Person4() {
    fun eat() = println("Eating food")
    fun talk() = println("Talking person")

    open fun writeCode() = println("Writing code")
}