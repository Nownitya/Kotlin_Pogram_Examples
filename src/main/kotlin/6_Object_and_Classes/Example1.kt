package `6_Object_and_Classes`

/**
 * Kotlin program to add two complex numbers by passing class to a function
 */

//  1. Add two complex numbers
class Complex1(internal var real: Double, internal var imaginary: Double)

fun main() {
    val n1 = Complex1(2.3, 4.5)
    val n2 = Complex1(3.4, 5.6)

    val temp: Complex1 = add(n1,n2)
    System.out.printf("Sum = %.1f +%.1fi ", temp.real, temp.imaginary)

}

fun add(n1: Complex1, n2: Complex1): Complex1 {
    val temp = Complex1(0.0, 0.0)
    temp.real = n1.real + n2.real
    temp.imaginary = n1.imaginary + n2.imaginary

    return temp
}