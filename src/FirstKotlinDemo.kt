/*
* Class and functions
* */
fun main(args : Array<String>) {
    var element :String
    element = "square"
    println(element)

    // Function call
    display(element)

    // Call function of a class
    var objGeometry = Geometry()
    objGeometry.display(element)
    // Using field variable
    objGeometry.figure1 = element
    println("Element is = " + objGeometry.figure1)
}

class Geometry {
    var figure1 : String = ""
    fun display(figure : String) {
        println("Element is -> " + figure)
    }
}

fun display(figure : String) {
    println("Element is " + figure)
}