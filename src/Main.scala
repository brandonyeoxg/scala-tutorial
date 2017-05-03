import scala.util.matching.Regex

object Main {
    def main(args : Array[String]) {
        val pattern = "Scala".r
        val str = "Scala is Scalable and cool"
        
        println(pattern findFirstIn str)

        val nextPattern = new Regex("(S|s)cala")
        val nextStr = "Scala is scalable and cool"
        println((nextPattern findAllIn str).mkString(","))
        println(nextPattern replaceFirstIn(str, "Java"))
        
        // Java style regex
        val patternRegex = new Regex("abl[ae]\\d+")
        val strRegex = "ablaw is able1 and cool"
        println((patternRegex findAllIn strRegex).mkString(","))
    }
}
