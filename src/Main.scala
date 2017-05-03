import java.io.PrintWriter
import java.io.File
import scala.io.Source

object Main {
    def main(args : Array[String]) {
//        // Writing to a file
//        val writer = new PrintWriter(new File("test.txt"))
//        
//        writer.write("Hello Scala")
//        writer.close()

//        // Reading user input
//        print("Please enter your input: ")
//        val line = Console.readLine
//        println("Thanks, you just typed: " + line)
        
        println("Following is the content read: ")
        Source.fromFile("test.txt").foreach {
            print
        }
    }
}
