package `7_Advance`

import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths

/**
 * Kotlin program to create string from contents of a File
 */

object StringFromContentsFile {
    fun ex1() {
        //  1. Create string from file
        val path = System.getProperty("user.dir") + "\\src\\test.txt"
        //  "\\src\\main\\kotlin\\7_Advance\\test.txt"
        val encoding = Charset.defaultCharset();

        val lines = Files.readAllLines(Paths.get(path), encoding)
        println(lines)
    }
    fun ex2() {
        //  1. Create string from a file
        val path = System.getProperty("user.dir") + "\\src\\main\\kotlin\\7_Advance\\test.txt"
        //  D:\Codes\Kotlin\kotlin_Programs1\src\main\kotlin
        val encoding = Charset.defaultCharset()

        val encoded = Files.readAllBytes(Paths.get(path))
        val lines = String(encoded, encoding)
        println(lines)

    }
}

fun main() {
    StringFromContentsFile.ex1()
    StringFromContentsFile.ex2()
}
