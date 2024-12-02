package uk.co.mattbailey.adventofcode2024

class Day02 {
    fun solvePart1(input: List<String>): Int {
        var numberOfSafeReports = 0
        for (line in input) {
            val report = line.split(" ").map { it.toInt() }
            if (isSafe(report)) {
                numberOfSafeReports += 1
            }
        }
        return numberOfSafeReports
    }

    fun solvePart2(input: List<String>): Int {
        var numberOfSafeReports = 0
        for (line in input) {
            val report = line.split(" ").map { it.toInt() }
            val reportSafety = isSafe(report)
            if (reportSafety) {
                println("$report - Report is safe with no removals")
                numberOfSafeReports += 1
            } else {
                for ((index, number) in report.withIndex()) {
                    val reportWithoutNumber = report.toMutableList()
                    reportWithoutNumber.removeAt(index)
                    if (isSafe(reportWithoutNumber)) {
                        println("$report - report is safe without number $number")
                        numberOfSafeReports += 1
                        break
                    }
                }
            }
        }
        return numberOfSafeReports
    }

    private fun isSafe(report: List<Int>): Boolean {
        val differences = mutableListOf<Int>()
        for (index in 1..<report.size) {
            val previous = report[index - 1]
            val current = report[index]
            differences.add(current - previous)
        }
        val allPositive = differences.all { it > 0 }
        val allNegative = differences.all { it < 0 }
        val allWithinLimits = differences.all { it in 1..3 || it in -3..-1 }
        return if ((allPositive || allNegative) && allWithinLimits) {
            true
        } else {
            false
        }
    }
}
