package `2_DecisionMakingAndLoop`

/**
 * Kotlin Program to Display Prime Numbers Between Two Intervals
 */

object PrimeIntervals {
    fun ex1() {
        //  1. Display Prime numbers between tw0 interval
        var lower = 20
        val higher = 100
        while (lower < higher) {
            var flag = false
            for (i in 2..lower / 2) {
                //  condition fot non-prime numbers
                if (lower % i == 0) {
                    flag = true
                    break
                }
            }
            if (!flag) {
                print("$lower ")
            }

            ++lower
        }
    }

    fun primes(n: Int): MutableList<Int> {
        var list: MutableList<Int> = mutableListOf()
        for(num in 2..n){
            for(i in 2..num){
                if(num % i == 0){
                    if(num==i) list.add(num) else break
                }
            }
        }
        return list
    }
}

fun main() {
    PrimeIntervals.ex1()
    println(PrimeIntervals.primes(11))
}
