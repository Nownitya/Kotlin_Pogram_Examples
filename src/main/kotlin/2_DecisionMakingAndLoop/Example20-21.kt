package `2_DecisionMakingAndLoop`

import kotlin.math.pow

object Armstrong2 {
    private fun countDigits(number: Int): Int {
        var number = number
        var digits = 0
        while (number != 0) {
            number /= 10
            ++digits
        }
        return digits
    }

    private fun digitsPowerSum(number: Int, power: Int): Int {
        var number = number
        var result = 0
        while (number != 0) {
            val remainder = number % 10
            result += remainder.toDouble().pow(power.toDouble()).toInt()
            number /= 10
        }
        return result
    }

    private fun isArmstrong(number: Int): Boolean {
        val digits = countDigits(number)
        val sum = digitsPowerSum(number, digits)
        return sum == number    //  It will return true if both numbers are equal else false
    }

    fun armstrongNumbersBetween(low: Int, high: Int): ArrayList<Int> {
        val numbers: ArrayList<Int> = ArrayList()
        for (number in low + 1 until high) {
            if (isArmstrong(number)) {
                numbers.add(number)
            }
        }
        return numbers
    }
}

fun main() {
    val low = 999
    val high = 99999
    val numbers = Armstrong2.armstrongNumbersBetween(low, high)
    for (number in numbers) {
        print("$number; ")
    }

}