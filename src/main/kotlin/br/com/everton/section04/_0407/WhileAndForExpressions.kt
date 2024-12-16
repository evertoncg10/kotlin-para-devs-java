package br.com.everton.section04._0406

fun main() {
    /*
        A expressão when em Kotlin substitui a expressão switch.
        Ela tem 2 tipos: a com argumento e a sem argumento.
    */

    val pizzasOrdered = 7

    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1 -> println("Hungry")
        2 -> println("Very hungry")
        else -> println("Are you sure?")
    }
    // Com condições combinadas
    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3,4,5 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    // Podemos usar condicionais.
    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    // Utilizando Ranges
    when (pizzasOrdered) {
        0 -> println("We need orders")
        in 1 ..2 -> println("Got some orders")
        in 5 .. 9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    // sem argumentos - Pode ser um substituto para ifs e else
    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }


}