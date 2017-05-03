import java.io.PrintWriter
import java.io.File

object Main {
    def main(args : Array[String]) {
        val writer = new PrintWriter(new File("test.txt"))
        
        writer.write("Hello Scala")
        writer.close()
    }
}
