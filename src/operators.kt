//performs calculations
//arithmetic,boolean,logic(and&&,or||,not!)
fun main() {
    //arithmetic
    var x = 12
    var y = 3
    println(x + y)
    println(x * y)
    println(x - y)
    println(x / y)
    println(x % y) // modulus returns the remainder

    //comparison operators
    println(x < y)
    println(x > y)
    println(x <= y)
    println(x >= y)
    println(x == y)
    println(x != y) // not equal to


    // assignment operators-- storing a value somewhere
    var number = 56
    println(number)
    number += 2
    println(number)
    number -= 2
    println(number)

    //logic operators
    println( (23 < 56) && (2>10) ) // returns a true if all statement are true
    println( (23 < 56) || (2>10) )  // returns a true if any of the statements are true
    println( !(23 < 56) || (2>10) ) // not true



}