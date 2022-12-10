package `5_Collections`

/**
 * Kotlin program to convert Array to set(HashSet) and vice-versa
 */

object ArrayToSet {
    fun ex1() {
        //  1. Convert Array to Set
        val array = arrayOf("a", "b", "c")
//        val set = HashSet(Arrays.asList(*array))
//        val set = HashSet(mutableListOf(*array))
        val set = HashSet(listOf(*array))
        val set2 = HashSet(listOf(array))
        println("Set: $set")
        println("Set: $set2")

    }

    fun ex2() {
        //  2. Convert Set to Array
        val set = HashSet<String>()
        set.add("a")
        set.add("b")
        set.add("c")
        val array = arrayOfNulls<String>(set.size)
        set.toArray(array)
//        println("Array: ${Arrays.toString(array)}")
        println("Array: ${array.contentToString()}")
    }
}

fun main() {
    ArrayToSet.ex1()
    ArrayToSet.ex2()
}