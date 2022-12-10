package `3_Functions`

/**
 * Kotlin Program to Reverse a sentence using recursion
 */

object ReverseSentenceUsingRecursion {
    fun ex1() {
        //  1. Reverse a Sentence using recursion
        val sentence = "Go work"
        val reversed = reversed(sentence)
        println("The reversed sentence is: $reversed")
    }

    fun reversed(sentence: String): String {
        if (sentence.isEmpty()) {
            return sentence
        }
        return reversed(sentence.substring(1)) + sentence[0]
    }
}

fun main() {
    ReverseSentenceUsingRecursion.ex1()
}

/****************************************************************************************************************
 *                              Execution steps                                                                         *
 *--------------------------------------------------------------------------------------------------------------*
 *  Iteration	reverse()	        substring()	    reversedString                                              *
 *      1	    reverse("Go work")	"o Work"	    result + "G"                                                *
 *      2	    reverse("o Work"	" Work"	        result + "o" + "G"                                          *
 *      3	    reverse(" Work")	"Work"	        result + " " + "o" + "G"                                    *
 *      4	    reverse("Work")	    "ork"	        result + "W" + " " + "o" + "G"                              *
 *      5	    reverse("ork")	    "rk"	        result + "o" + "W" + " " + "o" + "G"                        *
 *      6	    reverse("rk")	    "k"	            result + "r" + "o" + "W" + " " + "o" + "G"                  *
 *      7	    reverse("k")	    ""	            result + "k" + "r" + "o" + "W" + " " + "o" + "G"            *
 *    Final	    reverse("")	        -	            "" + "k" + "r" + "o" + "W" + " " + "o" + "G" = "kroW oG"    *
 ****************************************************************************************************************/
