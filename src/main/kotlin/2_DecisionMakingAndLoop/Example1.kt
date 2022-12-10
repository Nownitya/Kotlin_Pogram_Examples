package `2_DecisionMakingAndLoop`

/**
 * Kotlin program to check whether an alphabet is vowel or consonant.
 */
class Example1 {
    fun ex1() {
        //  1. Check whether an alphabet is vowel or consonant using if..else statement

        val char = 'i'
        val vowelConsonant = if (char == 'a' ||char == 'e'||char == 'i'||char == 'o'||char == 'u')"Vowel" else "Consonant"
        println("$char is $vowelConsonant")


    }
    fun ex2() {
        //  2. Check whether an alphabet is vowel or consonant using when statement

        val char = 'v'

        when (char) {
            'a', 'e', 'i', 'o', 'u' -> println("$char Vowel")
            else -> println("$char Consonant")

        }


    }
    fun ex3() {
        val ch = 'r'
        val vowel: Array<Char> = arrayOf('a', 'e', 'i', 'o', 'u')

        if (vowel.contains(ch)) {
            println("Vowel: $ch")
        } else {
            println("Consonant: $ch")
        }

    }

    fun ex4() {
        val ch = 'E'
        val vowel: Array<Char> = arrayOf('a', 'e', 'i', 'o', 'u')
        val vowelOrConsonant = if (vowel.contains(ch.lowercaseChar())) "Vowel: $ch" else "Consonant: $ch"

        println(vowelOrConsonant)
    }

}

fun main() {
    val example = Example1()
    example.ex1()
    println("------------")
    example.ex2()
    println("------------")
    example.ex3()
    println("------------")
    example.ex4()
}