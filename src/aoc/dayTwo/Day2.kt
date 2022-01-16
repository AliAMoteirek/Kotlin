package aoc.dayTwo

import java.io.File

private fun solutionA (listMap: Map<String, List<Int>>): Int {
    val list = listMap.map { it.value.reduce { a, b -> a + b } }
    return list[0] * (list[1] - list[2])
}

private fun solutionB (list: List<Pair<String, Int>>) :Int {
    var xCounter = 0
    var yCounter = 0
    var aim = 0
    list.forEach {
        when (it.first) {
            "forward" -> {
                xCounter += it.second
                yCounter += aim * it.second
            }
            "down" -> aim += it.second
            "up" -> aim -= it.second
        }
    }
    return xCounter * yCounter
}

fun main() {


    val pairs = File("src/aoc/dayTwo/position.txt")
        .readLines().map { Pair(it.split(" ").first(), it.split(" ").last().toInt()) }

    val mappingAllIntsToItsPosition = pairs.groupingBy { it.first }
        .fold(listOf<Int>()) { acc, element -> acc + element.second }

    solutionA(mappingAllIntsToItsPosition).apply {println(this)}
    solutionB(pairs).apply { println(this) }

/*

    val totalAmountsOfForwords =
        mappingAllIntsToItsPosition.filter { it.key == "forward" }.flatMap { it.value }.reduce { acc, i -> acc + i }
    println(totalAmountsOfForwords)

    val totalAmountsOfDowns =
        mappingAllIntsToItsPosition.filter { it.key == "down" }.flatMap { it.value }.reduce { acc, i -> acc + i }
    println(totalAmountsOfDowns)

    val totalAmountsOfUps =
        mappingAllIntsToItsPosition.filter { it.key == "up" }.flatMap { it.value }.reduce { acc, i -> acc + i }
    println(totalAmountsOfUps)

    val result = totalAmountsOfForwords * (totalAmountsOfDowns - totalAmountsOfUps)
    println(result)*/

}