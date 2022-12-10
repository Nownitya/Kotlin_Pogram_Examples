package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to calculate LCM of two Numbers
 */

class LCM1 {
    fun ex1() {
        //  1. Kotlin Program to calculate LCM using while loop and if Statement.
        val n1 = 100
        val n2 = 5
        var lcm: Int
        //  Maximum number between n1 and n2 is stored in lcm
        lcm = if (n1 > n2) n1 else n2
        //  Always true
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                println("The LCM of $n1 and $n2 is $lcm.")
                break
            }
            ++lcm
        }


    }
    fun ex2() {
        //  2. Kotlin Program to calculate LCM using GCD
        val n1 = 100
        val n2 = 5
        var gcd = 1
        var i = 1
        while (i <= n1 && i <= n2) {
            //  check if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i
            }
            ++i
        }
        val lcm = (n1 * n2) / gcd
        println("The LCM of $n1 and $n2 is $lcm.")


    }

}

fun main() {
    val lcm = LCM1()
    lcm.ex1()
    lcm.ex2()
}

