package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Display Characters from A to Z using loop
 */
class Alphabet1 {
    fun ex1() {
        //  1. Display Uppercase 'A' to 'Z'
        var char: Char
        char = 'A'
        while (char <= 'Z') {
            print("$char ")
            ++char
        }


    }
    fun ex2() {
        //  2. Display lowercase 'a' to 'z'
        var char: Char
        char = 'a'
        while (char <= 'z') {
            print("$char ")
            ++char
        }
    }

}

fun main() {
    val alphabet = Alphabet1()
    alphabet.ex1()
    println("\n----------------------------")
    alphabet.ex2()


}

