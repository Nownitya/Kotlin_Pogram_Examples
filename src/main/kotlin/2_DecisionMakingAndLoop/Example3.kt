package `2_DecisionMakingAndLoop`

import kotlin.math.sqrt

/**
 * Kotlin Program to Find Roots of a Quadratic Equation
 */

fun main() {
    //  1. Kotlin Program to Find Roots of a Quadratic Equation
    val a = 9.5
    val b = 4
    val c = 11.5
    val root1: Double
    val root2: Double
    val output: String

    val determinant = b * b - 4.0 * a * c

    //  condition for real and different roots
    if (determinant > 0) {
//        root1 = (-b + Math.sqrt(determinant)) / (2 * a)
        root1 = (-b + sqrt(determinant)) / (2 * a)
//        root2 = (-b - Math.sqrt(determinant)) / (2 * a)
        root2 = (-b - sqrt(determinant)) / (2 * a)

        output = "root1 = %.2f and  root2 = %.2f".format(root1, root2)

    }
    //  condition for real and equal roots
    else if (determinant == 0.0) {
        root2 = -b / (2 * a)
        root1 = root2

        output = "root1 = root2 = %.2f;".format(root1)
    }
    //  if roots are not real
    else {
        val realPart = -b / (2 * a)
        val imaginaryPart = Math.sqrt(-determinant) / (2 * a)

        output = "root1 = %.2f+%.2fi and root2 = %.2f-%.2fi".format(realPart, imaginaryPart, realPart, imaginaryPart)

    }
    println(output)

}