package edu.unicatolica.kotlin

import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max

fun calculateAverage(grade1: Double, grade2: Double, grade3: Double): Double {
    return (grade1 + grade2 + grade3) / 3
}

fun readGrade(number: Int): Double {
    var grade: Double?
    do {
        println("Enter Grade $number (0.0 - 5.0):")
        grade = readLine()!!.toDoubleOrNull()
        if (grade == null || grade !in 0.0..5.0) {
            println("Invalid Grade. It must be between 0.0 and 5.0.")
        }
    } while (grade == null || grade !in 0.0..5.0)
    return grade
}

fun main() {
    val grade1 = readGrade(1)
    val grade2 = readGrade(2)
    val grade3 = readGrade(3)

    val average = calculateAverage(grade1, grade2, grade3)
    println("The student's average is: %.2f".format(average))
}
