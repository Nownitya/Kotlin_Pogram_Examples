package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Sort Elements in Lexicographical Order(Dictionary Order).
 */

object Order1 {
    fun ex1() {
        //  2. Program to Sort Strings in Dictionary Order
        val words = arrayOf("Ruby", "C", "Python", "Java")
        val listSize = words.size // Size = 2
        for (i in 0..2) {
            for (j in i + 1..3) {
                if (words[i].compareTo(words[j]) > 0) {
                    //  Swap words[i] with words[j]
                    val temp = words[i]
                    words[i] = words[j]
                    words[j] = temp
                }
            }
        }

        println("In Lexicographical order:")
        for (i in 0 until listSize) {
            println(words[i])
        }
    }
}

fun main() {
    Order1.ex1()

}

