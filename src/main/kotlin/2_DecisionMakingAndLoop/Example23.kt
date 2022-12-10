package `2_DecisionMakingAndLoop`

import java.util.*

/**
 * Kotlin Program to Make a Simple Calculator using Switch...case
 */

object SwitchCase {
    fun ex1() {
        //  1. Simple Calculator using Switch statement
        val reader = Scanner(System.`in`)
//        print("Enter two numbers: ")
        print("Enter first number: ")
        val first = readln().toDouble()
        print("Enter second number: ")
        val second = readln().toDouble()

        print("Enter an operator (+, -, *, /):")
        val operator = reader.next()[0]

        val result: Double

        when (operator) {
            '+' -> result = first + second
            '-' -> result = first - second
            '*' -> result = first * second
            '/' -> result = first / second
            else -> {
                System.out.printf("Error! operator is not correct")
                return
            }
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result )
    }
}

fun main() {
    SwitchCase.ex1()

}
