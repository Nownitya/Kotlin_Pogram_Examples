package `1_introduction`

import java.util.*

/**
 * Kotlin program to print an integer(Entered by the user)
 */
object PrintInteger {
    fun ex1() {
        //  1. How to Print an Integer entered by an user in Kotlin using

        //  create a reader instance which takes
        //  input from the standerd Keyboard
        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        //nextInt() reads the next integer from the keyboard
        var integer: Int = reader.nextInt()

        //  println() prints the following line to the output screen
        println("You entered: $integer")

        readln().split(' ').forEach{ println(it) }


        readln().split(' ').forEach{ println(it.toInt()) }


        readLine()!!.split(' ').sumBy{ it.toInt() }
        readln().split(' ').sumOf { it.toInt() }

        readLine()!!.split(' ').sumOf { it.toInt() }
    }
    fun ex2() {
        //  2. How to print an integer without using Scanner
        //  reads line from standard input - keyboard
        //  and !! operator ensures the input is not null
        val stringInput = readLine()!!
//        val stringInput = readln()!!

        //  converts the string input to integer
        var integer: Int = stringInput.toInt()

        //  println() prints the following line to the output screen
        println("Entered: $integer")
    }
}

fun main() {
    PrintInteger.ex1()
    PrintInteger.ex2()
}



