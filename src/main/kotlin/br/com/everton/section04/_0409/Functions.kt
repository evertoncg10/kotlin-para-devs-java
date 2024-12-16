package br.com.everton.section04._0409

fun main() {
    println("10 + 20 = ${myMatchFunction(10, 20)}")

    println("15 + 25 = ${myExpressionBodyFunction(15, 25)}")

    println("10 + 10 = ${myExpressionBodyFunctionWithInference(10, 10)}")

    println("10 + 10 = ${myFunctionWithDefauls(30, 12)}")

    println("10 + 10 = ${myFunctionWithDefauls(31, 18, "Hello")}")

    println("Defaul SUM = ${myFunctionWithDefauls(message = "Hello2")}")
}

fun myMatchFunction(number1: Int, number2: Int): Int {
    return number1 + number2
}

// função com expression body
fun myExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2

// função com expression body com inferência
fun myExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2

// função com valores default
fun myFunctionWithDefauls(number1: Int = 10, number2: Int = 20, message: String = "Hi"): Int {
    val result = number1 + number2
    println(message)
    return result
}