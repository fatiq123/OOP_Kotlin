package oop

//Kotlin program of overriding the member function :

// base class
open class Animal {
    open fun run() {
        println("animals can run")
    }
}

// derived class
class Tiger : Animal() {
    override fun run() {        // overrides the fun method of base class
        println("Tiger can run very fast")
    }
}


//Kotlin program of overriding the member property:

// base class
open class Birds {
    open var name: String = "pigeon"
    open var speed = "10 km/hr"

}

// derived class
class Pigeon : Birds() {
    override var name = "Tiger"
    override var speed = "100 km/hr"
}


//Calling the superclass implementation:
// base class
open class Phone() {
    var color = "Rose Gold"
    fun displayCompany(name: String) {
        println("Company is: $name")
    }
}

// derived class
class Iphone : Phone() {
    fun displayColor() {

        // calling the base class property color
        println("Color is: " + super.color)

        // calling the base class member function
        super.displayCompany("Apple")
    }
}


fun main(args: Array<String>) {
    val t = Tiger()
    t.run()
}