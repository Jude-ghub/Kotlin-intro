fun main() {
    var languages = arrayOf("kotlin","php","java")
    //we use indexes to print them
    println(languages[2])
    for (lang in languages){
        println(lang)
    }
// add a new element
    var new = languages.plus("C++")
    for (language in new){
        println("language is $language")
    }
    //size of elements
    println(languages.size)
    println(new.size)




}