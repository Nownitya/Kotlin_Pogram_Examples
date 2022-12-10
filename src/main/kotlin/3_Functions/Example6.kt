package `3_Functions`

/**
 * Kotlin program to Find G.D.C(Greatest Common Divisor using Recursion
 */

object GDCRecursion {
    fun ex1() {
        //  1. GDC of two numbers using recursion
        val n11 = 550
        val n12 = 50
        val n13 = 5
        val n21 = 50
        val n22 = 5
        val n23 = 0
        val hcf1 = hcf(n11, n21)
        val hcf2 = hcf(n12, n22)
        val hcf3 = hcf(n13, n23)
        println("G.D.C of $n11 and $n21 is $hcf1")
        println("G.D.C of $n12 and $n22 is $hcf2")
        println("G.D.C of $n13 and $n23 is $hcf3")
    }

    private fun hcf(n1: Int, n2: Int): Int {
        return if (n2 != 0) {
            hcf(n2, n1 % n2)
        } else {
            n1
        }
    }
}

fun main() {
    GDCRecursion.ex1()

}

/****************************************************************
 *                  Execution Steps                             *
 *--------------------------------------------------------------*
 *      No.	    Recursive call      n1	    n2	    n1 % n2     *
 *      1	    hcf(366, 60)	    550	    50	       5        *
 *      2	    hcf(60, 6)	        50	    5	       0        *
 *      Final	hcf(6, 0)           5	    0	       -        *
 ****************************************************************/

