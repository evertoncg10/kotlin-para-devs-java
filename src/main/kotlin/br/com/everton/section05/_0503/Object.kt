package br.com.everton.section05._0503

fun main() {

    // Object com atributos
    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    // Object com atributos e métodos
    var location2 = object {
        var xCoordinate = 300
        var yCoordinate = 600

        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }

    location2.printIt()

    location2.xCoordinate = 3000
    location2.yCoordinate = 6000
    location2.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last temperature measured = $temperature degress!")
}

//Object declarations
object MySingleton {
    var temperatures = arrayOf(18, 22, 26)

    fun getLastTemperature() = temperatures.last()
}
