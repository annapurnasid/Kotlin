/*
* Nullability in Kotlin
*
* Explicit call to throw NullPointerException
* External Java Code
* Inconsistency in initialization
* use of !! Operator
* */
fun main(args : Array<String>) {
    var element : String = "triangle"
    println(element + " length = " + element.length)
    var figure : String? = "circle"
    figure = null

    // Safe Call Operator -> ?
    println(figure?.length)

    // Elvis Operator -> ?:
    var len = figure?.length ?: -1
    println("Len = " + len)

    // Get NPE using !!
//    println(figure!!.length)

}
