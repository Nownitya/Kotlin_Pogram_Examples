package `3_Functions`

/**
 * Program to Convert Decimal to Octal.
 */


object DecimalToOctal {
    fun ex1() {
        //  1. Program to convert decimal to octal.
        val decimal = 67
        val octal = convertDecimalToOctal(decimal)
        println("$decimal in decimal = $octal in octal")
    }
    private fun convertDecimalToOctal(decimal: Int):Int {
        var decimal = decimal
        var octalNumber = 0
        var i = 1

        while (decimal != 0) {
            octalNumber += decimal % 8 * i
            decimal /= 8
            i *= 10
        }
        return octalNumber


    }

    fun ex2() {
        //  2. Program to convert octal to decimal.
        val octal = 103
        val decimal = convertOctalToDecimal(octal)
        println("$octal in octal = $decimal in decimal")

    }

    private fun convertOctalToDecimal(octal: Int): Int {
        var octal = octal
        var decimalNumber = 0
        var i = 0

        while (octal != 0) {
            decimalNumber += (octal % 10 * Math.pow(8.0, i.toDouble())).toInt()
            ++i
            octal /= 10
        }
        return decimalNumber
    }
}

fun main() {
    DecimalToOctal.ex1()
    DecimalToOctal.ex2()

}

