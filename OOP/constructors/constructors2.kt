fun main() {
    val fN = fullName("Berat", "Mart")
    println("${fN.firstName} ${fN.lastName}")
}


class fullName {
    var firstName: String? = null
    var lastName: String? = null

    constructor(firstName: String, lastName: String){
        this.firstName = firstName
        this.lastName = lastName
    }



}