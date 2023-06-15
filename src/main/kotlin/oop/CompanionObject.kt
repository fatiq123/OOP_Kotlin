package oop

fun main() {
    val a = CompanionObject.sum(5,10)
    println(a)
}

class CompanionObject {

    companion object {

        fun sum(a: Int, b: Int) = a + b
    }
}