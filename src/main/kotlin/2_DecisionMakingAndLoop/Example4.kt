package `2_DecisionMakingAndLoop`

import java.util.*

/**
 * Kotlin Program to Check Leap Year
 */
class Example3 {
    fun ex1() {
        //  1. Kotlin Program to Check a Leap Year using if else statement
        val year = 2022
        var leap= false

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                //  year is divisible by 400, hence the year is a leap year
                leap = year % 400 == 0

            } else
                leap == true

        } else
            leap == true

        println(if (leap) "$year is a leap year." else "$year is not a leap year.")

    }
    fun ex2() {
        //  2. Kotlin Program to Check Leap Year using when expression
        val year = 2004
        var leap = false

        leap = when {
            year % 4 == 0 -> {
                when {
                    year % 100 == 0 -> year % 400 == 0

                    else -> true

                }
            }
            else ->false

        }
        println(if (leap) "$year is a leap year." else "$year is not a leap year.")


    }

    fun ex3(year: Int): Boolean {
        val cal = Calendar.getInstance()
        cal.set(Calendar.YEAR, year)
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365


    }

    fun ex4(year: Int): Boolean {
        if (year % 4 != 0) {
            return false
        }
        else if (year % 400 == 0) {
            return true
        }
        else return year % 100 != 0

    }

    fun ex5() {

    }

}

fun main() {
    val example = Example3()
    example.ex1()
    example.ex2()
    println("${example.ex3(2012)}")
    println("${example.ex4(2015)}")
}