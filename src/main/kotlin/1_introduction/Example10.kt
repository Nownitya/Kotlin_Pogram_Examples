package `1_introduction`

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.round

/**
 * Kotlin program to round a number to n decimal places
 */
class Examples{
    fun ex1() {
        //  1. Round a Number using format
        val num = 1.8569563
        println("%.4f".format(num))

    }
    fun ex2() {
        //  2. Round a Number using DecimalFormat
        val num = 1.85685
        val df = DecimalFormat("#.####")
        df.roundingMode = RoundingMode.CEILING

        println(df.format(num))
    }
    fun ex3() {
        val x = 1.23556789
        val y = round(1000 * x) / 1000
        print(y) /// 1.236
    }
}

fun main() {

    val examples = Examples()
    examples.ex1()
    examples.ex2()
    examples.ex3()


}