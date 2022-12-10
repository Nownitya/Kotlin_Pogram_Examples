package `1_introduction`


/**
 * Kotlin program to find ASCII value of a character
 */

fun main() {
    //  1. Find ASCII value of a character
    val c = 'b'
    val ascii = c.toInt()
//    val ascii = c.code
    val ascii2 = c.code
    val ascii3 = c.category
    val ascii4 = c.directionality
    val ascii5 = c.javaClass



    println("The Ascii  value of $c is $ascii")
    println("The Ascii  value of $c is $ascii2")
    println("The Ascii  value of $c is $ascii3")
    println("The Ascii  value of $c is $ascii4")
    println("The Ascii  value of $c is $ascii5")
}