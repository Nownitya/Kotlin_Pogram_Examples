package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Reverse a Number
 */


class ReverseNumber {
    fun ex1() {
        //  1. Reverse a number in Kotlin
        var num = 123456
        var reversed = 0
        println("Before Reverse: $num")

        while (num != 0) {
            val digit = num % 10
            reversed = reversed * 10 + digit
            num /= 10

        }
        println("Reversed Number: $reversed")

    }
    fun ex2() {

        val num = 23678489
        println("Before Reverse: $num")
        val reverse = num.toString().reversed()
        println("Reversed Number: $reverse")

    }

}

fun main() {
    val revNum = ReverseNumber()
    revNum.ex1()
    revNum.ex2()


}