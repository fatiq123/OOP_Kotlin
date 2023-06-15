package oop

sealed class Demo{

    class A: Demo(){
        fun display(){
            println("Subclass A of Sealed class Demo ")
        }
    }
    class B:Demo(){
        fun display(){
            println("Subclass B of sealed class Demo")
        }
    }
}




// A sealed class with a string property
sealed class Fruit(val x : String)
{
    // Two subclasses of sealed class defined within
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}

// A subclass defined outside the sealed class
class Pomegranate: Fruit("Pomegranate")

// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit: Fruit)
{
    when(fruit)
    {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
    }
}

fun main(args: Array<String>){
    val obj =Demo.B()
    obj.display()
    val obj1=Demo.A()
    obj1.display()




    // Objects of different subclasses created
    val obj2 = Fruit.Apple()
    val obj3 = Fruit.Mango()
    val obj4 = Pomegranate()

    // Function called with different objects
    display(obj2)
    display(obj3)
    display(obj4)
}