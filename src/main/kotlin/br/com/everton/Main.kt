package br.com.everton

fun main(args: Array<String>) {
    var name = if(args.isNotEmpty()) args[0] else "Kotlin World"
    println("Hello, $name!!!")
}
