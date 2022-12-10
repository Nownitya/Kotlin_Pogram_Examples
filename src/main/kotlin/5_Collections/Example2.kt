package `5_Collections`

/**
 * Kotlin program to convert list(ArrayList) to array and vice-versa
 */

object ListToArrayList {
    fun ex1() {
        //  1. convert array list to array
        // an arraylist of vowels
        val vowelsList: List<String> = listOf("a", "e", "i", "o", "u")

        //converting array list to array
        val vowelsArray: Array<String> = vowelsList.toTypedArray() as Array

        // printing elements of the array
        vowelsArray.forEach { print(it) }

    }
    fun ex2() {
        //  2. Convert array to array list
        // vowels array
        val vowelsArray: Array<String> = arrayOf("a", "e", "i", "o", "u")

        //converting array to array list
        val vowelsList: List<String> = vowelsArray.toList()

        //  printing elements of the array list
        vowelsList.forEach { print(it) }

    }
}

fun main() {
    ListToArrayList.ex1()
    println("\n----------------------------------------------------")
    ListToArrayList.ex2()

}