package `3_Functions`

import kotlin.math.pow

/**
 * Kotlin Program to Convert Binary Number to Decimal and vice-versa.
 */

object ConvertBinary {
    fun ex1() {
        //  1. Program to convert binary number to decimal
        val num: Long = 110110111
        val decimal = convertBinaryToDecimal(num)
        println("$num in binary = $decimal in decimal")
    }
    fun convertBinaryToDecimal(num: Long): Int {
        var num = num
        var decimalNumber = 0
        var i = 0
        var remainder: Long

        while (num.toInt() != 0) {
            remainder = num % 10
            num /= 10
            decimalNumber += (remainder * 2.0.pow(i.toDouble())).toInt()
            i++
        }
        return decimalNumber
    }

    fun ex2() {
        //  2. Program to convert Decimal to Binary.
        val num = 19
        //  Convert decimal to binary
        val binary = Integer.toBinaryString(num)
        println("$num in decimal = $binary in binary")
    }

    fun ex3() {
        //  3. Convert decimal number to binary Manually
        val num = 176
        val binary = convertDecimalToBinary(num)
        println("$num in decimal = $binary in binary")
    }
    private fun convertDecimalToBinary(num: Int): Long {
        var n = num
        var binaryNumber: Long = 0
        var remainder: Int
        var i = 1
        var step = 1

        while (n != 0) {
            remainder = n % 2
            System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n / 2)
            n /= 2
            binaryNumber += (remainder * i).toLong()
            i *= 10
        }
        return binaryNumber
    }

}


fun main() {
    ConvertBinary.ex1()
    ConvertBinary.ex2()
    ConvertBinary.ex3()

}