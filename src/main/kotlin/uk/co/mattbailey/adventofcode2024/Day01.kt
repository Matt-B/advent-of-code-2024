package uk.co.mattbailey.adventofcode2024

import kotlin.math.abs

class Day01 {
    fun solvePart1(input: List<String>): Int {
        val firstNumbers = input.map { it.split("   ")[0].toInt() }.sorted()
        val secondNumbers = input.map { it.split("   ")[1].toInt() }.sorted()
        var total = 0
        for ((index, firstNumber) in firstNumbers.withIndex()) {
            total += abs((secondNumbers[index] - firstNumber))
        }
        return total
    }

    fun solvePart2(input: List<String>): Int {
        val firstNumbers = input.map { it.split("   ")[0].toInt() }
        val secondNumbers = input.map { it.split("   ")[1].toInt() }
        var total = 0
        for (number in firstNumbers) {
            total += (number * secondNumbers.filter { it == number }.size)
        }
        return total
    }
}
