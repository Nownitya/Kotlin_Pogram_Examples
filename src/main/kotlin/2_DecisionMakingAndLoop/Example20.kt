package `2_DecisionMakingAndLoop`

import kotlin.math.pow

/**
 * Kotlin Program to check Armstrong Number
 */

object ArmstrongNumber {
    fun ex1() {
        //  1. Check Armstrong Number for 3-digit number
        val num = 153
        var orignalNumber: Int
        var remainder: Int
        var result = 0

        orignalNumber = num
        while (orignalNumber != 0) {
            remainder = orignalNumber % 10
            result += Math.pow(remainder.toDouble(), 3.0).toInt()
            orignalNumber /= 10
        }
        if (result == num) {
            println("$num is an Armstrong number.")
        } else {
            println("$num is not an Armstrong number.")
        }

    }

    fun ex2() {
        //  2. Check Armstrong number for n digits.
        val number = 23463
        var originalNumber:Int
        var remainder: Int
        var result = 0
        var n = 0

        originalNumber = number

        while (originalNumber != 0) {
            originalNumber /= 10
            ++n
        }

        originalNumber = number

        while (originalNumber != 0) {
            remainder = originalNumber % 10
            result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
            originalNumber /= 10
        }
        if (result == number) {
            println("$number is an Armstrong number.")
        } else {
            println("$number is not an Armstrong number.")
        }
    }

    fun ex3() {
        var number = 153
        var result = 0
        var digit: Int
        var n = number
        val power = Math.floor(Math.log10(((if (number == 0) 1 else number).toDouble()))).toInt() + 1


        while (n != 0) {
            digit = n % 10
            result += Math.pow(digit.toDouble(), power.toDouble()).toInt()
            n /= 10
        }
        if (result == number) {
            println("$number is an Armstrong number.")
        } else {
            println("$number is not an Armstrong number.")
        }

    }

    fun ex4(num: Long):Boolean {
        var number = num.toInt()
        var result = 0
        var digit: Int
        var n = number
        val power = Math.floor(Math.log10(((if (number == 0) 1 else number).toDouble()))).toInt() + 1


        while (n != 0) {
            digit = n % 10
            result += Math.pow(digit.toDouble(), power.toDouble()).toInt()
            n /= 10
        }
        return result == number

    }

    fun ex5() {
        val number: String = "1634"
        val numDigits = number.toCharArray()

        var result: Long = 0
        val power = numDigits.size

        for (i in numDigits.indices) {
            val digit = numDigits[i].digitToIntOrNull() ?: -1
            result += digit.toDouble().pow(power.toDouble()).toLong()
        }
        if (result == number.toLong()) {
            println("$number is an Armstrong number")
        } else {
            println("$number is not an Armstrong number")
        }

    }

    fun ex6(num: Long): Boolean {

        val number: String = num.toString()
        val numDigits = number.toCharArray()

        var result: Long = 0
        // a simple way to obtain the number of digits
        // a simple way to obtain the number of digits
        val power = numDigits.size

        for (i in numDigits.indices) {
            // this is how we transform a character into a digit
            val digit = numDigits[i].digitToIntOrNull() ?: -1
            // we need to rise digit to the value of power
            result += Math.pow(digit.toDouble(), power.toDouble()).toLong()
        }

        return result == num
    }
}

fun main() {
    ArmstrongNumber.ex1()
    ArmstrongNumber.ex2()
    ArmstrongNumber.ex3()
    println(ArmstrongNumber.ex4(153))
    ArmstrongNumber.ex5()
    println(ArmstrongNumber.ex6(371))

}
