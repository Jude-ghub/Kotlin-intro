import java.util.Scanner
// allows users to input values from the web.....you can use the * to import everything


// input/output a string
fun main() {
    val read = Scanner(System.`in`)
    println("enter your fullname:")
    var fullname = readln() // a class in scanner class
    println("my fullname is $fullname")

    // age
    println("enter your age: ")
    var age = read.nextInt()// for a decimal nextdouble
    println("my name is $fullname. I am $age years old")







}