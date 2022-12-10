package `7_Advance`

/**
 * Kotlin program to convert Byte Array to Hexadecimal
 */

object ByteArrayToHexadecimal {
    fun ex1() {
        //  1. Convert Byte Array to Hex value
        val bytes = byteArrayOf(10, 2, 15, 11)
        for (b in bytes) {
            val st = String.format("%02X", b)
            print(st)
        }
    }

    fun ex2() {
        //  2. Convert Byte Array to Hex valur using byte operations
        val bytes = byteArrayOf(10, 2, 15, 11)
        val s = bytesToHex(bytes)
        println(s)

    }

    private val hexArray = "0123456789ABCDEF".toCharArray()
    private fun bytesToHex(bytes: ByteArray): String {
        val hexChars = CharArray(bytes.size * 2)
        for (i in bytes.indices) {
            val v = bytes[i].toInt() and 0xFF
            hexChars[i * 2] = hexArray[v ushr 4]
            hexChars[i * 2 + 1] = hexArray[v and 0x0f]
        }
        return String(hexChars)

    }
}

fun main() {
    ByteArrayToHexadecimal.ex1()
    println()
    ByteArrayToHexadecimal.ex2()

}