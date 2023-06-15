package oop

//class with three secondary constructors
class Add {
    constructor(a: Int, b: Int) {
        val c = a + b
        println("Sum of 5, 6 = $c")
    }

    constructor(a: Int, b: Int, c: Int) {
        val d = a + b + c
        println("Sum of 5, 6, 7 = $d")
    }

    constructor(a: Int, b: Int, c: Int, d: Int) {
        val e = a + b + c + d
        println("Sum of 5, 6, 7, 8 = $e")
    }
}

//Kotlin program of two secondary constructors in a class
class SecondaryConstructor {

    // Note here we cannot add var and val to secondary constructor
    constructor(empName: String, empId: Int) {
        val name: String = empName
        val id: Int = empId

        println("employee name is: $name")
        println("employee id is: $id")
    }

    constructor(empName: String, empId: Int, empSalary: Double) {
        val name: String = empName
        val id: Int = empId
        val salary: Double = empSalary

        println("employee name is: $name")
        println("employee id is: $id")
        println("employee salary is: $salary")
    }
}


//Calling one secondary constructor from another
class Sum {

    // calling another secondary using 'this
    constructor(a: Int, b: Int) : this(a, b, 5) {
        val sumOfTwo = a + b
        println("The sum of two numbers 5 and 6 is: $sumOfTwo")
    }

    // this executes first
    constructor(a: Int, b: Int, c: Int) {
        val sumOfThree = a + b + c
        println("Sum of three is: $sumOfThree")
    }

//    constructor(a: Int): this(a,5,5){
//        val sumOfThree = a
//        println("Sum of three is: $sumOfThree")
//    }
}


//Calling parent class secondary constructor from child class secondary constructor
open class Parent {
    constructor(firsName: String, lastName: String, age: Int) {
        val fName: String = firsName
        val lName: String = lastName
        val pAge: Int = age

        println("First Name of person is $fName")
        println("Last Name of person if: $lName")
        println("Age of person is: $pAge")
        println()
    }
}

class Child : Parent {
    constructor(firsName: String, lastName: String) : super(firsName, lastName, 20) {
        val fName: String = firsName
        val lName: String = lastName

        println("First Name of person is $fName")
        println("Last Name of person if: $lName")
    }
}


fun main() {
    Add(5, 5)
    Add(5, 6, 7)
    Add(5, 6, 7, 8)

    SecondaryConstructor("fatiq", 1)
    SecondaryConstructor("ali", 1, 600000.0)

    Sum(5, 6, 7)  // for three parameters
//    Sum(5)
    Sum(5, 5)    // for two parameters


    // parent class secondary constructor
    val c = Child("ali", "raza")
    println(c)
}