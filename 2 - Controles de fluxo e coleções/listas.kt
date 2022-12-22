// No Kotlin: Lista é uma estrutura ordenada
// List() é imutavel
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers // Referencia ao original

fun addSystemUser(newUser: Int){
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int>{
   	return sudoers
}

fun main() {
    addSystemUser(4)
    addSystemUser(5)
    println("Total sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Info user: $i")
    }    
    
    //getSysSudoers().add(7)
    
}