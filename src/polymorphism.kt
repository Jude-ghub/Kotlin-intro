open class Shape{
    open fun draw(){
        println("The class is drawing a shape")
    }
}

class Rectangle: Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

class Rhombus: Shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}

fun main() {
    var s = Shape()
    var r = Rectangle()
    var rh = Rhombus()
    println("$r")

}