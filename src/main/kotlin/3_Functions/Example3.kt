package `3_Functions`

/**
 * Kotlin program to check whether a number can be Expressed as Sum of Two Prime Numbers
 */

object TwoPrimeNumbers {
    fun ex1() {
        //  1. Integer as a Sum of two Prime Numbers
        val number = 46
        var flag = false
        for (i in 2..number / 2) {
            //  condition for i to be a prime number
            if (checkPrime(i)) {
                //  condition for n-i to be a prime number
                if (checkPrime(number - i)) {
                    //  n = primeNumber1 + primeNumber2
                    System.out.printf("%d = %d + %d\n", number, i, number - i)
                    flag = true
                }
            }
        }
        if (!flag) {
            println("$number cannot be expressed as the sum of two prime numbers.")
        }

    }
    private fun checkPrime(num: Int): Boolean {
        var isPrime = true
        for (i in 2..num / 2) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
        return isPrime
    }
    fun ex2() {
        val a = IntArray(5)
        for (i in a.indices) {
            a[i] = i + 1
        }
        findSolutions(a,0)

    }
    private fun findSolutions(a: IntArray, num: Int) {
        if (num >= a.size) {
            println(a.contentToString())
        } else {
            for (i in num until a.size) {
                if (num == 0 || isPrime(a[num - 1] + a[i])) {
                    var t = a[num]
                    a[num] = a[i]
                    a[i] = t
                    findSolutions(a, num + 1)
                    t = a[num]
                    a[num] = a[i]
                    a[i] = t

                }
            }
        }

    }
    private fun isPrime(num: Int): Boolean {
        if (num % 2 == 0) {
            return false
        }
        var i = 3
        while (i * i <= num) {
            if (num % i == 0) {
                return false
            }
            i+=2
        }
        return true


    }

}

fun main() {
    println("11111111111111111111111111111111111111")
    TwoPrimeNumbers.ex1()
    println("22222222222222222222222222222222222222")
    TwoPrimeNumbers.ex2()

}
