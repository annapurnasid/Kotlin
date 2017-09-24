/*
* Ranges and Dot operators
* */
fun main(args : Array<String>) {

    // 1, 2, 3, 4, 5
    var range1 = 1..5

    // 1, 2, 3, 4, 5
    var range2 = 1.rangeTo(5)

    // 5, 4, 3, 2, 1
    var range3 = 5 downTo 1

    // 5, 4, 3, 2, 1
    var range4 = 5.downTo(1)

    // 1, 3, 5
    var range5 = 1..5 step 2

    // 5, 3, 1
    var range6 = 5 downTo 1 step 2

    // 'a', 'b', 'c', 'd', 'e'.....'z'
    var range7 = 'a'..'z'
}
