package `2_DecisionMakingAndLoop`


/**
 * Kotlin program to calculate the sum of natural numbers
 */
class Example7 {
    //  1. Sum of Natural Numbers using for loop
    fun ex1() {
        val num = 100
        var sum = 0
        for (i in 1..num) {
            sum += i
        }
        println("Sum = $sum")
    }

    fun ex2() {
        //  2. Sum of Natural Numbers using while loop
        val num = 50
        var i = 1
        var sum = 0
        while (i <= num) {
            sum += i
            i++
        }
        println("Sum = $sum")


    }

    data class Product(val num: Int)
    fun ex3() {
        val nNum = listOf(Product(1), Product(2),Product(3),Product(4))
        val sum = nNum.sumOf { it.num }
        println(sum)
    }

    fun ex4() {
        val intNumList = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val total = intNumList.sum()
        println(total)
    }
    fun ex5() {
        val doubleNumList = listOf(8.4, 8.3, 2.0, 2.8, 3.7)
        val total = doubleNumList.sum()
        println(total)
    }

}




fun main() {
    val example = Example7()
    example.ex1()
    example.ex2()
    example.ex3()
    example.ex4()
    example.ex5()



}