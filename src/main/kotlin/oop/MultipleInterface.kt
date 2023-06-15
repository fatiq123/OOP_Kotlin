package oop

interface Interface {
    val a: Int
    val b: String
        get() = "Hello"
}

interface InterfaceMethods {
    fun description()
}

class MultipleInterface : Interface, InterfaceMethods {

    override val a: Int = 10

    override fun description() {
        println("Multiple Interfaces implemented")
    }

    override val b: String
        get() = "value of b is override"

}

fun main() {
    val obj = MultipleInterface()
    obj.description()
    println(obj.b)
    println(obj.a)
}