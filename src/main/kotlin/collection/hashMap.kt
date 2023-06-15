package collection

fun main() {

    val  hashMap: HashMap<String, Int> = HashMap<String, Int>(4)
    println(hashMap)

    //adding elements to the hashMap using
    // put() function
    hashMap["IronMan"] = 3000
    hashMap["Thor"] = 100
    hashMap["SpiderMan"] = 1100
    hashMap["NickFury"] = 1200
    hashMap["HawkEye"] = 1300

    println(hashMap)

    println("hasMap initial size: ${hashMap.size}")
    hashMap["unknown"]  = 100
    println("hasMap size after adding one more element: ${hashMap.size}")
}