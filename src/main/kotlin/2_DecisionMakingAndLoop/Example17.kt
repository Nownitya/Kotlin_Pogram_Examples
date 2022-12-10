package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Check Whether a Number is Palindrome or not
 */

object Palindrome {
    fun ex1() {
        //  1. Program to check Palindrome
        var num = 454
        var reversedInteger = 0
        var remainder: Int
        val originalInteger: Int

        originalInteger = num
        //  reversed integer is stored in variable
        while (num != 0) {
            remainder = num % 10
            reversedInteger = reversedInteger * 10 + remainder
            num /= 10
        }
        //  Palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger) {
            println("$originalInteger is a palindrome.")
        } else {
            println("$originalInteger is not a palindrome.")

        }
    }
    fun ex2() {
        println("Enter number to check Palindrome.")
        var num = readln().toInt()
        var reversedInteger: Int = 0
        var remainder: Int
        val originalInteger: Int

        originalInteger = num
        while (num!=0) {
            remainder = num % 10
            reversedInteger = reversedInteger * 10 + remainder
            num /= 10
        }

        if (originalInteger == reversedInteger) {
            println("$originalInteger is a Palindrome.")
        } else {
            println("$originalInteger is not a Palindrome.")
        }

    }

}

fun main() {
    Palindrome.ex1()
    Palindrome.ex2()
}


/************************************************************
 *          Palindrome execution steps  	                *
 *-----------------------------------------------------------
 *  num	    num != 0	remainder	reversedInteger         *
 *  121	      true	       1	    0 * 10 + 1 = 1          *
 *  12	      true	       2	    1 * 10 + 2 = 12         *
 *  1	      true	       1	    12 * 10 + 1 = 121       *
 *  0	      false	       -	    121                     *
 ************************************************************/



