import com.envato.Geometry

/*
* Class and functions with constructor in other file
* */
fun main(args : Array<String>) {
    var element :String // Mutable
    element = "circle"

    // Calling functions of different file:
    var objGeometry = Geometry(element)
    objGeometry.display()
}
