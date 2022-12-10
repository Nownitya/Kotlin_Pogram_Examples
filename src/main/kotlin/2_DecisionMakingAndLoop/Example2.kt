package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Find the Largest Among Three Numbers
 */

class Example2 {
    fun ex1() {
        //  1. Find Largest Among three numbers using if..else statement
        val n1 = 2.5
        val n2 = -3.6
        val n3 = 1.5

        if (n1 >= n2 && n1 >= n3) {
            println("$n1 is the largest number")
        }
        else if (n2 >= n1 && n2 >= n3) {
            println("$n2 is the largest number")
        } else {
            println("$n3 is the largest number")
        }

    }
    fun ex2() {
        //  2. Find the largest number among three using when statement
        val n1 = 9.5
        val n2 = -3.6
        val n3 = 11.5

        when {
            n1 >= n2 && n1 >= n3 -> println("$n1 is the largest number")
            n2 >= n1 && n2 >= n3 -> println("$n2 is the largest number")
            else -> println("$n3 is the largest number")

        }
    }

    fun ex3() {
        val numbers = listOf(849, 552, 782)
        val result1 = numbers.size == numbers.toSet().size  // true or false

        val result2 = setOf(849, 552, 782).size == 3        // true or false

        println(result1)
        println(result2)
    }

}

fun main() {
    val example = Example2()
    example.ex1()
    example.ex2()
    example.ex3()
}
