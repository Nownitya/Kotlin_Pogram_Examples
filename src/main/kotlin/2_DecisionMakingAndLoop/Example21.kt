package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Display Armstrong Number Between two Intervals
 */

object ArmstrongInterval {
    fun ex1() {
        //  1. Armstrong Numbers Between two Intervals.
        val low = 99
        val high = 99999

        // Create a variable number and assign it one number greater than low
        // This loop should keep repeating until number is less than high(end of the interval)
        // After each repetition, increment the value of number by 1
        for (number in low + 1 until high) {
            var digits = 0
            var result = 0
            var originalNumber = number

            //  number of digits calculation
            while (originalNumber != 0) {    // Continue this while loop till originalNumber is not 0
                originalNumber /= 10         // Divide the number by 10. Dividing a number by 10 removes its last digit.
                ++digits                     // One digit was removed in the above step, which means it has to be counted, so increment digit by 1
            }

            // For example, for originalNumber = 423,
            // 423 / 10 = 42 : digits = 1 (first loop)
            // 42 / 10 = 4 : digits = 2   (second loop)
            // 4 / 10 = 0 : digits = 3    (third loop)
            // Now originalNumber has become 0, so the while loop condition originalNumber != 0 will be false and the loop will stop.
            // Now we have digits = 3, which is the number of digits in 423

            // When program reaches here, digits will have the number of digits in the
            // number &quot;originalNumber&quot;

            originalNumber = number
            //  result contains dum of nth power of its digits
            while (originalNumber != 0) {
                val remainder = originalNumber % 10
                result += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
                originalNumber/= 10

                // After this line finishes, one rightmost digit will be removed, this will keep
                // happening till originalNumber = 153 becomes 15, then 1, then 0.
                // When originalNumber is 0, loop stops and we will have the total sum in result
            }
            if (result == number) {     // For 153, both will be equal.
                println("$number")      // This will only execute if result is equal to number, or in other words, only if the number is Armstrong
            }
        }
    }
}

fun main() {
    ArmstrongInterval.ex1()

}


