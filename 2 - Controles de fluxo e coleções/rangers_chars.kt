fun main() {
   for (c in 'a'..'d'){
       print(c)
   }
   print(" ")
   
   for (c in 'z' downTo 's'){
       print(c)
   }
   println(" ")
   
   val x = 2
   if (x in 1..2){
       print("x is in range from 1 to 5")
   } 
   println(" ")
   
   if (x !in 6..10){
       print("x is not in range from 6 to 10")
   } 
   println(" ")

}