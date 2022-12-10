package `7_Advance`

import java.nio.file.Paths

/**
 * Kotlin program to get current working directory
 */

object CurrentWorkingDirectory {
    fun ex1() {
        //  1. Get current working directory.
        val path = System.getProperty("user.dir")
        println("Working Directory = $path")
    }

    fun ex2() {
        //  2. Get current working directory using path.
        val path = Paths.get("").toAbsolutePath().toString()
        println("Working Directory = $path")
    }
}



fun main() {
    CurrentWorkingDirectory.ex1()
    CurrentWorkingDirectory.ex2()
}