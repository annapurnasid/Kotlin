/*
* OOPs - Inheritance
* */
fun main(args : Array<String>) {
    var objDog = Dog()
    objDog.eat()
    objDog.bark()
    objDog.breed = "German Shepherd"
    objDog.color = "Brown"

    var objCat = Cat()
    objCat.eat()
    objCat.meow()
    objCat.age = 2
    objCat.color = "white"
}

open class Animal { // parent/base class
    var color : String = ""
    fun eat() {
        println("Eats")
    }
}

class Dog : Animal() { // child/derived class
    var breed : String = ""
    fun bark() {
        println("Barks")
    }
}
class Cat : Animal(){ // child/derived class
    var age : Int = 1
    fun meow() {
        println("Meows")
    }
}