package oop


//Note : init blocks gets called before the constructor of this class is called.

class Employeee(var empId: Int = 100, var empName: String = "abc"){
    var id: Int = 0
    var name: String = ""

    init {
        // it will call before constructor is called
        this.empId = id
        this.empName = name

        println("employee id is: $id")
        println("employee name is: $name")

    }
}

fun main() {
    val emp = Employeee(18018, "Sagnik")
    // default value for emp_name will be used here
    val emp2 = Employeee(11011)
    // default values for both parameters because no arguments passed
    val emp3 = Employeee()
}