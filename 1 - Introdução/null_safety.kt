/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
package me.dio.helloworld


fun main() {
    
	var neverNull: String = "This can't br null"
    //neverNull = null 
    
    var nullable: String? = "You can keep a null here"
    nullable = null 
    
    var inferredNotNull = "The compiler assumes not-null"
    //inferredNotNull = null 
    
    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }
    
    println(strLength(neverNull))
    println(strLength(nullable))
  	
}