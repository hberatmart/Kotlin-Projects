
fun main() {
    val man = Man()
    man.displayAge(22)

    val man2 = Man()
    man2.name = null
    println("Name ${man2.name}")
}


open class Human() {
    open fun displayAge(age: Int) {
        println("Age: $age")
    }

    open var name: String? = null
    get() = field
    set(value) {
        field = value
    }
}

class Man: Human() {
    //It allows us to call the function completely.
    override fun displayAge(age: Int) {
        println("Age: ${age + 2}")

        super.displayAge(age) //The super method makes the function in the inherited class work
    }

    override var name: String? = null
        get() = field // If we use the super method here, it will write null (super.name)
        set(value) {
            field = if (value == null) "No name" else value
        }


}