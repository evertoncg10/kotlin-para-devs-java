package br.com.everton.section05._0502

//class Person constructor(firstName: String, lastName: String)
//class Person(firstName: String, lastName: String)
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(fisrtName: String, lastName: String, middleName: String): this(fisrtName, lastName)
}