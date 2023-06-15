package collection
//Types of Collections
//1. Mutable    Can be changed
//    List – mutableListOf(),arrayListOf() and ArrayList
//    Set – mutableSetOf(), hashSetOf()
//    Map – mutableMapOf(), hashMapOf() and HashMap

//2. Immutable  CANNOT be changed
//    List – listOf() and listOf<T>()
//    Set – setOf()
//    Map – mapOf()

fun main() {

    val immutableList = listOf("ali","ahmed","fatiq")
//    immutableList[0] = "hussnain" means it cannot be changed

//    but we can make mutableList to update
    val mutableList = mutableListOf("ali","ahmed","fatiq")
    mutableList[0] = "hussnain"
    mutableList.add("asghar")

    for (names in mutableList){
        println(names)
    }


//    Note Set gives only unique elements in a Set
    val immutableSet = setOf(1,2,3,2,1)
//    immutableSet[0] = 2 gives error cannot be changed

    val mutableSet = mutableSetOf(1,2,3,2,1)
//    mutableSet[0] = 5 this method don't work for mutable Set
    mutableSet.add(5)
    for (elements in mutableSet){
        println(elements)
    }



    val immutableMap = mapOf("fatiq" to "hussnain", "Muhammad" to "Ali", "Ali" to "Hussnain")
//    immutableMap["fatiq"] = "Ali"  cannot change

    val mutableMap = mutableMapOf("fatiq" to "hussnain", "Muhammad" to "Ali", "Ali" to "Hussnain")
    mutableMap["Ali"] = "Raza"
    for (names in mutableMap){
        println(names.key.plus(names.value))
    }

}