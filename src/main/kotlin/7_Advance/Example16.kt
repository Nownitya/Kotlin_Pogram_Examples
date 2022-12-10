package `7_Advance`

import java.lang.Double.parseDouble

/**
 * Kotlin program to check if a string is numeric
 */

object CheckIfNumeric {
    fun ex1() {
        //  1. Check if a string is numeric
        val string = "12345s15"
        var numeric = true

        try {
            val num = parseDouble(string)
        } catch (e: NumberFormatException) {
            numeric = false
        }
        if (numeric) {
            println("$string is a number")
        } else {
            println("$string is not a number")
        }
    }

    fun ex2() {
        //  2. Check if a string is numeric or not using regular expressions(regex)
        val string = "-1234.15"
        var numeric = true
        numeric = string.matches("-?\\d+(\\.\\d+)?".toRegex())
        if (numeric) {
            println("$string is a number")
        } else {
            println("$string is not a number")
        }

    }
}

fun main() {
    CheckIfNumeric.ex1()
    CheckIfNumeric.ex2()

}

/**
 *  -? allows zero or more - for negative numbers in the string.
 *  \\d+ checks the string must have at least 1 or more numbers (\\d).
 *  (\\.\\d+)? allows zero or more of the given pattern (\\.\\d+) in which
 *  \\. checks if the string contains . (decimal points) or not
 *  If yes, it should be followed by at least one or more number \\d+.
 */
