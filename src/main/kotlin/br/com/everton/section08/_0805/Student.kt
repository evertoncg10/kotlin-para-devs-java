package br.com.everton.section08._0805

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Alice", 21),
        Student("Bob", 22),
        Student("Tony", 23),
        Student("Dave", 24),
        Student("Everton", 25)
    )
}
