import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("enter the temperature of patient :")
    var temperature = read.nextDouble()

    if (temperature > 37){
        println("high fever")
    }
    else if (temperature < 37){
        println("low fever")
    }
    else{
        println("normal temperature")
    }
}
