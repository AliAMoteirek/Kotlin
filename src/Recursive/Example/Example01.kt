package Recursive

fun callMe(a: Int) {
    if (a > 0) {
        println(a)
        callMe(a - 1)
    }
}

fun main() {
    var n = 5
    callMe(n)
}