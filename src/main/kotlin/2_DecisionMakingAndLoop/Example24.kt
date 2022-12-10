package `2_DecisionMakingAndLoop`

import java.util.*

/**
 * Kotlin Program to Count the Number of Vowels and Consonants in a Sentence
 */

object Vowels1 {
    fun ex1() {
        //  1. Program to count vowels, consonants, digits and spaces
        var line = "This program is to find Vowels and Consonants. 123 456 78 9 0 !@#$%^&*()_+=-"
        var vowels = 0
        var consonants = 0
        var digits = 0
        var spaces = 0
        line = line.lowercase(Locale.getDefault())
        for (i in line.indices) {
            val ch = line[i]
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels
            }else if (ch in 'a'..'z') {
                ++consonants
            }
            else if (ch in '0'..'9') {
                ++digits
            }else if (ch == ' ') {
                ++spaces
            }
        }
        println("Vowels: $vowels")
        println("Consonants:$consonants")
        println("Digits: $digits")
        println("White Spaces: $spaces")
    }

    fun ex2() {
        //  2. Program to count vowels, consonants, digits and spaces using when
        var line = "This program is to find Vowels and Consonants. 123 456 78 9 0 !@#$%^&*()_+=-"
        var vowels = 0
        var consonants = 0
        var digits = 0
        var spaces = 0
        line = line.lowercase(Locale.getDefault())
        for (i in line.indices) {
            val ch = line[i]
            when (ch) {
                'a', 'e', 'i', 'o', 'u' -> ++vowels
                in 'a'..'z' -> ++consonants
                in '0'..'9' -> ++digits
                ' ' -> ++spaces
            }
        }
        println("Vowels: $vowels")
        println("Consonants:$consonants")
        println("Digits: $digits")
        println("White Spaces: $spaces")
    }
}

fun main() {
    Vowels1.ex1()
    println("----------------------")
    Vowels1.ex2()

}
