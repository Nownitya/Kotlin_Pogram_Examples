package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to find GCD of two numbers
 */

class GCD1 {
    fun ex1() {
        //  1. Find GCD of two numbers using while loop
        val n1 = 78
        val n2 = 178
        var gcd = 1
        var i = 1
        while (i <= n1 && i <= n2) {
            //  Check if i is factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i
            }
            i++

        }
        println("G.D.C of $n1 and $n2 is $gcd")


    }
    fun ex2() {
        //  2. Find GCD of two numbers
        var n1 = 78
        var n2 = 178
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2
            } else {
                n2 -= n1
            }


        }
        println("G.C.D = $n1")
    }
    fun ex3() {
        //  3. GCD for both positive and negative numbers
        var n1 = 54
        var n2 = 747

        //  Always set to positive
        n1 = if (n1 > 0) n1 else -n1
        n2 = if (n2 > 0) n2 else -n2

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2
            } else {
                n2 -= n1
            }
        }
        println("G.C.D = $n1")


    }

}

fun main() {
    val gcd = GCD1()
    gcd.ex1()
    gcd.ex2()
    gcd.ex3()
}

