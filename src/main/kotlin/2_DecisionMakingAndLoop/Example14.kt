package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to count Number of Digits in an Integer
 */

class CountNumber{
    fun ex1() {
        //  1. Count Number of Digits in an Integer
        var count = 0
        var num = 1234567894

        while (num != 0) {
            num /= 10
            ++count
        }
        println("Number of digits: $count")
    }



}

fun main() {
    val countNumber = CountNumber()
    countNumber.ex1()


}

