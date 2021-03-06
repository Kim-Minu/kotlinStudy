package controlFlow

fun main(){
    //cases("Hello")
    //cases(1)
    //cases(0L)
    //cases(MyClass())
    //cases("hello")

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(1L))
    println(whenAssign(MyClass()))
}

fun cases(obj: Any){
    when(obj){
        1 -> println("one")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

fun whenAssign(obj: Any): Any{
    val result = when (obj){
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }

    return result
}

class MyClass