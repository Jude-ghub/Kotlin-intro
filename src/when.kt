

fun main() {
    var day = 4
    var result = when(day){
        1 -> "Monday"
        3 -> "wednesday"
        2 -> "tuesday"
        4 -> "thursday"
        5 -> "Friday"
        else -> "invalid day of the week"
    }
    println("today is $result")
}
