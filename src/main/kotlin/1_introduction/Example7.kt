package `1_introduction`

import java.util.*

/**
 * Kotlin program to check whether a number is even or odd
 */
class EvenOrOdd {
    fun ex1() {
        //  1. Check whether a number is even or odd using if...else statement

        val reader = Scanner(System.`in`)
        println("Enter a number: ")
        val num = reader.nextInt()

        if (num % 2 == 0) {
            println("$num is even")

        } else {
            println("$num is odd")
        }

    }

    fun ex2() {
        //  2. Check whether a number is even or odd using if...else expression

        val reader = Scanner(System.`in`)

        println("Enter a number")
        val num = reader.nextInt()

        val evenOdd = if (num % 2 == 0) "even" else "odd"

        println("$num is $evenOdd")

    }

    fun ex3() {

        val number = mutableListOf<Int>()
        while (true) {
            print("Enter number ${number.count() + 1}: ")
            val input = readln()
            if (input.trim() == "" || input.toIntOrNull() == null) continue
            number.add(input.toInt())
            if (number.count() == 5) break
        }
        val even = number.filter { it > 0 && it % 2 == 0 }
        val odd = number.filter { it > 0 && it % 2 != 0 }

        val productOfEven = even.reduce{ acc, i-> acc * i}
        val productOfOdd = odd.reduce{ acc, i-> acc * i}


        println("the product of $even is $productOfEven ")
        println("the product of $odd is $productOfOdd")


    }
    fun ex4(): Int {
        val a: Array<Int> = arrayOf(105, 818, 136, 212, 521, 730)
        val intVal = a.toString().toIntOrNull()
        val isOdd = true
        val bool = isOdd
        var EvenProd = 1
        var OddProd = 1
        for (i in a) {
            if (intVal == null || intVal == 0) {
                continue
            }
            if (intVal % 2 == 0) {
               EvenProd *= intVal
            }
            else {
                OddProd *= intVal
            }
        }
        if (bool == true) return OddProd
        else return EvenProd
    }

    fun myProd(isOdd: Boolean, input: String): Int {
        return input.asSequence()
            .mapNotNull { it.toString().toIntOrNull() } // parse to numeric, ignore non-numeric
            .filter { it > 0 } // avoid multiplying by zero
            .filter { if (isOdd) it % 2 != 0 else it % 2 == 0 } // pick either odd or even numbers
            .fold(1) { prod, i -> prod * i }  // accumulate with initial 1
    }

}

fun main() {

    val example = EvenOrOdd()
    example.ex1()
    example.ex2()
    example.ex3()
//    println(example.ex4())
    println(example.myProd(isOdd = false,"1,2,3,4,5,6,7,8,9"))
    println(example.myProd(isOdd = true,"1,2,3,4,5,6,7,8,9"))





}