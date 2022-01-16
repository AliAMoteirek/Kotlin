package aoc.dayOne

import java.io.File

private fun solutionA(list: List<Int>) :Int {
    var count = 0
    list.reduce { acc, i -> if (acc > i) i
        else {
            count++
            i
        }
    }
    return count
}

private fun solutionB(list: List<Int>) :Int {
    val map = mutableMapOf<Int, List<Int>>()
    var count = 0

    for (i in 0 until list.size - 2) {
        map[i] = List(3) { list[it % 3 + i] }
    }

    val map1 = map.map { it.value.reduce { acc, i -> acc + i } }
    map1.reduce { acc, i ->
        if (acc >= i) i
        else {
            count++
            i
        }
    }
    return count
}

fun main() {
    val list = File("src/aoc/dayOne/measurements.txt").useLines { lines ->
        lines.map { it.toInt() }.toList()
    }

    solutionA(list).apply { println(this) }
    solutionB(list).apply { println(this) }

}

