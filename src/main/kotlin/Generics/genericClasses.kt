package Generics

import Classes.Customer

class MutableStack<E>(vararg  items: E){
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"

    fun <E> mutableStackOf(vararg element: E) = MutableStack(elements)
}

fun main(){

    val stack2 = MutableStack(0.62, 3.14, 2.7)
    println(stack2.size())
    stack2.push(11.1)
    println(stack2.toString())

    val stack = mutableSetOf(0.62, 3.14, 2.7)
    println(stack)
}