fun main() {
    //Standard library functions/Inbuilt/Pre-defined
    println(2+4)

    var result = Math.sqrt(144.0)
    println("The square root of the number is $result")

    var roundedNumber = Math.round(52.34)
    println("The rounded number is $roundedNumber")

    day()
    multiply()
    add(78,90)
    add(81,45)
    add(23,78)

}


//User defined functions - have to call it inside the main function
fun day() {
    println("Today is Tuesday")

}

fun multiply(){
    var num1 = 89
    var num2 = 4
    println(num1 * num2)

}


//Parameter and argument
fun add(x:Int,y:Int){
    println(x+y)

}