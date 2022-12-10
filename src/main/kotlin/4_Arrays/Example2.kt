package `4_Arrays`

/**
 * Kotlin program to find largest element in an array
 */

object LargestElement {
    fun ex1() {
        //  1. Find largest element in an array
        val numArray = doubleArrayOf(211.22, 963.85, -555.66, 503.23, 222.25)
        var largest = numArray[0]

        for (num in numArray) {
            if (largest < num) {
                largest = num
            }
        }
        println("Largest element = %.2f".format(largest))
    }
}

fun main() {
    LargestElement.ex1()
}

