package `1_introduction`


/**
 * Kotlin program to find the frequency of character in a string.
 */
fun main() {
    //  1. Find Frequency of Character
    val str = "This is Awesome."
    val ch = 'e'
    var frequency = 0
    for (i in 0..str.length-1) {
        if (ch == str[i]) {
            ++frequency
        }
    }
    println("Frequency of $ch = $frequency")

    val count = str.count{ str.contains(it) }
    println(count.toString())

}
