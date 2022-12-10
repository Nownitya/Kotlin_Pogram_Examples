package `3_Functions`

/**
 * Kotlin program to find Factorial of a Number using Recursion
 */

object FactorialRecursion {
    fun ex1() {
        //  1. Factorial of a Number using Recursion
        val num = 6
        val factorial = multiplyNumbers(num)
        println("Factorial of $num = $factorial")
    }

    private fun multiplyNumbers(num: Int): Long {
        return if (num >= 1) {
            num * multiplyNumbers(num - 1)
        } else {
            1
        }
    }
    fun ex2() {
        val num = 6
        val factorial = factorial(num)
        println("Factorial of $num = $factorial")
    }
    private fun factorial(num: Int): Long {
        var result = 1L
        for (i in 2..num) {
            result *=i
        }
        return result
    }
}

fun main() {
    println("11111111111111111111111111111111111")
    FactorialRecursion.ex1()
    println("22222222222222222222222222222222222")
    FactorialRecursion.ex2()

}

