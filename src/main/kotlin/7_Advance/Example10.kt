package `7_Advance`

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

/**
 * Kotlin program to convert file to byte array and vice-versa
 */

object ConvertFileToByteArray {
    fun ex1() {
        //  1. Convert file to byte[]
        val path = System.getProperty("user.dir") + "\\src\\main\\kotlin\\7_Advance\\test.txt"
        try {
            val encoded = Files.readAllBytes(Paths.get(path))
            println(Arrays.toString(encoded))
        } catch (e: IOException) {
        }
    }

    fun ex2() {
        //  2. Convert byte[] to file
        val path = System.getProperty("user.dir") + "\\src\\main\\kotlin\\7_Advance\\test.txt"
        val finalPath = System.getProperty("user.dir") + "\\src\\main\\kotlin\\7_Advance\\final.txt"

        try {
            val encoded = Files.readAllBytes(Paths.get(path))
            Files.write(Paths.get(finalPath), encoded)
        } catch (e: IOException) {
        }
    }
}

fun main() {
    ConvertFileToByteArray.ex1()
    ConvertFileToByteArray.ex2()

}