package `7_Advance`

import java.io.BufferedReader
import java.io.ByteArrayInputStream
import java.io.InputStreamReader

/**
 * Kotlin program to convert InputStream to String
 */

object InputStreamString {
    fun ex1() {
        //  1. Convert InputStream to string
        val stream = ByteArrayInputStream("Hello there!".toByteArray())
        val sb = StringBuilder()
        var line: String?
        val br = BufferedReader(InputStreamReader(stream))

        line = br.readLine()
        while (line != null) {
            sb.append(line)
            line = br.readLine()
        }
        br.close()
        println(sb)
    }
}

fun main() {
    InputStreamString.ex1()

}
