package `7_Advance`

import java.util.*

/**
 * Kotlin program to add two Dates
 */

object AddTwoDates {
    fun ex1() {
        //  1. Add two dates
        val c1 = Calendar.getInstance()
        val c2 = Calendar.getInstance()
        val cTotal = c1.clone() as Calendar
        cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR))
        cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1)
        cTotal.add(Calendar.DATE, c2.get(Calendar.DATE))
        cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY))
        cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE))
        cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND))
        cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND))

        println("${c1.time} + ${c2.time} = ${cTotal.time}")

    }

}

fun main() {
    AddTwoDates.ex1()

}