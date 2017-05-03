object Main {
    def main(args : Array[String]) {
        val pattern = "Scala".r
        val str = "Scala is Scalable and cool"
        
        println(pattern findFirstIn str)
    }
}
