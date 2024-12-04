package uk.co.mattbailey.adventofcode2024

import java.io.File
import kotlin.test.Test

class Day02Test {
    private val exampleInput =
        listOf(
            "7 6 4 2 1",
            "1 2 7 8 9",
            "9 7 6 2 1",
            "1 3 2 4 5",
            "8 6 4 4 1",
            "1 3 6 7 9",
        )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day02().solvePart1(exampleInput)
        assert(answer == 2)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day2.txt").readLines()
        val answer = Day02().solvePart1(inputs)
        assert(answer == 483)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day02().solvePart2(exampleInput)
        assert(answer == 4)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day2.txt").readLines()
        val answer = Day02().solvePart2(inputs)
        assert(answer == 528)
    }
}
