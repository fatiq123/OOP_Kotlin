package oop


//Kotlin program of using both abstract and non-abstract members in an abstract class

// abstract class
abstract class Manager(val name: String, val experience: Int){

    // Abstract Property (Must be overridden by Subclasses)
    abstract var salary: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun dateOfBirth(date:String)

    // Non-Abstract Method
    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }

}

// derived class
class Engineer(name: String,experience: Int) : Manager(name,experience) {
    override var salary = 500000.00
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }

}







//Overriding a non-abstract open member with an abstract one

open class Livingthings {
    open fun breathe() {
        println("All living things breathe")
    }
}
abstract class Human : Livingthings() {
    abstract override fun breathe()
}
class Dog: Human(){
    override fun breathe() {
        println("Dog can also breathe")
    }
}





//Multiple derived classes
// abstract class
abstract class Calculator {
    abstract fun cal(x: Int, y: Int) : Int
}
// addition of two numbers
class ADD : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x + y
    }
}
// subtraction of two numbers
class Sub : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x - y
    }
}
// multiplication of two numbers
class Mul : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x * y
    }
}



fun main(args: Array<String>) {
    val eng = Engineer("Praveen",2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")




    val lt = Livingthings()
    lt.breathe()
    val d = Dog()
    d.breathe()




    val add: Calculator = ADD()
    val x1 = add.cal(4, 6)
    println("Addition of two numbers $x1")
    val sub: Calculator = Sub()
    val x2 = sub.cal(10,6)
    println("Subtraction of two numbers $x2")
    val mul: Calculator = Mul()
    val x3 = mul.cal(20,6)
    println("Multiplication of two numbers $x3")
}