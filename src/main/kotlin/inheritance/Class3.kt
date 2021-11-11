package inheritance

open class Lion(val name: String, var origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1

fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.origin = "korea"// 2
    lion.sayHello()
}