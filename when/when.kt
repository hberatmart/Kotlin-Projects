// user Input and When

import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    val day: Int = reader.nextInt()
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}