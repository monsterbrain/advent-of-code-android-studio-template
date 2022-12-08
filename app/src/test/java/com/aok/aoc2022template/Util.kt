package com.aok.aoc2022template

import java.io.InputStream

object Util {
    /**
     * Reads lines from the given input txt file.
     */
    fun readInput(name: String) = try {
        javaClass.classLoader?.getResourceAsStream( "$name.txt")
    } catch (e: Exception) {
        println("e.message = ${e.message}")
        null
    }

    fun InputStream.readText(): String {
        val size = available()
        val buffer = ByteArray(size)
        use { it.read(buffer) }
        return String(buffer)
    }
}