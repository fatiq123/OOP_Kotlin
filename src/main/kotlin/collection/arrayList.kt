package collection

import java.util.ArrayList

//Note ArrayList is a Dynamic List in which we can add elements delete and do more things

//ArrayList class is used to create a dynamic array in Kotlin.
//Dynamic array states that we can increase or decrease the size of an array as pre-requisites.
//It also provides read and write functionalities. ArrayList may contain duplicates and is non-synchronized in nature.
//We use ArrayList to access the index of the specified element, convert an Arraylist into string or another array and many more functionalities.

fun main() {

    val arrayList = ArrayList<String>()
    arrayList.add("Kotlin")
    for (i in arrayList){
        println(i)
    }
    arrayList.add("Kotlin")

    arrayList.add(1, "for")
    for (i in arrayList){
        println(i)
    }


    val newArrayList = ArrayList<String>()
    newArrayList.addAll(arrayList)
    for (i in newArrayList){
        println(i)
    }


//    ArrayList COnstructor
    var arrayListConstructor = arrayListOf(1,2,3)
    arrayListConstructor.elementAt(0)
    arrayListConstructor.removeAt(0)

}