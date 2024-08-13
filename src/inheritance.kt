//For inheritance,use "open" at the start of the parent class


open class Animal{
    fun isMammal(){
        println("Animal is a mammal")
    }
}

class Duck:Animal(){
    var hasFeathers = true
    fun swim(){
        println("Duck is swimming")
    }
}

class Bat: Animal() {
    var isBlind = true

}

fun main() {
    var a = Animal()
    var d = Duck()
    var b = Bat()

}