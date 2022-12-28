// Pode ser utilizada por outra classa : Extendida
open class Dog {                
    open fun sayHello() {       
        println("wow wow!")
    }
}

// 
class Yorkshire : Dog() {       
    override fun sayHello() {   // Sobreescrita
        println("wif wif!")
    }
}

fun main() {
    // Polimorfismo : Tratando ele como um cachorro
    val dog: Dog = Yorkshire()
    dog.sayHello()
}