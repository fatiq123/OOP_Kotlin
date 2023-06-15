package oop

interface Vehicle {
    fun start()
    fun stop()
}

class Car2 : Vehicle {
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}


//Default values and Default Methods

interface FirstInterface {
    fun add(a: Int, b: Int = 5)     // If the value for a parameter is not provided at the time of function call, then the default value is used
    fun print()
    {
        println("This is a default method defined in the interface")
    }
}

class InterfaceDemo: FirstInterface{
    override fun add(a: Int, b: Int) {
        val x = a + b
        println("Sum is: $x")
    }

    override fun print() {
        super.print()
        println("It has been overridden")
    }

}




// Properties in Interface
interface InterfaceProperties{
    val a: Int
    val b: String
        get() = "Hello"
}

class PropertiesDemo : InterfaceProperties{
    override val a: Int = 100
    override val b: String = "properties overridden"

}

fun main() {
    val c = Car2()
    c.start()
    c.stop()


    val obj = InterfaceDemo()
    println(obj.add(5))
    obj.print()


    val x = PropertiesDemo()
    println(x.a)
    println(x.b)
}