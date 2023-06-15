package oop

fun main() {

    data class Man(val roll: Int, val name: String, val height: Int)

    //declaring a variable of the above data class
    //and initializing values to all parameters

    val man1 = Man(1, "man", 50)

    //printing all the details of the data class
    println(man1.toString())



    // Other functions are also there i.e equals(), hashmap()...
}