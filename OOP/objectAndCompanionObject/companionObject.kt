
fun main() {
    val user = User()
    user.func()
    user.name = "Berat"
    println(user.name)

    User.age = 23
    println(User.age)
    User.callMe()
}

class User {
    var name: String? = null

    companion object {
        var age: Int = 20
        fun callMe() = println("called")
    }

    fun func() = println("Function")
}