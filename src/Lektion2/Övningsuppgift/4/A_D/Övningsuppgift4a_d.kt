package Lektion2.Övningsuppgift.`4`.A_D

class Animal(type: String, numberOfLegs: Int) {
    var type: String = type
        get() = field
        set(value) {
            field = value
        }

    var numberOfLegs: Int = numberOfLegs
        get() = field
        set(value) {
            field = value
        }

    private fun printAnimalsType() = println(type)
    private fun printAllInformation() = println("I am an animal of type \"$type\" and i have $numberOfLegs legs")

    fun printAll() {
        printAnimalsType()
        printAllInformation()
    }

    override fun toString(): String {
        return "Animal of type \"$type\" with $numberOfLegs legs"
    }
}

fun main() {
    val dog = Animal("Dog", 4)
    val cat = Animal("Cat", 4)
    val flamingos = Animal("Flamingos", 2)
    val spider = Animal("Spider", 8)
    /*animal1.printAll()
    animal2.printAll()*/

    val list = listOf(dog, cat, flamingos, spider)
    list.forEach { e ->
        e.printAll()
        println()
    }

    val set1 = setOf(cat, dog, dog, flamingos, dog, spider)
    val set2 = setOf(dog, cat, flamingos, spider)

    set1.forEach {
        println(it)
    }

    set2.forEach {
        println(it)
    }

    println()
    println(set1 == set2)

    val mapOfAnimals = mapOf("Max" to dog, "Kitty" to cat, "Flamingo" to flamingos, "Tarantula" to spider)
    mapOfAnimals.forEach { println("${it.key} = ${it.value}") }

    println(list.joinToString(", ", "(", ")"))
    println(list.joinToString())

    fun makeSound(animal: Animal): Unit{
        when (animal.type) {
            "Cat" -> println("Meow")
            "Dog" -> println("Woof")
            "Flamingos" -> println("Flamingos")
            "Spider" -> println("Spider")
        }
    }

    makeSound(dog)
    makeSound(cat)
    makeSound(flamingos)
    makeSound(spider)

}

