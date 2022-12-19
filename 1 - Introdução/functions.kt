/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
package me.dio.helloworld

// Hierarquia de funções
// vararg: passa varios valores do tipo string

fun main() {
    
    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }
    //printAll("hello", "Olá", "Olá")
    
    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }
    
   	printAllWithPrefix("hello", "Olá", "Olá", prefix="Greeting: ")
    
    // Passar o vararg para outra função
    fun log(vararg entries: String){
    	printAll(*entries)  
    }    
    
    log("hello", "Olá", "Olá") 
    
  	
}