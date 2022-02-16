/*
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
*/

fun main(){
    val time = 11
    if (time < 10){
        println("Good morning.")
    } else if (time < 20){
        println("Good day.")
    } else {
        println("Good evening.")
    }
}