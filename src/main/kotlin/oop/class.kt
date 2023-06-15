package oop

class Employee{
    var name: String = ""
    private var age: Int = 0
    private var gender: Char = 'M'
    private var salary: Double = 0.toDouble()

    fun insertValues(name: String, age: Int, gender: Char, salary: Double){
        this.name = name
        this.age = age
        this.gender = gender
        this.salary = salary
        println("Name of the employee: $name")
        println("Age of the employee: $age")
        println("Gender: $gender")
        println("Salary of the employee: $salary")
    }

    fun insertName(name: String){
        this.name = name
    }
}

fun main() {

    // creating multiple objects
    val obj = Employee()

    // object 2 of class employee
    val obj2 = Employee()

    //accessing the member function
    obj.insertValues("fatiq", 50, 'M', 500000.00)

    // accessing the member function
    obj2.insertName("hussnain")

    // accessing the name property of class
    println("Name of the new employee: ${obj2.name}")

}