/*
* Loops and Iterators
*
* FOR Loop
* */
fun main(args : Array<String>) {

    // i -> counter variable
    // Condition verification
    // inc/dec the counter
    var i :Int = 1
    while(i < 10){
        if (i % 2 == 0)
            println(i)
        i++
    }

    println("Odd Numbers - Do While loop")
    i = 1
    do {
        if (i % 2 != 0)
            println(i)
        i++
    } while(i < 10)
}
