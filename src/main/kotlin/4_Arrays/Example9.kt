package `4_Arrays`

/**
 * Korlin program to concatenate two arrays
 */

object ConcatenateArrays {
    fun ex1() {
        //  1. Concatenate two Arrays using arraycopy
        val array1 = intArrayOf(1, 2, 3)
        val array2 = intArrayOf(4, 5, 6)
        val aLen = array1.size
        val bLen = array2.size
        val result = IntArray(aLen + bLen)
        System.arraycopy(array1, 0, result, 0, aLen)
        System.arraycopy(array2, 0, result, aLen, bLen)

        println(result.contentToString())

    }

    fun ex2() {
        //  2. Concatenate two arrays without using arraycopy
        val array1 = intArrayOf(1, 2, 3)
        val array2 = intArrayOf(4, 5, 6)

        val length = array1.size + array2.size

        val result = IntArray(length)
        var pos = 0
        for (element in array1) {
            result[pos]= element
            pos++

        }

        for (element in array2) {
            result[pos] = element
            pos++
        }

        println(result.contentToString())
    }
}

fun main() {
    ConcatenateArrays.ex1()
    ConcatenateArrays.ex2()
}