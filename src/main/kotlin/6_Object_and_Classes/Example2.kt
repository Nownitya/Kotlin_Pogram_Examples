package `6_Object_and_Classes`

/**
 * kotlin program to calculate difference between two time periods
 */

//  1. Calculate difference between two Time period
class Time1(internal var hours: Int, internal var minutes: Int, internal var seconds: Int)

fun main() {

    val start = Time1(12, 34, 56)
    val stop = Time1(8, 13, 54)

    val diff: Time1 = differences(start, stop)

    print("TIME DIFFERENCE: ${start.hours}:${start.minutes}:${start.seconds} - ")
    print("${stop.hours}:${stop.minutes}:${stop.seconds}")
    print(" = ${diff.hours}:${diff.minutes}:${diff.seconds}")

}

fun differences(start: Time1, stop: Time1): Time1 {
    val diff = Time1(0, 0, 0)
    if (stop.seconds > start.seconds) {
        --start.minutes
        start.seconds += 60
    }
    diff.seconds = start.seconds - stop.seconds
    if (stop.minutes > start.minutes) {
        --start.hours
        start.minutes += 60

    }

    diff.minutes = start.minutes - stop.minutes
    diff.hours = start.hours - stop.hours

    return diff
}
