package br.com.everton.section7._0705

class Point(var x: Int, var y: Int, var z: Int) {

    /*
        Classes que não são data tem que criar os operadores component de forma explícita.
        As Classes data criam os operadores component automaticamente
     */

    operator fun component1() = x
    operator fun component2() = y
    operator fun component3() = z
}