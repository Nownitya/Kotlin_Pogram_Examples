package `4_Arrays`

import kotlin.arrayOf
import kotlin.intArrayOf

/**
 * Kotlin program to print an Array
 */

object Array {
    fun ex1() {
        //  1. Print an array using for loop
        val array = intArrayOf(1, 2, 3, 4, 5)
        for (element in array) {
            println(element)
        }
    }

    fun ex2() {
        //  2. Print an array using standard library Arrays
        val array = intArrayOf(1, 2, 3, 4, 5)

//        println(Arrays.toString(array))
        println(array.contentToString())
    }

    fun ex3() {
        //  3. Print a Multi-dimensional Array
        val array = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6, 7))
//        println(Arrays.deepToString(array))
        println(array.contentDeepToString())
    }


}

fun main() {
    Array.ex1()
    Array.ex2()
    Array.ex3()
}

