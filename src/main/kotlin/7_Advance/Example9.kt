package `7_Advance`

import java.io.PrintWriter
import java.io.StringWriter


/**
 * Kotlin program to convert a stack trace to a String
 */

object StackTraceString {
    fun ex1() {
        //  1. Convert stack trace to a string
        try {
            val division = 0 / 0
        } catch (e: ArithmeticException) {
            val sw = StringWriter()
            e.printStackTrace(PrintWriter(sw))
            val exceptionAsString = sw.toString()
            println(exceptionAsString)
        }
    }
}

fun main() {
    StackTraceString.ex1()

}