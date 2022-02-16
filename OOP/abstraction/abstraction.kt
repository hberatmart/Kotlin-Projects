/*
    Abstraction:
    -> The object can not be derived from an abstract class.
    -> Eğer bir sınıfın içerisinde soyut bir method varsa mutlaka o sınıfta soyut olmalıdır.
    -> Soyut sınıflardan soyut alt sınıflar türetilebilir.
        (Bu durumda üst sınıfın soyut methodunu overrride etmek zorunda değildir.)

 */

fun main() {
    val person = Lawyer("Berat", 23)
    person.jobDescription("law criminal lawyer")
    //person.age(23)

    //val person = Worker() Error?
}

abstract class Worker(name: String? = null, age: Int) {
    /*var name: String? = null
    var age: Int = 0

    constructor(name: String? = null, age: Int) : this() {
        this.name = name
        this.age = age
    }*/

    val sex: String = "Male"
    init {
        println("Name: $name\n Age: $age Sex: $sex")
    }

    //open fun age(age: Int) {
        //println("Age: $age")
    //}

    abstract fun jobDescription(jobDescription: String)
}

class Lawyer(name: String, age: Int): Worker(name, age) {
    //private var age: Int? = null

    override fun jobDescription(jobDescription: String) {
        println(jobDescription)
    }

    //override fun age(age: Int?) {
        //this.age = age
        //super.age(age)
    //}
}