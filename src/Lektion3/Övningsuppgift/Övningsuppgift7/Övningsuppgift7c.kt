package Lektion3.Övningsuppgift.Övningsuppgift7

fun maxNumber(list: List<Int>): Int {
    var max = Int.MIN_VALUE
    tailrec fun maxNumber(max: Int, index: Int = 0): Int {
        return if (index == list.size) max
        else maxNumber(
            if (list[index] > max) list[index]
            else max, index + 1
        )
    }
    return maxNumber(max)
}

fun main() {
    val list = listOf(10, -7, 1000, -4000, 500, 40000, 3000)
    println(maxNumber(list))
}
