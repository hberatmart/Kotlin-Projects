/*
Operator	Name	                                                                Description	Example
    && 	    Logical and	Returns true if both statements are true	                x < 5 &&  x < 10
    || 	    Logical or	Returns true if one of the statements is true	            x < 5 || x < 4
    !	    Logical not	Reverse the result, returns false if the result is true
 */

fun main(){
    val x = 12
    if (x != 5 && x < 10){
        println(true)
    }else if (x == 5 || x < 10){
        println(true)
    }else{
        println(false)
    }

}