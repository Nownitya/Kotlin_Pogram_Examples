package `3_Functions`

/**
 * Kotlin program to calculate the power using recursion
 */

object PowerRecursion {
    fun ex1() {
        //  1. Program to calculate power using recursion
        val base = 3
        val powerRaised = 4
        val result = power(base, powerRaised)
        println("$base^$powerRaised = $result")
    }

    private fun power(base: Int, powerRaised: Int): Int {
        if (powerRaised != 0) {
            return base * power(base, powerRaised - 1)
        } else {
            return 1
        }
    }
}

fun main() {
    PowerRecursion.ex1()

}

/********************************************************************************************
 *                          Execution steps                                                 *
 *------------------------------------------------------------------------------------------*
 *      Iteration	    power()	        powerRaised	        result                          *
 *          1	        power(3, 4)	        4	            3 * result2                     *
 *          2	        power(3, 3)	        3	            3 * 3 * result3                 *
 *          3	        power(3, 2)	        2	            3 * 3 * 3 * result4             *
 *          4	        power(3, 1)	        1	            3 * 3 * 3 * 3 * resultfinal     *
 *        Final	        power(3, 0)	        0	            3 * 3 * 3 * 3 * 1 = 81          *
 ********************************************************************************************/