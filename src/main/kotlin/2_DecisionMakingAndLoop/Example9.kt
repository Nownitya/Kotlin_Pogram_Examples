package `2_DecisionMakingAndLoop`

import java.util.*

/**
 * Kotlin Program to generate Multiplication Table
 */

class MultiplicationTable1 {
    //  1. Generate Multiplication Table using for loop
    fun ex1() {
        val num = 5
        for (i in 1..10) {
            val product = num * i
            println("$num * $i = $product")
        }
    }


    fun ex2() {
        //  2. Generate Multiplication Table using while loop
        val num = 9
        var i = 1
        while (i <= 10) {
            val product = num * i
            println("$num * $i = $product")
            i++
        }
    }

    fun ex3() {
        print("Enter name: ")
//        val reader = Scanner(System.`in`)
//        val num = reader.nextInt()
        val num = readln().toInt()
        for (i in 1..10) {
            val product = num * i
            println("$num * $i = $product")
        }


    }
    fun ex4() {
        val reader = Scanner(System.`in`)
        print("Enter name: ")
        val num = reader.nextInt()

        for (i in 1..10) {
            val product = num * i
            println("$num * $i = $product")
        }
    }
}
fun main() {
    val multiplicationTable = MultiplicationTable1()
    multiplicationTable.ex1()
    println("--------------------------------")
    multiplicationTable.ex2()
    println("--------------------------------")
    multiplicationTable.ex3()
    println("--------------------------------")
    multiplicationTable.ex4()
}

