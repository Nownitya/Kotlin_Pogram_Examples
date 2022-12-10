package `4_Arrays`

/**
 * Kotlin program to multiply two matrices by passing matrix to a function
 */

object MultiplyMatricesFunction {
    fun ex1() {
        //  1. Multiply two Matrices
        val r1 = 2
        val c1 = 3
        val r2 = 3
        val c2 = 2
        val firstMatrix = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))
        val secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4))

        //  Multiplying two matrices
        val product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2)

        //  Displaying the result
        displayProduct(product as kotlin.Array<IntArray>)
    }

    private fun multiplyMatrices(
        firstMatrix: kotlin.Array<IntArray>,
        secondMatrix: kotlin.Array<IntArray>,
        r1: Int,
        c1: Int,
        c2: Int,
    ): kotlin.Array<IntArray> {
        val product = Array(r1) { IntArray(c2) }
        for (i in 0 until r1) {
            for (j in 0 until c2) {
                for (k in 0 until c1) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]

                }
            }
        }
        return product
    }

    private fun displayProduct(product: kotlin.Array<IntArray>) {
        println("Product of two matrices is: ")
        for (row in product) {
            for (column in row) {
                print("$column    ")
            }
            println()
        }
    }
}

fun main() {
    MultiplyMatricesFunction.ex1()
}

/************************************************************************************************
 * |-    (a11 x b11) + (a12 x b21) + (a13 x b31)    (a11 x b12) + (a12 x b22) + (a13 x b32)    -|
 * |_    (a21 x b11) + (a22 x b21) + (a23 x b31)    (a21 x b12) + (a22 x b22) + (a23 x b32)    _|
 ***********************************************************************************************/

/*************************************************************************************
 * |-    (3 x 2) + (-2 x -9) + (5 x 0) = 24    (3 x 3) + (-2 x 0) + (5 x 4) = 29    -|
 * |_    (3 x 2) + ( 0 x -9) + (4 x 0) = 6     (3 x 3) + ( 0 x 0) + (4 x 4) = 25    _|
 ************************************************************************************/