package `4_Arrays`

import kotlin.math.sqrt

/**
 * Kotlin program to calculate standard deviation
 */

object MultiplyFloatingNumbers {
    fun ex1() {
        //  1. Program to calculate standard Deviation
        val numArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0)
        val SD = calculateSD(numArray)
        System.out.format("Standard Deviation = %.6f", SD)
    }

    private fun calculateSD(numArray: DoubleArray): Double {
        var sum = 0.0
        var standardDeviation = 0.0
        for (num in numArray) {
            sum += num
        }

        val mean = sum / 10
        for (num in numArray) {
            standardDeviation += Math.pow(num - mean, 2.0)
        }

        return sqrt(standardDeviation / 10)
    }
}

fun main() {
    MultiplyFloatingNumbers.ex1()

}

