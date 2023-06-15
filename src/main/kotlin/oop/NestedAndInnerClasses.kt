package oop

///////////////////////////// Inner Class ////////////////
class Car{
    var make: String = ""
    var model: String = ""
    var year: Int = 0       // we cannot use late init var with Int

    inner class Engine{

        var horsePower: Int = 0
        var cylinders: Int = 0

        fun getEngineInfo(): String {
            return "$horsePower horsepower, $cylinders cylinders, in a $make $model"
        }
    }

    fun getInfo(): String {
        return "$make $model, year $year"
    }
}

class OuterClass {
    private val outerProperty = "Outer Property"

    inner class InnerClass {
        fun innerMethod() {
            println("Inner Method")
            println("Outer Property: $outerProperty")
        }
    }
}

///////////////////// Nested Class //////////////////////

class NestedOuterClass{
    var str = "outer class"
    class NestedInnerClass{
        val firstName = "fatiq"
        val lastName = "hussnain"
        var s1 = "Nested class"

        // nested class member function
        fun nestfunc(str2: String): String {
            val s2 = s1.plus(str2)
            return s2
        }
    }
}

fun main() {

    //////////////// Inner Class /////////////////////
    val myCar = Car()
    myCar.make = "Toyota"
    myCar.model = "Camry"
    myCar.year = 2020

    val engine = myCar.Engine()
//    engine.horsepower = 250
    engine.cylinders = 6

    println(engine.getEngineInfo())


    val outerObj = OuterClass()
    val innerObj = outerObj.InnerClass()
    innerObj.innerMethod()


    //////////////// Nested Class ///////////////////

    // accessing member of Nested class
    print(NestedOuterClass.NestedInnerClass().firstName)
    print(" ")
    println(NestedOuterClass.NestedInnerClass().lastName)
}