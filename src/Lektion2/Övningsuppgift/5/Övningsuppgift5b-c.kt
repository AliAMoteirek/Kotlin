package Lektion2.Övningsuppgift.`5`

fun String.doubleUp() = "$this $this"

fun String.printRepeat(i: Int): String {
    var temp = ""
    for (j in 1..i) {
        temp += "$this "
    }
    return temp
}

fun String.repeatUsingRecursion(i: Int): String {
    tailrec fun repeat(i: Int, acc: String = "$this"): String {
        return if (i < 1) acc
        else repeat(i - 1, "$this $acc")
    }
    return repeat(i - 1)
}

fun main() {
    println("Ali".doubleUp())
    println("Ali".printRepeat(10))
    println("Ali".repeatUsingRecursion(1000))
    println("Ali".repeatUsingRecursion(0))
}