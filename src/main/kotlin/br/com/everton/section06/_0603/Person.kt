package br.com.everton.section06._0603

class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(fisrtName: String, lastName: String, middleName: String): this(fisrtName, lastName)
}