package oop

interface Dimensions {
    val length: Double
    val breadth: Double
}

interface CalculateParameters : Dimensions {
    fun perimeter()
    fun area()
}

class XYZ : CalculateParameters {

    override val length: Double
        get() = 10.0
    override val breadth: Double
        get() = 15.0

    override fun area() {

        println("Area is ${length * breadth}")
    }

    override fun perimeter() {

        println("Perimeter is ${2*(length+breadth)}")
    }
}



fun main()
{
    val obj = XYZ()
    obj.area()
    obj.perimeter()
}
