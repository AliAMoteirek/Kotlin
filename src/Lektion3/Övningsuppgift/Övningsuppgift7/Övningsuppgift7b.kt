package Lektion3.Övningsuppgift.Övningsuppgift7

import java.util.concurrent.atomic.DoubleAccumulator

fun sumOfAList(list: List<Int>): Int {
    tailrec fun sum(index: Int, accumulator: Int = 0): Int {
        return if (index < 0) accumulator
        else sum(index -1, accumulator + list[index])
    }
    return sum(list.size -1)
}


fun main() {
    val list = listOf(1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10_000)
    println(sumOfAList(list))
}