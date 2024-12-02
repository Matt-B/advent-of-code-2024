package uk.co.mattbailey.adventofcode2024

import java.io.File
import kotlin.test.Test

class Day01Test {
    private val exampleInput =
        listOf(
            "3   4",
            "4   3",
            "2   5",
            "1   3",
            "3   9",
            "3   3",
        )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day01().solvePart1(exampleInput)
        assert(answer == 11)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day1.txt").readLines()
        val answer = Day01().solvePart1(inputs)
        assert(answer == 1110981)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day01().solvePart2(exampleInput)
        assert(answer == 31)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day1.txt").readLines()
        val answer = Day01().solvePart2(inputs)
        assert(answer == 24869388)
    }
}
