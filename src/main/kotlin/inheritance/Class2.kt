package inheritance

open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberian")

fun main(){
    val tiger : Tiger = SiberianTiger()
    tiger.sayHello()
}