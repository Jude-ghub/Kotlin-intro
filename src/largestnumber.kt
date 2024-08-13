import java.util.Scanner


fun main() {
    var lrg = Scanner(System.`in`)
    println("Enter first number:")
    var first = lrg.nextInt()
    println("Enter second number:")
    var second = lrg.nextInt()
    println("Enter third number:")
    var third = lrg.nextInt()
    println("Enter fourth number:")
    var fourth = lrg.nextInt()
    if (first <= second || first <= third || first <= fourth)  else println(first)
    if (second <= first || second <= third || second <= fourth)  else println(second)
    if (third <= first || third <= second || third <= fourth)  else println(third)
    if (fourth <= first || fourth <= second || fourth <= third)  else println(fourth)
    
}
