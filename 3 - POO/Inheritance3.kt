open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

// Propaga o "name" para a superClass Lion
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    // Polimorfismo
    val lion: Lion = Asiatic("Rufo")                              
    lion.sayHello()
}