package `5_Collections`

/**
 * Kotlin program to convert Map(HashMap) to List
 */

object HashMapToList {
    fun ex1() {
        //  1. Convert Map to List
        val map = HashMap<Int, String>()
        map.put(1, "a")
        map.put(2, "b")
        map.put(3, "c")
        map.put(4, "d")
        map.put(5, "e")

        val keyList = ArrayList(map.keys)
        val valueList = ArrayList(map.values)

        println("Keys List: $keyList")
        println("Values List: $valueList")
    }
}

fun main() {
    HashMapToList.ex1()

}