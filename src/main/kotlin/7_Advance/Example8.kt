package `7_Advance`

import java.io.FileWriter
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

/**
 * Kotlin program to Append Text to an existing File
 */

object AppendTextExistingFile {
    fun ex1() {
        //  1. Append test to existing file
        val path = System.getProperty("user.dir") + "\\src\\main\\kotlin\\7_Advance\\test.txt"
        val text = "Added text\n"

        try {
            Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.APPEND)
        } catch (e: IOException) {
        }
    }

    fun ex2() {
        //  2. Append text to an existing file using FileWriter
        val path = System.getProperty("user.dir")+"\\src\\main\\kotlin\\7_Advance\\test.txt"
        val text = "Added text - ex2\n"

        try {
            val fw = FileWriter(path, true)
            fw.write(text)
            fw.close()
        } catch (e: IOException) {
        }
    }
}

fun main() {
    AppendTextExistingFile.ex1()
    AppendTextExistingFile.ex2()

}