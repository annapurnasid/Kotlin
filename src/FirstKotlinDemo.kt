/*
* Lambdas and High Level Functions
*
* Lambdas - Functions without name
* High Level Functions
* - accepts function as arguments
* - Returns function
* - Both of them
*
* - Important for Android Application Development
* */
fun main(args : Array<String>) {

    var objDemo = Demo()
    objDemo.getGreater(2, 4)

    var testLambda : (Int) -> (Unit) = {num : Int -> println("Greater no is: $num") }

    objDemo.getGreater(2, 4, testLambda)

    objDemo.getGreater(4, 0, {num : Int -> println("Greater no is: $num") })

}

class Demo {
    fun getGreater (num1 : Int, num2 : Int) : Unit {
        var big = if (num1 > num2)
            num1
        else
            num2
        println("Greater is: $big")
    }

    // High level function with Lambda as parameter
    fun getGreater(num1 : Int, num2 : Int, myLambda : (Int) -> (Unit)) {
        var big = if (num1 > num2)
            num1
        else
            num2
        myLambda(big) // println("Greater no is: $big")
    }
}
