package br.com.everton.section6._0602

fun main() {
    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())

    val dog = Animal("Totó", "dog", 30)
    println(dog.show())

    cat.weight = 13
    println(cat.show())
}