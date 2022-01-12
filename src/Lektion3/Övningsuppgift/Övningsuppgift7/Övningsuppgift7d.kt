package Lektion3.Övningsuppgift.Övningsuppgift7

fun reverseString(string: String): String {
    tailrec fun reverseString(index: Int, accumulator: String = ""): String {
        return if (index < 0) accumulator
        else reverseString(index - 1, "$accumulator${string[index]}")
    }
    return reverseString(string.length - 1)
}

fun main() {
    println("Please enter a sentence to get it wrotten backwards")
    val sentence = readln()
    println(reverseString(sentence))
    //println(reverseString("Hello"))
}