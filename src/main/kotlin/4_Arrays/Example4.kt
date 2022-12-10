package `4_Arrays`

/**
 * Kotlin program to add two Matrix using Multi-Dimensional arrays
 */

object AddTwoMatrices {
    fun ex1() {
        //  1. Program to add two matrices
        val rows = 2
        val columns = 3
        val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
        val secondMatrix = arrayOf(intArrayOf(-4, 5, 3), intArrayOf(5, 6, 3))

        //  Adding two matrices
        val sum = Array(rows){ IntArray(columns)}
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
            }
        }

        //  Displaying the result
        println("Sum of two matrices is: ")
        for (row in sum) {
            for (column in row) {
                print("$column    ")
            }
            println()
        }
    }
}

fun main() {
    AddTwoMatrices.ex1()

}

/**
 *      Sum of two matrices is:
 *      -2      8       7
 *      10      8       6
 */