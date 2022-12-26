fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // Filtra os positivos

    val negatives = numbers.filter { it < 0 }      // Filtra os negativos
    
    val doubled = numbers.map { x -> x * 2 }      // 2

	val tripled = numbers.map { it * 3 }          // 3

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
    println("doubled Numbers: $doubled")
    println("tripled Numbers: $tripled")
       
}
