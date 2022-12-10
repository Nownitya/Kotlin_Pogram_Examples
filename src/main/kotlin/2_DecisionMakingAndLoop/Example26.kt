package `2_DecisionMakingAndLoop`

/**
 * Kotlin code to create Pyramid and Pattern
 */

object Pyramid {
    /**
     * Program to print trianglr using *, numbers and characters
     */
    fun ex1() {
        //  1. Program to print half pyramid using *
        val rows = 6

        for (i in 1..rows) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }

    fun ex2() {
        //  2. Program to print half pyramid using number
        val rows = 6
        for (i in 1..rows) {
            for (j in 1..i) {
                print("$j ")
            }
            println()
        }

    }

    fun ex3() {
        //  3. Program to print half pyramid using alphabets
        val last = 'F'
        var alphabet = 'A'
        for (i in 1..last - 'A' + 1) {
            for (j in 1..i) {
                print("$alphabet ")
            }
            ++alphabet

            println()
        }
    }

    /**
     * Program to print inverted half pyramid using * and numbers
     */

    fun ex4() {
        //  4. Program to print half pyramid using *
        val rows = 6
        for (i in rows downTo 1) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }

    fun ex5() {
        //  5. Inverted half pyramid using numbers
        val rows = 6
        for (i in rows downTo 1) {
            for (j in 1..i) {
                print("$j ")
            }
            println()
        }
    }

    /**
     * Programs to display pyramid and inverted pyramid using * and digits
     */

    fun ex6() {
        //  6. Program to print full pyramid using *
        val rows = 5
        var k = 0
        for (i in 1..rows) {
            for (j in 1..rows - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
            k = 0
        }
    }
    fun ex7() {
        //  7. Program to print pyramid using numbers
        val rows = 5
        var k = 0
        var count = 0
        var count1 = 0
        for (i in 1..rows) {
            for (space in 1..rows - i) {
                print("  ")
                ++count
            }
            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    print((i + k).toString() + " ")
                    ++count
                }else{
                    ++count1
                    print((i + k - 2 * count1). toString() + " ")
                }

                ++k
            }
            k = 0
            count = k
            count1 = count

            println()
        }
    }
    fun ex8() {
        //  8. Inverted full pyramid using *
        val rows = 6
        for (i in rows downTo 1) {
            for (space in 1..rows - i) {
                print("  ")
            }
            for (j in i until 2 * i) {
                print("* ")
            }
            for (j in 0 until i - 1) {
                print("* ")
            }
            println()
        }
    }
    fun ex9() {
        //  9. Print Pascal's triangle
        val rows = 6
        var coef = 1
        for (i in 0 until rows) {
            for (space in 1 until rows - i) {
                print("  ")
            }
            for (j in 0..i) {
                if (j == 0 || i == 0) {
                    coef = 1
                } else {
                    coef = coef * (i - j + 1) / j
                }
                System.out.printf("%4d", coef)
            }
            println()
        }
    }
    fun ex10() {
        //  10. Print Floyd's Triangle.
        val rows = 4
        var numbers = 1
        for (i in 1..rows) {
            for (j in 1..i) {
                print("$numbers ")
                ++numbers
            }
            println()

        }
    }

}


fun main() {
    println("1111111111111111111111111111111111")
    Pyramid.ex1()
    println("2222222222222222222222222222222222")
    Pyramid.ex2()
    println("3333333333333333333333333333333333")
    Pyramid.ex3()
    println("4444444444444444444444444444444444")
    Pyramid.ex4()
    println("5555555555555555555555555555555555")
    Pyramid.ex5()
    println("6666666666666666666666666666666666")
    Pyramid.ex6()
    println("7777777777777777777777777777777777")
    Pyramid.ex7()
    println("8888888888888888888888888888888888")
    Pyramid.ex8()
    println("9999999999999999999999999999999999")
    Pyramid.ex9()
    println("1010101010101010101010101010101010")
    Pyramid.ex10()
}