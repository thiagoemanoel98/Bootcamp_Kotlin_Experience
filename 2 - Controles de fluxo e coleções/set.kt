val openIssues: MutableSet<String> = mutableSetOf("UniqueDescr1", "UniqueDescr2", "UniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean{
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String{
    return if (isAdded) "registred correctly" else "Marked as duplicated and rejected"
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr4"
 
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")       
    
}