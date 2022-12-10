package `7_Advance`

import java.util.concurrent.TimeUnit

/**
 * Kotlin program to convert Milliseconds to minutes and seconds.
 */

object MillisecondsToMinutes {
    fun ex1() {
        //  1. Convert milliseconds to minutes and seconds individually
        val milliseconds: Long = 1000000

        //  long minutes =(milliseconds/1000)/60
        val minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds)

        //  long seconds = (milliseconds/1000);
        val seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds)

        println("$milliseconds Milliseconds = $minutes minutes")
        println("Or")
        println("$milliseconds Milliseconds = $seconds seconds")
    }

    fun ex2() {
        //  2. Convert Milliseconds to Minutes and Seconds
        val milliseconds: Long = 1000000
        val minutes = milliseconds / 1000 / 60
        val seconds = milliseconds / 1000 % 60

        println("$milliseconds Milliseconds = $minutes minutes and $seconds seconds.")
    }

}

fun main() {
    MillisecondsToMinutes.ex1()
    MillisecondsToMinutes.ex2()

}

