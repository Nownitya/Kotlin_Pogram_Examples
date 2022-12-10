package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to display Factors of a Number
 */

object Factors1 {
    fun ex1() {
        //  1. Factors of a Positive Integer
        val number = 60
        println("Factors of $number are: ")
        for (i in 1..number) {
            if (number % i == 0) {
                print("$i ")
            }
        }
    }
    fun ex2(num: Int): MutableList<Int> {
        val number = num
        val numbers:MutableList<Int> = mutableListOf<Int>()
        println("Factor of $number are:")
        for (i in 1..number) {
            if (number % i == 0) {
                numbers.add(i)
            }

        }
        return numbers
    }

    fun ex3(num: Int):MutableList<Int> {
        val factors = mutableListOf<Int>()
        if (num < 1) {
            return factors
        }
        (1..num / 2)
            .filter { num % it == 0 }
            .forEach{ factors.add(it)}
        factors.add(num)
        return factors
    }
}

fun main() {
    Factors1.ex1()
    println()
    val factorList = Factors1.ex2(60)
    println(factorList)
    val numbers = 60
    val factorsList2 = Factors1.ex3(numbers)
    println("The factor of $numbers are: $factorsList2")


}