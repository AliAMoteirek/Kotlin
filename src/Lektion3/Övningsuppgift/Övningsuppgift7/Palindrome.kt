package Lektion3.Övningsuppgift.Övningsuppgift7

fun isPalindrome(s: String, i: Int = 0): Boolean {
    return if (i > s.length / 2) true
    else s[i] == s[s.length - i - 1] && isPalindrome(s, i + 1)
}

fun main() {
    println(isPalindrome("ana"))
    println(isPalindrome("(ali"))
}