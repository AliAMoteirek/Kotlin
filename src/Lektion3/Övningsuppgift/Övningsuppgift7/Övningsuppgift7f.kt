package Lektion3.Övningsuppgift.Övningsuppgift7

import java.math.BigInteger
import kotlin.system.exitProcess

tailrec fun fib(prevPrev: Int, prev: Int) {
    val next = prevPrev + prev
    println(next)
    if (next > 100) exitProcess(0)
    fib(prev, next)
}

tailrec fun fibIndexValue(prevPrev: Int/*BigInteger*/, prev: Int/*BigInteger*/, i: Long) {
    val next = prevPrev + prev
    when {
        (i == 0L) -> println(1)
        (i == 1L) -> println(2)
        (i - 2 == 0L) -> println(next)
    }
    if (i <= 2) exitProcess(0)
    fibIndexValue(prev, next, i - 1)
}

tailrec fun fibonacciIndexValue(n: Int, a: Int/*BigInteger*/, b: Int/*BigInteger*/): Int {
    return if (n == 0) a else fibonacciIndexValue(n - 1, b, a + b)
}

fun main() {
    //println(fib(1, 2))
    //println("fibIndexValue:")
    //println("fibIndexValue: ${fibIndexValue(1/*BigInteger("1")*/, 2/*BigInteger("2")*/, 3)}")
    println("fibonacciIndexValue: ${fibonacciIndexValue(450, 1, 2)}")
}