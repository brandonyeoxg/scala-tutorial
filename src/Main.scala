object Main {
    val greeting : String = "Hello, world!" 
    def main(args : Array[String]) {
        var floatVar = 12.456
        var intVar = 2000
        var stringVar = "Hello, Scala!"
        
        var fs = printf("The value of the float variable is " + "%f,\n while the value of the integer " 
                + "%d \nand the value of the string varaible is %s", floatVar, intVar, stringVar) 
        println(fs);
        
        val name = "James"
        println(s"Hello, $name")
        println(s"1 + 1 = ${1 + 1}")
        val height = 1.9d
        println(f"$name%s is $height%2.2f meters tall")
    }
}
