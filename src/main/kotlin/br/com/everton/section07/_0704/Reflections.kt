package br.com.everton.section07._0704

fun main() {

    val person = Person("Everton", "Gonçalves")
    val kClass = person::class
    println("The class name complete is ${kClass}")
    println("The class name is ${kClass.simpleName}")

    println("kClass.members")
    for (fields in kClass.members) {
        println("Property name = $fields")
    }

    println("")
    println("kClass.java.declaredFields")
    for (fields in kClass.java.declaredFields) {
        println("Property name complete = $fields")
        println("Property name = ${fields.name}")
    }

    println("")
    println("kClass.constructors")
    for (constructor in kClass.constructors) {
        println("Contructor name = $constructor")
        println("Contructor return = ${constructor.returnType}")
        println("Contructor parameters = ${constructor.parameters}")
    }
}