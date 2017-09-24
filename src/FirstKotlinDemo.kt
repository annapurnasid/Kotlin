/*
* Loop Control Statements
*
* Break and Continue
* */
fun main(args : Array<String>) {

    // Break with Labelled FOR
    primaryLoop@ for(i in 1..5) {
        secondaryLoop@ for(j in 1..5) {
            println("i = $i ; j = $j")
            if (i == 3 && j == 3)
                break@primaryLoop
        }
    }

    println ("========")

    // Continue with Labelled FOR
    primaryLoop@ for(i in 1..3) {
        secondaryLoop@ for(j in 1..3) {
            if (i == 2 && j == 2)
                continue@primaryLoop
            println("i = $i ; j = $j")
        }
    }
}
