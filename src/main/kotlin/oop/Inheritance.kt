package oop

//Kotlin Inheriting property and methods from base class:

// Base Class
open class BaseClass{
    val name = "fatiq"
    fun a(){
        println("Base Class")
    }
}

// Derived Class
class DerivedClass: BaseClass(){
    fun b(){
        println(name)       // inherit the name property
        println("Derived Class")
    }
}




//Kotlin program of inheritance
// base class
open class EmployeeInheritance(name: String, age: Int, salary: Double){
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}

// derived class
class WebDeveloper(name: String, age: Int, salary: Double): EmployeeInheritance(name,age,salary) {
    fun website() {
        println("I am website developer")
        println()
    }
}

// derived class
class AndroidDeveloper(name: String, age: Int, salary: Double): EmployeeInheritance(name,age,salary) {
    fun android() {
        println("I am android developer")
        println()
    }
}

// derived class
class IosDeveloper(name: String, age: Int, salary: Double): EmployeeInheritance(name,age,salary) {
    fun ios() {
        println("I am ios developer")
        println()
    }
}




fun main(args: Array<String>) {
    val derived = DerivedClass()
    derived.a()         // inheriting the  base class function
    derived.b()         // calling derived class function




    val wd = WebDeveloper("Gennady", 25, 10000.0)
    wd.website()
    val ad = AndroidDeveloper("Gaurav", 24,12000.0)
    ad.android()
    val ios = IosDeveloper("Praveen", 26,15000.0)
    ios.ios()
}