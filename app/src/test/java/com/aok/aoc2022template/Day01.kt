package com.aok.aoc2022template

import com.aok.aoc2022template.Util.readInput
import com.aok.aoc2022template.Util.readText
import org.junit.Test

import org.junit.Assert.*

/**
 * Day 01 Tests
 */
class Day01 {
    @Test
    fun part1() {
        val input = readInput("Day01")!!.readText().lines()
        val output = input.sumOf { it.toInt() }
        assertEquals(150, output)
    }
}