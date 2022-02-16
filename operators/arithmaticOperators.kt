/*
Operator	      Name	            Description	                            Example
    +	        Addition	        Adds together two values	            x + y
    -	        Subtraction	        Subtracts one value from another	    x - y
    *	        Multiplication	    Multiplies two values	                x * y
    /	        Division	        Divides one value from another	        x / y
    %	        Modulus	            Returns the division remainder	        x % y
    ++	        Increment	        Increases the value by 1	              ++x
    --	        Decrement	        Decreases the value by 1	              --x
*/

//or

/*
Operator	   Example	    Same As
    =	       x = 5	    x = 5
    +=	       x += 3	    x = x + 3
    -=	       x -= 3	    x = x - 3
    *=	       x *= 3	    x = x * 3
    /=	       x /= 3       x = x / 3
    %=	       x %= 3	    x = x % 3
*/

fun main(){
    var num1 = 10
    var num2 = 2
    val addition = num1 + num2
    println("Addition: $addition")

    val subtraction = num1 - num2
    println("Subtraction: $subtraction")

    val multiplication = num1 * num2
    println("Multiplication: $multiplication")

    val division = num1 / num2
    println("Division: $division")

    var num3 = 3
    val modulus = num1 % num3
    println("Modulus: $modulus")

    val increment = ++num1
    println("Increment: $increment")

    val decrement = --num2
    println("Decrement: $decrement")
}