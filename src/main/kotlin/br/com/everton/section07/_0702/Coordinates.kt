package br.com.everton.section07._0702

data class Coordinates(var x: Int, var y: Int) {
    operator fun plus(other: Coordinates): Coordinates {
        return Coordinates(x + other.x, y + other.y)
    }
}
