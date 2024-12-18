package br.com.everton.section05._0504

/*
    Pode ter métodos implementados, e quando isso ocorrer o método é herdado
    Pode ter somente a assinatura do método, e quando isso ocorrer o método deverá
    ser implementado por quem implementar a interface
 */

interface Vehicle {
    val automakerName: String

    fun start() {
        println("Vruuuummmm")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}