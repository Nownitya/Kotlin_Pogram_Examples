package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Check Whether a Character is Alphabet or Not
 */
class Example5 {
    fun ex1() {
        //  1. Kotlin Program to Check Alphabet using if else
        //  val reader = Scanner(System.`in`)
        //  println("Enter a Character: ")
        //  val char: Char = reader.nextInt()!!.toChar()
        val char: Char = 'j'

        if (char >= 'a' && char <= 'z' || char >= 'A' && char <= 'Z') {
            println("$char is an alphabet.")
        } else {
            println("$char is not an alphabet.")
        }

    }

    fun ex2() {
        //  2. Kotlin Program to Check Alphabet using if else
        val c = '*'
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            println("$c is an alphabet.")
        } else {
            println("$c is not an alphabet.")
        }
    }
    fun ex3() {
        //  3. Kotlin Program to Check alphabet using if else with ranges
        val c = 'a'
        if (c in 'a'..'z' || c in 'A'..'Z') {
            println("$c is an alphabet")
        } else {
            println("$c is not an alphabet.")
        }

    }
    fun ex4() {
        //  4. Kotlin Program to Check Alphabet using When
        val c = 'C'
        when {
            (c in 'a'..'z' || c in 'A'..'Z') -> println("$c is an alphabet.")
            else -> println("$c is not an alphabet.")


        }

    }

    fun ex5() {
        val chars: String = "ryry"
        val check = chars.all { it.isLetter() }

        println(check)

    }

    fun isLetters(string: String): Boolean {
        return string.all { it.isLetter() }
    }

}

fun main() {
    val example = Example5()
    example.ex1()
    println("-------------------")
    example.ex2()
    println("-------------------")
    example.ex3()
    println("-------------------")
    example.ex4()
    println("-------------------")
    example.ex5()
}