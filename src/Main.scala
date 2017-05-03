object Main {
    def main(args : Array[String]) {
    /*
        println("Apply method: " + apply("Zara", "gmail.com"))
        println("Unapply method: " + unapply("Zara@gmail.com"))
        println("Unapply method: " + unapply("Zara Ali"))
 	*/
        val x = Main(5)
        println(x)
        
        x match {
            case Main(num) => println(x + " is bigger two times than " + num)
            case _=> println("i cannot calculate")
        }
    }
    def apply(x: Int) = x*2
    def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
    /*
    def apply(user: String, domain: String): String = {
        user + "@" + domain
    }
    
    def unapply(str: String): Option[(String, String)] = {
        val parts = str split "@"
        
        if (parts.length == 2) {
            Some(parts(0), parts(1))
        } else {
            None
        }
    }
    */
}
