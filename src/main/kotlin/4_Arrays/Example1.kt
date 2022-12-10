package `4_Arrays`

/**
 * Kotlin program to calculate average using arrays
 */

object AverageUsingArray {
    fun ex1() {
        //  1. Program to calculate Average using Arrays
        val numArray = doubleArrayOf(985.53, 99.54, -207.26, 804.49, 962.95)
        var sum = 0.0
        for (num in numArray) {
            sum += num
        }
        val average = sum / numArray.size
        println("The average is: %.2f".format(average))
    }
}

fun main() {
    AverageUsingArray.ex1()

}

//  average = sum of numbers / total count

