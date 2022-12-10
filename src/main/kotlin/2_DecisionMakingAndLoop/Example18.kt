package `2_DecisionMakingAndLoop`

/**
 * Kotlin program to check whether a number is Prime or not.
 */

object Prime {
    fun ex1() {
        //  1. Program to check Prime number using a for-in loop
        val num = 53
        var flag = false
        for (i in 2..num / 2) {
            //  condition for non-Prime number
            if (num % i == 0) {
                flag = true
                break
            }
        }
        if (!flag) {
            println("$num is a prime number.")
        } else {
            println("$num is not a prime number.")
        }
    }

    fun ex2() {
        //  2. Program to check Prime number using a while loop

        val num = 57
        var i = 2
        var flag = false
        while (i <= num / 2) {
            //  condition for non-Prime number
            if (num % i == 0) {
                flag = true
                break
            }
            ++i
        }

        if (!flag) {
            println("$num is a prime number.")
        } else {
            println("$num not a prime number.")
        }
    }
}

fun main() {
    Prime.ex1()
    Prime.ex2()

}


