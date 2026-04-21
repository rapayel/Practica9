package mx.itson.edu.practica10

data class User(
    val firstname: String? = null,
    val lastName: String? = null,
    val age: String? = null
){
    override fun toString() = "$firstname\t$lastName\t$age"
}
