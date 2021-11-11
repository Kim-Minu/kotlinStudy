package inheritance

open class Dog{
    open fun sayHello(){
        println("wow wow!")
    }
}

open class Yorkshire : Dog(){
    override fun sayHello() {
        println("wif wif")
    }
}

class Jindo : Yorkshire(){
    override fun sayHello() {
        println("멍 멍")
    }
}

fun main(){
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val do1 : Yorkshire = Jindo()
    do1.sayHello()
}