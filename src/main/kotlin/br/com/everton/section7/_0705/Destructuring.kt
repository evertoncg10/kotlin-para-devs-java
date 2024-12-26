package br.com.everton.section7._0705

fun main() {

    showComponents()
    println("-------------------------------------------------------------")

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    println(c3)

    val (xCoordinate, yCoordinate) = c3
    println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")
    println("xCoordinate = ${c3.component1()}")
    println("yCoordinate = ${c3.component2()}")
}

fun showComponents() {
    val myPoint = Point(5000, 500, 60000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}