package Lektion3.Övningsuppgift.Övningsuppgift7

fun main() {

    tailrec fun paranthesisCount(word: String, count: Int = 0): Int {
        println(word)
        if (word.isEmpty()) return count
        return when (word.first()) {
            '(' -> paranthesisCount(word.takeLast(word.count() - 1), count + 1)
            ')' -> paranthesisCount(word.takeLast(word.count() - 1), count - 1)
            else -> paranthesisCount(word.takeLast(word.count() - 1), count)
        }
    }

    fun areParanthesisEqual(word: String): Boolean {
        return paranthesisCount(word) == 0
    }

    println(areParanthesisEqual("((v))"))
    println(areParanthesisEqual("(((((v))"))

}