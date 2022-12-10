package `3_Functions`

/**
 * Armstrong numbers between intervals using function
 */

object CheckArmstrong1 {
    fun ex1() {
        //  1. Armstrong numbers between two Integers
        val low = 999
        val high = 99999
        for (number in low + 1 until high) {
            if (checkArmstrong(number)) {
                print("$number ")
            }
        }
    }
    fun checkArmstrong(num: Int): Boolean {
        var digits = 0
        var result = 0
        var originalNumber = num

        //  number of digits calculation
        while (originalNumber != 0) {
            originalNumber /= 10
            ++digits
        }

        originalNumber = num

        //  result contains sum of nth powet of its digits
        while (originalNumber != 0) {
            val remainder = originalNumber % 10
            result += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
            originalNumber /= 10

        }
        if (result == num) {
            return true
        }
        return false
    }

    fun ex2() {

    }

}

fun main() {
    CheckArmstrong1.ex1()
}
