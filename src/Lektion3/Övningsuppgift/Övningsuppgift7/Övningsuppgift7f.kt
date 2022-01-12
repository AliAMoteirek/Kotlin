package Lektion3.Övningsuppgift.Övningsuppgift7

tailrec fun fibonacciIndexValue(n: Int, a: Int, b: Int): Int {
    return if (n == 0) a else fibonacciIndexValue(n - 1, b, a + b)
}

fun main() {
    println("fibonacciIndexValue: ${fibonacciIndexValue(10, 0, 1)}")
}