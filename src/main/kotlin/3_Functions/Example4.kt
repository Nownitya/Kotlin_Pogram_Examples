package `3_Functions`

/**
 * Kotlin program to find the sum of natural numbers using Recursion.
 */

object NaturalNumberRecursion {
    fun ex1() {
        //  1. Sum of a natural number using Recursion
        val number = 20
        val sum = addNumbers(number)
        println("Sum = $sum")
    }

    private fun addNumbers(num: Int): Int {
        return if (num != 0) {
            num + addNumbers(num - 1)
        } else {
            return num
        }
    }
}

fun main() {
    NaturalNumberRecursion.ex1()
}