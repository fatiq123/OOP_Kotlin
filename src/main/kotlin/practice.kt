fun main(args: Array<String>) {

    val im = IronManSon("fatiq",19)
    println(im)
}

open class IronMan(var name: String, var age: Int, var address: String){

    var n: String = name
    var a: Int = age
    var adr: String = address

    init {
        this.name = "ironman"
        this.age = 20
        this.address = "muridke"
    }
}

class IronManSon(name: String, age: Int): IronMan(name, age, "lhr"){

}