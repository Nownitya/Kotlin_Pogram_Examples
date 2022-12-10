package `3_Functions`

/**
 * Kotlin Program to Display Prime Numbers between Intervals Using Function
 */

object PrimeNumbers {


    fun ex1() {
        //  1. Prime Numbers Between Two Integers
        var low = 20
        val high = 50

        while (low < high) {
            if (checkPrimeNumber(low)) {
                print("$low ")
            }
            ++low
        }

    }

    private fun checkPrimeNumber(num: Int): Boolean {
        //  2. Prime Numbers between two Integers
        var flag = true
        for (i in 2..num / 2) {
            if (num % i == 0) {
                flag = false
                break
            }
        }
        return flag

    }
}

fun main() {
    PrimeNumbers.ex1()
}