package `1_introduction`

/**
 * Kotlin Program to Multiply two Floating Point Numbers
 */

fun main() {
    //  1. Multiply two floating point numbers
    val first = 10.2f
    val second = 56.26f
    val product = first * second
    val float1 = 11.23
    val float2 = null
    val float3 = 539.81f

    val any1 = (float1 ?: 0.0) * 1.25
    val any2 = (float2 ?: 0.0f) * 1.25f
    val any3 = float3  * 1.25f


    println("The product is: $product")
    println("The product is: $any1")
    println("The product is: $any2")
    println("The product is: $any3")
}