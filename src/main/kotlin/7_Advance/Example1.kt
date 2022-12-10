package `7_Advance`

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * Convert String to Date using predefined formatters
 */

object DateFormatters {
    fun ex1() {
        //  1. Convert String to Date using predefined formatters
        //  Format y-M-d or yyy-MM-d
        val string = "2022-12-07"
        val date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE)
        println(date)
    }

    fun ex2() {
        //  2. Convert String to Date using pattern formatters
        val string = "December 07, 2022"
        val formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH)
        val date = LocalDate.parse(string, formatter)
        println(date)
    }
}

fun main() {
    DateFormatters.ex1()
    DateFormatters.ex2()
}