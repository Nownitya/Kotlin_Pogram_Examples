package `7_Advance`

/**
 * Kotlin program to Lookup enum by String value
 */

enum class TextStyle {
    BOLD ,ITALIC, UNDERLINE, STRIKETHROUGH
}

fun main() {
    //  1. LookUp enum by string value
    val style = "Bold"
//    val textStyle = TextStyle.valueOf(style.toUpperCase())
//    val textStyle = TextStyle.valueOf(style.uppercase(Locale.getDefault()))
    val textStyle = TextStyle.valueOf(style.uppercase())
    println(textStyle)
}