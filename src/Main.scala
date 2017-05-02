trait Equal {
    def isEqual(x : Any) : Boolean
    def isNotEqual(x : Any) : Boolean = !isEqual(x)
}

class Point(_x : Int, _y : Int) extends Equal {
    var x : Int = _x
    var y : Int = _y
    
    def isEqual(obj : Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x && obj.asInstanceOf[Point].y == y
}

// Unversal traits
trait Printable extends Any {
    def print(): Unit = println(this)
}

class Wrapper(val underlying : Int) extends AnyVal with Printable

object Main {
    def main(args : Array[String]) {
        var p1 = new Point(2, 3)
        var p2 = new Point(2, 4)
        var p3 = new Point(2, 3)
        
        println(p1.isNotEqual(p2))
        println(p1.isNotEqual(p3))
        println(p1.isNotEqual(2))
        
        val w = new Wrapper(3)
        w.print()
    }
}
