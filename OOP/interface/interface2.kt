
fun main() {
    val world = World()
    world.hello()
}

interface Turkey {
    fun hello() = println("Hello from Turkey")
}

interface Holland {
    fun hello() = println("Hello from Holland")
}

class World: Turkey, Holland {
    override fun hello() {
        super<Turkey>.hello()
        super<Holland>.hello()
    }

}