package `4_Arrays`

/**
 * Kotlin program to convert character to string and vice-versa
 */

object ConvertCharactersToString {
    fun ex1() {
        //  1. Convert char to string
        val ch = 'c'
        val st = ch.toString()
        //  Alternatively
        //  st = String.valueOf(ch

        println("The string is: $st")
    }

    fun ex2() {
        //  2. Convert char array to string
        val ch = charArrayOf('a', 'e', 'i', 'o', 'u')
        val st1 = String(ch)
        val st2 = String(ch)
        println(st1)
        println(st2)
    }

    fun ex3() {
        //  3. convert string to chat array
        val st = "This is great"
        val chars = st.toCharArray()
//        println(Arrays.toString(chars))
        println(chars.contentToString())

    }
}

fun main() {
    ConvertCharactersToString.ex1()
    ConvertCharactersToString.ex2()
    ConvertCharactersToString.ex3()
}