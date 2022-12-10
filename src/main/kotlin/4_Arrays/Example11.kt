package `4_Arrays`

import java.util.*
import java.util.stream.IntStream

/**
 * Kotlin program to check if an array contains a given value
 */

object ContainsArray {
    fun ex1() {
        //  1. Check if Int Array contains a given value
        val num = intArrayOf(1, 2, 3, 4, 5)
        val toFind = 5
        var found = false
        for (n in num) {
            if (n == toFind) {
                found = true
                break
            }
        }

        if (found) {
            println("$toFind is found.")
        } else {
            println("$toFind is not found.")
        }
    }

    fun ex2() {
        //  2. Check if array contains given value using Stream
        val num = intArrayOf(1, 2, 3, 4, 5)
        val toFind = 8
        val found = IntStream.of(*num).anyMatch { n-> n == toFind }
        if (found) {
            println("$toFind is found.")
        } else {
            println("$toFind is not found.")
        }
    }

    fun ex3() {
        //  3. Check if array contains a given value for non-primitive types
        val strings = arrayOf("One", "Two", "Three", "Four", "Five")
        val toFind = "Four"

        val found = Arrays.stream(strings).anyMatch {t-> t == toFind }

        if (found) {
            println("$toFind is found.")
        } else {
            println("$toFind is not found.")
        }

    }

}
fun main() {
    ContainsArray.ex1()
    ContainsArray.ex2()
    ContainsArray.ex3()
}