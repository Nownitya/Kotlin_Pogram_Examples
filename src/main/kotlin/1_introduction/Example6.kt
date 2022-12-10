package `1_introduction`


/**
 * Kotlin program to Swap two numbers
 */
object SwapNumbersUsingTempVar{
    fun ex1() {
        //  1. Swap two numbers using temporary variable
        var first = 1.5f
        var second = 8.26f

        println("--Before Swap--")
        println("First Number: $first")
        println("Second Number: $second")

        //  value of first assigned to Temporary
        val temp = first

        //  value of second assigned to first
        first = second

        //  value of temp assigned to second
        second = temp

        println("--After Swap--")
        println("First Num: $first")
        println("Second Num: $second")
    }
    fun ex2() {
        //  2. Swap two numbers without using temporary variable
        var a = 1
        var b = 2
        a = b.also { b = a }
        println(a)
        println(b)
    }
}

fun main() {
    SwapNumbersUsingTempVar.ex1()
    SwapNumbersUsingTempVar.ex2()

}

/**
 * First, the value of first is stored in variable temporary (temporary = 1.20f).
 * Then, value of second is stored in first (first = 2.45f).
 * And, finally value of temporary is stored in second (second = 1.20f).
 */

