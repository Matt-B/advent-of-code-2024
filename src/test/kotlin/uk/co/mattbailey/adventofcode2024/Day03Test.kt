package uk.co.mattbailey.adventofcode2024

import java.io.File
import kotlin.test.Test

class Day03Test {
    private val partOneExampleInput =
        listOf(
            "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))",
        )

    private val partTwoExampleInput =
        listOf(
            "xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))",
        )

    @Test
    fun `Part 1 - Can solve provided example`() {
        val answer = Day03().solvePart1(partOneExampleInput)
        assert(answer == 161)
    }

    @Test
    fun `Part 1 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day3.txt").readLines()
        val answer = Day03().solvePart1(inputs)
        assert(answer == 170068701)
    }

    @Test
    fun `Part 2 - Can solve provided example`() {
        val answer = Day03().solvePart2(partTwoExampleInput)
        assert(answer == 48)
    }

    @Test
    fun `Part 2 - Can solve full exercise`() {
        val inputs = File("src/test/resources/day3.txt").readLines()
        val answer = Day03().solvePart2(inputs)
        assert(answer == 78683433)
    }
}
