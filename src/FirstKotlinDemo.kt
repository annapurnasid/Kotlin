/*
* String Templates - INTERPOLATION
* */

fun main(args : Array<String>) {
    var element : String
    element = "square"
    var side = 4
    println("Length of the string is ${element.length}")

    var objGeometry = Geometry(element)
    objGeometry.display()

    var objSquare = Square(side)
    println("Area of $element = ${objSquare.area()}")
}

class Geometry(var figure : String){
    fun display() {
        println("Element is " + figure)
        println("Element is $figure")
    }
}

class Square(var side : Int) {
    fun area () : Int{
        var area = side * side
        return area
    }
}

