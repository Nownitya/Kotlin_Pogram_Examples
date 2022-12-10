package `4_Arrays`

/**
 * Kotlin program to find Transpose of a Matrix
 */

object Transpose {
    fun ex1() {
        //  1. Program to find Transpose of a Matrix
        val row = 2
        val column = 3
        val matrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 6, 4))

        //  Display current matrix
        display(matrix)

        //  Transpose the matrix
        val transpose = Array(column) { IntArray(row) }
        for (i in 0 until row) {
            for (j in 0 until column) {
                transpose[j][i] = matrix[i][j]
            }
        }

        //  Display transpose matrix
        display(transpose)
    }

    private fun display(matrix: kotlin.Array<IntArray>) {
        println("The matrix is: ")
        for (row in matrix) {
            for (column in row) {
                print("$column    ")
            }
            println()
        }
    }
}
fun main() {
    Transpose.ex1()
}

/****************************************
 *  transpose[j][i] = matrix[i][j]      |
 ***************************************/

/********************************
 *      Matrix                  *
 *      a11    a12    a13       *
 *      a21    a22    a23       *
 *                              *
 *      Transposed Matrix       *
 *      a11    a21              *
 *      a12    a22              *
 *      a13    a23              *
 ********************************/