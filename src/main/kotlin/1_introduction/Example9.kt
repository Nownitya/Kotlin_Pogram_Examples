package `1_introduction`


/**
 * Kotlin program to remove all whitespaces from a String
 */
fun main() {
    //  1. Program to Remove All Whitespaces
    var sentence = "Th   is    be    tt  er tha   n"
    println("Orignal sentance: $sentence")

    sentence = sentence.replace("\\s".toRegex(), "")
    println("After Replacement $sentence")

    var str = "This is an example text".filter { !it.isWhitespace() }
    println(str)

    val text = "This \n is a st\tri\rng"
    val text1 = ""
    val test = text.filter{ !it.isWhitespace() }


    println(test) // Thisisastring
}