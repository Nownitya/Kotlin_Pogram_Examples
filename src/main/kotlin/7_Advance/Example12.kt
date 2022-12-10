package `7_Advance`

import java.io.ByteArrayOutputStream

/**
 * Kotlin program to convert OutputStream to String
 */

object ConvertOutputStreamToString {
    fun ex1() {
        //  1. Convert OutStream to String
        val stream = ByteArrayOutputStream()
        val line = "Hello there!"
        stream.write(line.toByteArray())
        val finalString = String(stream.toByteArray())

        println(finalString)
    }
}

fun main() {
    ConvertOutputStreamToString.ex1()

}

