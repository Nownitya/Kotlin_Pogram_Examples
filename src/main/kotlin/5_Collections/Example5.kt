package `5_Collections`

/**
 * Kotlin program to Sort a Map by Values
 */

object SortMapByValues {
    fun ex1() {
        //  1. Sort a map by values
        val capitals = hashMapOf<String, String>()
        capitals.put("India","New Delhi")
        capitals.put("Nepal","Kathmandu")
        capitals.put("United States","United States")
        capitals.put("England", "London")
        capitals.put("Australia", "Canberra")

        val result1 = capitals.toList().sortedBy { (key, _) -> key }.toMap()
        val result2 = capitals.toList().sortedBy { (_, value) -> value }.toMap()
        for (entry in result1) {
            print("Key: ${entry.key}")
            println(" Value: ${entry.value}")
        }
        println("================================================")
        for (entry in result2) {
            print("Key: ${entry.key}")
            println("Value: ${entry.value}")
        }
    }
}

fun main() {
    SortMapByValues.ex1()
}
/**
 * First, capitals is converted to a list using toList().
 * Then, sortedBy() is used to sort the list by value { (_, value) -> value}. We use _ for key because we don't use it for sorting.
 * Finally, we convert it back to map using toMap() and store it in result.
 */


