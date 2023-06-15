package oop

//Kotlin's inheritance primary constructor:
// base class
open class Boss(name: String, age: Int){
    init {
        println("name of boss is : $name")
        println("age of boss is : $age")
    }
}

// derived class
class CEO(name: String, age: Int, salary: Double): Boss(name,age) {
    init {
        println("salary per anum is $salary crore rupees")
    }
}



// Kotlin's inheritance secondary constructor
// base class
open class Ceo{
    constructor(name: String, age: Int){
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}

// derived class
class Employer: Ceo {
    constructor(name: String, age: Int, salary: Double): super(name, age){
        println("Salary per anum is $salary million dollars")
    }
}




fun main() {
    val ceo = CEO("fatiq", 20, 100.0)

    val emp = Employer("christina", 20, 100.0)
}