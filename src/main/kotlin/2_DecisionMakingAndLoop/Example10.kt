package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Display Fibonacci Series
 */

class FibonacciSeries{
    fun ex1() {
        //  1. Display Fibonacci series using for loop
        val n = 10
        var t1 = 1
        var t2 = 1

        println("First $n term: ")
        for (i in 1..n) {
            print("$t1 ")
            val sum = t1 + t2
            t1 = t2
            t2 = sum

        }

    }
    fun ex2() {
        //  2. Display Fibonacci series using while loop
        var i = 1
        val n = 10
        var t1 = 1
        var t2 = 1

        println("First $n terms: ")

        while (i <= n) {
            print("$t1 ")
            val sum = t1 + t2
            t1 = t2
            t2 = sum

            i++
        }


    }
    fun ex3() {
        //  3. Display Fibonacci series upto a given number (instead of terms)
        val n = 100
        var t1 = 1
        var t2 = 1

        println("Upto $n: ")

        while (t1 <= n) {
            print("$t1 ")
            val sum = t1 + t2
            t1 = t2
            t2 = sum

        }
    }

    fun fib1(num:Long):Long {
        return when {
            num <= 1 -> num
            else -> fib1(num - 1) + fib1(num - 2)

        }
    }

}

fun main() {
    val num = 10
    val fib = FibonacciSeries()
    fib.ex1()
    println("\n________________")
    fib.ex2()
    println("\n________________")
    fib.ex3()
    println("\n________________")
    println("Fibonacci of $num: ${fib.fib1(num.toLong())}")
    println("\n________________")
//    println(fib.fib2(6))

}



