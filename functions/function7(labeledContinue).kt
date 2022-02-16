fun main(){
    innerLoop@ for (i in 1..4){
        outerLoop@ for (j in 1..5){
            println("i: $i  j: $j")

            if (i == 2) continue@innerLoop
        }
    }
}