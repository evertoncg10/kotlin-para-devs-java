package br.com.everton.section04._0405

fun main() {
    /*
    If no Kotlin é uma expressão e não uma instrução como no Java.
    Instrução(Statement) - não retornam valor.
    Expressão(Expression) - retornam valor.
    */


    val myInt = 199
    val aInt: Int = 7

    //Exemplo if ternário em Java
    //int lowest = (myInt < aInt) ? myInt : aInt;

    //Exemplo if ternário em Kotlin
    val lowest = if (myInt < aInt) myInt else aInt

    val temperatura = 26

    val isAirConditionerOn = if (temperatura >= 26) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}