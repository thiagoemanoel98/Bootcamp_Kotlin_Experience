fun main() {
   val authors = setOf("Shakespeare", "Robert Downey Jr", "Chris Evans")
   val whiters = setOf("Robert Downey Jr", "Chris Evans", "Shakespeare")
   
   println(authors == whiters)  // comparação estrutural / Verdade - estrutura identicas
   println(authors === whiters)	// comparação referencial / Endereços de memória diferentes
}