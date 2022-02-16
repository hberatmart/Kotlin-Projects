/*
Operator	    Name	                    Example
    ==	        Equal to	                x == y
    !=	        Not equal	                x != y
    >	        Greater than	            x > y
    <	        Less than	                x < y
    >=	        Greater than or equal to	x >= y
    <=	        Less than or equal to	    x <= y
 */

fun main(){
    val x = 5
    val y = 1
    if (x == y){
        println("x is equel to y")
    } else if (x < y){
        println("x is less than y")
    } else if (x > y){
        println("x is greater than y")
    } else {
        println("none")
    }

}