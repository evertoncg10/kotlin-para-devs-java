package br.com.everton.section7._0704

@Deprecated("Use the Animal class instead", ReplaceWith("Animal"))
class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(fisrtName: String, lastName: String, middleName: String): this(fisrtName, lastName)
}