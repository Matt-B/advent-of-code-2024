package uk.co.mattbailey.adventofcode2024

class Day03 {
    fun solvePart1(input: List<String>): Int {
        val pattern = "mul\\([0-9]+,[0-9]+\\)".toRegex()
        var total = 0
        for (line in input) {
            val matches = pattern.findAll(line)
            for (match in matches) {
                val numbers = "[0-9]+".toRegex().findAll(match.value)
                total += (numbers.first().value.toInt() * numbers.last().value.toInt())
            }
        }
        return total
    }

    fun solvePart2(input: List<String>): Int {
        val pattern = "(mul\\([0-9]+,[0-9]+\\))|(don't\\(\\))|(do\\(\\))".toRegex()
        var total = 0
        var enabled = true
        for (line in input) {
            val matches = pattern.findAll(line)
            for (match in matches) {
                if (match.value == "don't()") {
                    enabled = false
                } else if (match.value == "do()") {
                    enabled = true
                } else {
                    val numbers = "[0-9]+".toRegex().findAll(match.value)
                    if (enabled) {
                        total += (numbers.first().value.toInt() * numbers.last().value.toInt())
                    }
                }
            }
        }
        return total
    }
}
