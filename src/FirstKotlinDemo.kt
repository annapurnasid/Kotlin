/*
* IF as expression
*
* WHEN as expression
* */
fun main(args : Array<String>) {

    var num1 = 4
    var num2 = 5
    var big = if(num1 > num2) {
                   println("check1")
                   num1
               } else {
                   println("check2")
                   num2
               }

    println("Bigger of $num1 and $num2 -> $big")

    var side = 1
    var output = when(side) {
        1 -> "Straight Line"
        3, 6, 7 -> "Triangle/Hexagon/Septagon"
        4 -> "Square"
        else -> "$side not recorded"
    }
    println(output)
}
