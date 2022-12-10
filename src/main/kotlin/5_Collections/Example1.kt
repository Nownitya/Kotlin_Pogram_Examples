package `5_Collections`

//import org.apache.commons.collections.ListUtils
/**
 * Kotlin program to Join two lists
 */

object JoinsList {
    fun ex1() {
        //  1. Join two lists using addAll()
        val list1 = ArrayList<String>()
        list1.add("a")
        val list2 = ArrayList<String>()
        list2.add("b")

        val joined = ArrayList<String>()
        joined.addAll(list1)
        joined.addAll(list2)

        println("list1: $list1")
        println("list2 $list2")
        println("joined: $joined")

    }

    fun ex2() {
        //  2.Join two Lists using union()
//        val list1 = ArrayList<String>()
//        list1.add("a")
//        val list2 = ArrayList<String>()
//        list2.add("b")
//        val joined = ListUtils.union(list1, list2)
//
//        println("list1: $list1")
//        println("list2: $list2")
//        println("joined: $joined")

    }
}

fun main() {
    JoinsList.ex1()
//    JoinsList.ex2()

}
