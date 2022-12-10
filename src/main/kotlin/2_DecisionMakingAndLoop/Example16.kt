package `2_DecisionMakingAndLoop`

import kotlin.math.pow

/**
 * Kotlin Program to calculate the power of a number
 */

class Power {
    fun ex1() {
        //  1. Calculate the power of a number using pow()
        val base = 3
        var exponent = 4
        val expo = exponent
        var result: Long = 1

        while (exponent != 0) {
            result *= base.toLong()
            --exponent
        }
        println("$base to the power $expo = $result")
    }
    fun ex2() {
        //  1. Calculate power of a number using pow()
        val base = 3
        val exponent = 4
        val result = Math.pow(base.toLong().toDouble(), exponent.toLong().toDouble())

        println("$base to the power $exponent = $result")
    }
    fun ex3() {
        val base = 3
        val exponent = 4
        val result = base.toDouble().pow(exponent.toDouble())

        println("$base to the power $exponent = $result")
    }
}

//infix fun Long.`**`(exponent: Int): Int = toDouble().pow(exponent).toInt()

fun main() {
    val power = Power()
    power.ex1()
    power.ex2()
    power.ex3()

    val base = 578
    val exponent = 4
    println("$base to the $exponent = ${base `**` exponent}")
    println("$base to the $exponent = ${base `***` exponent}")
    println("$base to the $exponent = ${base `****` exponent}")
    println("$base to the $exponent = ${base `*****` exponent}")


    /** var `this` =32
     * `this` += 10
     * print(`this`)\
     **/

}



infix fun Int.`**`(exponent: Int): Int = toDouble().pow(exponent).toInt()

infix fun Int.`***`(exponent: Int): Long = toDouble().pow(exponent).toLong()

infix fun Int.`****`(exponent: Int) : Float = toDouble().pow(exponent).toFloat()
//infix fun Float.`****`(exponent: Int) : Float = this.pow(exponent)

infix fun Int.`*****`(exponent: Int) : Double = toDouble().pow(exponent).toDouble()
//infix fun Double.`****`(exponent: Int) : Double = this.pow(exponent)