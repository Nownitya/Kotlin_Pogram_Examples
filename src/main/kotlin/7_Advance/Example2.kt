package `7_Advance`

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

/**
 * Kotlin program to get Current Date/Time
 */

object CurrentDateTime {
    fun ex1() {
        //  1. Get current date and time in default format
        val current = LocalDateTime.now()
        println("Current Date and Time is: $current")

    }

    fun ex2() {
        //  2. Get current date and time with pattern
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        println("Current Date and Time is: $formatted")

    }

    fun ex3() {
        //  3. Get current date time using predefined constants
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.BASIC_ISO_DATE
        val formatted = current.format(formatter)
        println("Current Date is: $formatted")

    }

    fun ex4() {
        //  Get current date time in localized style
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        val formatted = current.format(formatter)
        println("Current Date is $formatted")
    }
}

fun main() {
    CurrentDateTime.ex1()
    CurrentDateTime.ex2()
    CurrentDateTime.ex3()
    CurrentDateTime.ex4()

}