package oop

import java.lang.IllegalArgumentException
import java.util.*

class Company {
    var name: String = ""
        get() = field     // getter
        set(value) {         // setter
            field = value
        }
}

class Company2 {
    var name: String = "abc"
        private set

    fun myfun(name: String) {
        this.name = name
    }
}


class Registration(email: String, pwd: String, age: Int, gender: Char) {

    var emailId: String = email
        // Custom Getter
        get() {
            return field.lowercase(Locale.getDefault())
        }
    var password: String = pwd
        // Custom Setter
        set(value) {
            field = if (value.length > 6) value else throw IllegalArgumentException("Passwords is too small")
        }

    var age: Int = age
        // Custom Setter
        set(value) {
            field = if (value > 18) value else throw IllegalArgumentException("Age must be 18+")
        }
    var gender: Char = gender
        // Custom Setter
        set(value) {
            field = if (value == 'M') value else throw IllegalArgumentException("User should be male")
        }
}

class Rectangle(val height: Int, val width: Int){

    val isSquare: Boolean
        get() {
            return height == width
        }
}


fun main(args: Array<String>) {
//    val c = Company()
//    c.name = "GeeksforGeeks" // access setter
//    println(c.name)         // access getter
//
//
//    val c2 = Company2()
//    println("Name of the company is: ${c2.name}")
//    c2.myfun("GeeksforGeeks")
//    println("Name of the new company is: ${c2.name}")




    val geek = Registration("PRAVEENRUHIL1993@GMAIL.COM","Geeks@123",25,'M')

    println(geek.emailId)
    geek.emailId = "GEEKSFORGEEKS@CAREERS.ORG"
    println(geek.emailId)
    println(geek.password)
    println("${geek.age}")
    println("${geek.gender}")

    // throw IllegalArgumentException("Passwords is too small")
    geek.password = "abc"

    // throw IllegalArgumentException("Age should be 18+")
    geek.age= 5

    // throw IllegalArgumentException("User should be male")
    geek.gender = 'F'
}
