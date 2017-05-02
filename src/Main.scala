import Array._

object Main {
    def main(args : Array[String]) {
        // 1D Matrix
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
    
        // 2D Matrix
        var myMatrix = ofDim[Int](3,3)
        
        for (i <- 0 to 2) {
            for (j <- 0 to 2) {
                myMatrix(i)(j) = j;
            }
        }
        
        for (i <- 0 to 2) {
            for (j <- 0 to 2) {
                print(" " + myMatrix(i)(j))
            }
            println()
        }
        
        // Concat 2D matrix
        var myList1 = Array(1.9, 2.9, 3.4, 3.5)
        var myList2 = Array(8.9, 7.9, 0.4, 1.5)
        
        var myList3 = concat(myList1, myList2)
        
        // Print all the array elements
        for (x <- myList3) {
            println(x)
        }
        
        // Array with Range
        var intList1 = range(10, 20, 2)
        var intList2 = range(10, 20)
        
        for (x <- 0 to (intList1.length - 1)) {
            print(" " + intList1(x))
        }
        
        println()
        
        for (y <- 0 to (intList2.length - 1)) {
            print(" " + intList2(y))
        }
    }
}
