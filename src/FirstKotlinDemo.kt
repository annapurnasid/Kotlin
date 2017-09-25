/*
* Calling Java function from Kotlin file
*
* Calling Kotlin function from Java File
* */
fun main(args : Array<String>) {
    var product : Int = JavaDemo.product(3, 9)
    println("Java output is : $product")
}

fun sum(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}

/*
public class FirstKotlinDemoKt {
    public static void main(String[] args){

    }
    public static int sum(int num1, int num2) {
        return num1 * num2;
    }
}
*/