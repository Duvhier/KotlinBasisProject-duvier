package edu.unicatolica.kotlin

import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max

fun section(title: String) {
    println("\n" + "=".repeat(75))
    println(title)
    println("=".repeat(75))
}

fun variableAndTypes() {
    val lang: String = "Kotlin"
    var counter = 0

    println("val lang = $lang")
    println("var counter = $counter")

    counter += 3
    println("counter after += 3 => $counter")
}

fun conditionalsAsExpressions (n: Int) {
    section("2) Conditionals As Expression & When")

    val parity = if (n % 2 == 0) "Even" else "Odd"

    println("n= $n is $parity")

    val description = when {
        n == 0 -> "Zero"
        n in 1..9  -> "One Digit Positive"
        n < 0 -> "Negative "
        else -> "Positive (>=10)"
    }
    println("Description = $description")
}

fun loopsDemo() {
    section("3) Loops: For/ While/ Do While")

    //For: Always use when you know the range of the elements
    print("For 1 to 5: ")
    for (i in 1..5) print("$i ")
    println()

    val list = listOf("a", "b", "c")
    print("For Over List: ")
    for (x in list) print("$x ")
    println()

    /*
     While: Use when you don't know the range of elements
     , But you know a stop condition
     */

    var x = 3
    print("While x>0: ")
    while (x > 0) {
        print("$x ")
        x--
    }
    println()

    // Do-While: Runs at least once
    var y = 0
    print("Do-while y<1: ")
    do {
        print("$y" )
        y++
    } while (y < 1)
        println()
}

fun main(){
    variableAndTypes()
    conditionalsAsExpressions(12)
    loopsDemo()
}