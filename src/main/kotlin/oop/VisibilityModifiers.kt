package oop

//1. Public Modifier
// by default public
class A {
    var name: String = "abc"

}

// specified with public modifier
public class B {
    var int2 = 20
    fun display() {
        println("Accessible everywhere")
    }
}


//2. Private Modifier
// class A is accessible from same source file
private class AA {
    private val a = 10
    fun display() {
        // we can access int in the same class
        println(a)
        println("Accessing a successful")
    }
}



//3. Internal Modifier
//Note: Internal modifier benefits in writing APIs and implementations.
internal class AAA {
}
public class BBB {
    internal val a = 10
    internal fun display() {
    }
}
//Here, Class A is only accessible from inside the same module.
//The variable int and function display() are only accessible from inside the same module, even though
// class B can be accessed from anywhere.



//4. Protected
// base class
open class Aa {
    // protected variable
    protected val int = 10
}

// derived class
class Bb: Aa() {
    fun getvalue(): Int {
        // accessed from the subclass
        return int
    }
}




//Overriding of Protected Modifier
// base class
open class Aaa {
    // protected variable
    open protected val int = 10

}

// derived class
class Bbb: Aaa() {
    override val int = 20
    fun getvalue():Int {
        // accessed from the subclass
        return int
    }
}




fun main() {
    val a = AA()
    a.display()
    // can not access 'int': it is private in class A
//    println(a.a)  gives error


    val aa = Bb()
    println("The value of integer is: "+aa.getvalue())
}
