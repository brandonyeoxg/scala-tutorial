import Array._

object Main {
    def main(args : Array[String]) {
        var myList = Array(1.9, 2.9, 3.4, 3.5)
        
        // Print all the array elements
        for (x <- myList) {
            println(x)
        }
        
        // Summing all elements up
        var sum : Double = 0.0
        
        for (i <- 0 to (myList.length-1)) {
            sum += myList(i)
        }
        println(s"The total sum is $sum") 
        
        var max  = myList(0)
        
        for ( i <- 1 to (myList.length-1)) {
            if (max < myList(i)) {
                max = myList(i)
            }
        }
        println(s"Max is $max")
    }
}
