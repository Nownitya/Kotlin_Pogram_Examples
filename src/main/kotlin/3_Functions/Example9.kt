package `3_Functions`

import kotlin.math.pow

/**
 * Kotlin Program to convert Binary number to Octal and vice-versa.
 */

object ConvertBinaryToOctal {
    fun ex1() {
        //  1. Program to convert Binary to Octal
        val binary: Long = 101001
        val octal = convertBinaryToOctal(binary)
        println("$binary in binary = $octal in octal")
    }

    private fun convertBinaryToOctal(binaryNumber: Long): Int {
        var binaryNumber = binaryNumber
        var octalNumber = 0
        var decimalNumber = 0
        var i = 0

        while (binaryNumber.toInt() != 0) {
            decimalNumber += (binaryNumber % 10 * 2.0.pow(i.toDouble())).toInt()
            ++i
            binaryNumber /= 10
        }

        i = 1
        while (decimalNumber != 0) {
            octalNumber += decimalNumber % 8 * i
            decimalNumber /= 8
            i *= 10
        }
        return octalNumber
    }

    /****************************************************************
     *  Binary To Decimal                                           *
     *  1 * 25 + 0 * 24 + 1 * 23 + 0 * 22 + 0 * 21 + 1 * 20 = 41    *
     *                                                              *
     *  Decimal to Octal                                            *
     *  8 | 41                                                      *
     *  8 | 5 -- 1                                                  *
     *  8 | 0 -- 5                                                  *
     *  (51)                                                        *
     ****************************************************************/

    fun ex2() {
        //  2. Program to convert Octal to Binary
        val octal = 67
        val binary = convertOctalToBinary(octal)
        println("$octal in octal = $binary in binary")
    }
    private fun convertOctalToBinary(octalNumber: Int): Long {
        var octalNumber = octalNumber
        var decimalNumber = 0
        var i = 0
        var binaryNumber: Long = 0

        while (octalNumber != 0) {
            decimalNumber += (octalNumber % 10 * Math.pow(8.0, i.toDouble())).toInt()
            ++i
            octalNumber /= 10
        }
        i = 1
        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2 * i).toLong()
            decimalNumber /= 2
            i *= 10

        }
        return binaryNumber

    }

    /********************************
     *  Octal To Decimal            *
     *  6 * 81 + 7 * 80 = 55        *
     *                              *
     *  Decimal to Binary           *
     *  2 | 55                      *
     *  2 | 27 -- 1                 *
     *  2 | 13 -- 1                 *
     *  2 | 6  -- 1                 *
     *  2 | 3  -- 0                 *
     *  2 | 1  -- 1                 *
     *  2 | 0  -- 1                 *
     *  (110111)                    *
     ********************************/
}



fun main() {
    ConvertBinaryToOctal.ex1()
    println()
    ConvertBinaryToOctal.ex2()

}