package org.kotlinplayground

import org.kotlinplayground.array.Matrix2D
import java.util.*
import kotlin.system.exitProcess

fun main() {
    menu()
    val scanner = Scanner(System.`in`)
    while (true) {
        when (scanner.next()) {
            "1" -> {
                val matrixManipulation = Matrix2D()
                matrixManipulation.print()
                matrixManipulation.initWithNaturalNumbers()
                matrixManipulation.print()
                val valueToFind = 19
                val isValueExists = matrixManipulation.isExist(valueToFind)
                println("Is value, $valueToFind exists in matrix: $isValueExists")
                menu()
            }

            "q" -> exitProcess(0)
        }
    }
}

private fun menu() {
    println("\n************************************************")
    println("1. Create and print a NxM 2D matrix. \nInitialize with 0s. Populate with natural numbers. \nFind if a given number exist in the matrix.\n")
    println("q. Quit")
    println("************************************************\n")
}