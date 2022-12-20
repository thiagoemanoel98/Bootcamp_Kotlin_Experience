class MutableStack<E>(vararg items: E){
	
    private val elements = items.toMutableList() // lista
    
    fun push(element: E) = elements.add(element) 
    
    fun peek(): E = elements.last() // ver o ultimo sem remover
    
    fun pop(): E = elements.removeAt(elements.size -1)
    
    fun isEmpty() = elements.isEmpty()
    
    fun size() = elements.size
    
    // sobrescrita do método
    override fun toString() = "MutableStack(${elements.joinToString()})"
    
}


fun main() {

    val stack = MutableStack(0.1, 0.55, 2.2, 1.8)
        
    println(stack)    
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }    
    
       
}