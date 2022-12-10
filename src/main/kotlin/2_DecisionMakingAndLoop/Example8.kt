package `2_DecisionMakingAndLoop`

import java.math.BigInteger

/**
 * Kotlin Program to Find Factorial of a Number
 */

class Factorial1 {
    fun ex1() {
        //  1. Find Factorial of a Number using for loop

        val num = 30
        var factorial: Long = 1
        for (i in 1..num) {
            factorial *= i.toLong()

        }
        println("Factorial of $num = $factorial")
    }

    fun ex2() {
        //  2. Find Factorial of a Number using BigInteger.
        val num = 30
        var factorial = BigInteger.ONE
        for (i in 1..num) {
            factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
        }
        println("Factorial of $num = $factorial ")
    }

    fun ex3() {
        //  3. Find Factorial of a number using while loop
        val num = 30
        var i = 1
        var factorial: Long = 1
        while (i <= num) {
            factorial *= i.toLong()
            i++
        }
        println("Factorial of $num = $factorial")
    }
    fun ex4(num: Int): Long {
        var factorial = 1L
        for (i in 1..num) factorial *= i
        return factorial
    }

    fun fac1(num:Long):Long {
        return when {
            num <= 1 -> num
            else -> num * fac1(num - 1)
        }
    }


}

fun main() {
    val num = 30
    val factorial = Factorial1()
    factorial.ex1()
    factorial.ex2()
    factorial.ex3()
    println("Factorial of $num = ${factorial.ex4(num)}")
    println("--------------------------------")
    println("Factorial of $num = ${factorial.fac1(num.toLong())}")

}


