package `7_Advance`

/**
 * Kotlin program to compare Strings
 */

object CompareString {
    fun ex1() {
        //  1. Compare two strings
        val style1 = "Bold"
        val style2 = "Bold"

        if (style1 == style2) {
            println("Equal")
        } else {
            println("Not Equal")
        }
    }

    fun ex2() {
        //  2. Compare two strings using equals()
        val style1 = "Bold"
        val style2 = "Bold"

        if (style1.equals(style2)) {
            println("Equal")
        } else {
            println("Not Equal")
        }
    }

    fun ex3() {
        //  3. Compare two strings using === (Doesn't work)
        val style1 = buildString { "Bold" }
        val style2 = buildString { "Bold" }
        if (style1 === style2) {
            println("Equal")
        } else {
            println("Not Equal")
        }

    }

    fun ex4() {
        //  4. Different ways to compare two strings
        val style1 = buildString { "Bold" }
        val style2 = buildString { "Bold" }
        var result = style1.equals("Bold")      //  False
        println(result)

        result = style2 ==="Bold"               //  False
        println(result)

        result = style1 === style2              //  False
        println(result)

        result = "Bold" === "Bold"              //  True
        println(result)
    }
}

fun main() {
    println("===========================================")
    CompareString.ex1()
    println("===========================================")
    CompareString.ex2()
    println("===========================================")
    CompareString.ex3()
    println("===========================================")
    CompareString.ex4()
}