package `2_DecisionMakingAndLoop`

import java.util.*

/**
 * Kotlin Program to Check Whether a Number is Positive or Negative
 */

class Example4 {
    fun ex1() {
        //  1. Using if...else statement
        val number = 12.3

        if (number < 0.0) {
            println("$number is a negative number.")

        }else if (number > 0.0) {
            println("$number is a positive number.")

        } else {
            println("num is a 0.")
        }

    }

    fun ex2() {
        //  2. Using if...else statement
        val reader = Scanner(System.`in`)
        print("\nEnter a number: ")

        val num = reader.nextInt()

        if (num < 0.0) {
            println("$num is a negative number.")

        }else if (num > 0.0) {
            println("$num is a positive number.")

        } else {
            println("num is a 0.")
        }

    }

    fun ex3() {
        //  Using when expression
        val num = -12.3

        when {
            num < 0.0 -> println("$num is a negative number.")
            num > 0.0 -> println("$num is a positive number.")
            else -> println("number is 0.")

        }
    }

    fun ex4() {
        //  Using when expression
        val reader = Scanner(System.`in`)
        print("\nEnter a number: ")

        val num = reader.nextInt()

        when {
            num < 0.0 -> println("$num is a negative number.")
            num > 0.0 -> println("$num is a positive number.")
            else -> println("number is 0.")

        }
    }

}

fun main() {
    val example = Example4()
    example.ex1()
    println("--------------------------------")
    example.ex2()
    println("--------------------------------")
    example.ex3()
    println("--------------------------------")
    example.ex4()
}