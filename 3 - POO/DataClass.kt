// Automatiza várias implementações (get, set, Equals, ToString...)
data class User(val name: String, val id: Int) {           
    override fun equals(other: Any?) =
        other is User && other.id == this.id               // Comparar apenas o ID
}

fun main() {
    val user = User("Alex", 1)
    println(user)                                          // Melhor de visualizar

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // Cria uma copia igual
    println(user === user.copy())                          // Endereço de memória diferente
    println(user.copy("Max"))                              // 8
    println(user.copy(id = 3))                             // 9

    println("name = ${user.component1()}")                 // 10
    println("id = ${user.component2()}")
}