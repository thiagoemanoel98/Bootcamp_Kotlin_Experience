open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

// Herda uma classe passando um parametro
class SiberianTiger : Tiger(origin = "Siberia")       

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}