fun main() {
    println(cases("hello"))
    println(cases(1))
    println(cases(0L))
    println(cases(MyClass()))
}

fun cases(obj: Any) : Any{
    // When é parecido com o switch case
    val result = when(obj){
        1 -> "One"
        "hello" -> "Saudação"
        is Long -> "Tipo long"
        !is String -> "Não é uma string"
        else -> 42
    }
    
    return result
}

class MyClass