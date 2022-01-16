package aoc.dayOne

val list = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

fun main() {
    var count = 0
    list.reduce { acc, i ->
        if (acc > i)
            i
        else {
            count++
            i
        }
    }.apply { println(count) }
    println(count)

    val map = mutableMapOf<Int, List<Int>>()
    for (i in 0 until list.size - 2) {
        map[i] = List(3) { list[(it % 3) + i] }
    }

    println(map)

/*
    map.forEach { (key, value) -> value.reduce { acc: Int, i: Int -> acc + i } }.apply { println(this) }
*/
    var count1 = 0
    val map1 = map.map { it.value.reduce { acc, i -> acc + i } }
    map1.apply { println(this) }
    map1.reduce { acc, i ->
        if (acc >= i)
            i
        else {
            count1++
            i
        }
    }.apply { println(count1) }


}

