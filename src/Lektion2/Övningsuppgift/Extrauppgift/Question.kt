package Lektion2.Övningsuppgift.Extrauppgift

class Question(
    q: String,
    a1: String,
    a2: String,
    a3: String,
    a4: String,
    cat: Category,
    correct: Int
) {
    var question: String = q
    var answers: List<String> = listOf(a1,a2,a3,a4)
    var category: Category = cat
    var correctAnswer = correct
}