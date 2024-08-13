import java.util.*

fun main() {
    var calculate = Scanner(System.`in`)
    println("enter the first number: ")

    var first = calculate.nextInt()
    println("enter the second number: ")
    var second = calculate.nextInt()

    var operator = "*,+,-,/"
    println("enter operator: ")
    var op = calculate.next()[0]

    var answer= when(op){
        '*' -> println ("${first * second}")
        '+' -> println ("${first + second}")
        '-' -> println ("${first - second}")
        '/' -> println ("${first / second}")
        else -> println("Error")
    }

}

