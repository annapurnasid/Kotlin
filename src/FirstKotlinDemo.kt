/*
* Comments
* Variables, Constants and Data types
* */
fun main(args : Array<String>) {
    var element :String // Mutable
    element = "circle"
    println(element)
    element = "square"
    println(element)
    val figure : String = "rectangle" // Immutable

    // data types examples
    var side : Int = 3
    var length : Float = 2.5f
    var isGeometric : Boolean = true
    println("area of " + element + " is " + side*side)

}

