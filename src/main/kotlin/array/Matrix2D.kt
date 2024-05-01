package org.kotlinplayground.array

const val ROW = 4
const val COLUMN = 4
const val DEFAULT_VALUE = 0

class Matrix2D {
    private val matrix = Array(ROW) { Array(COLUMN) { DEFAULT_VALUE } }
    fun initWithNaturalNumbers() {
        var value = 1
        for (i in 0..<ROW) {
            for (j in 0..<COLUMN) {
                matrix[i][j] = value
                value += 1
            }
        }
    }

    fun isExist(key: Int): Boolean {
        for (i in 0..<ROW) {
            for (j in 0..<COLUMN) {
                if (matrix[i][j]==key){
                    return true
                }
            }
        }
        return false
    }

    fun print() {
        for (i in 0..<ROW) {
            for (j in 0..<COLUMN) {
                print("${matrix[i][j]}  ")
            }
            println()
        }
        println()
    }
}

fun main() {
    val matrix = Matrix2D()
    matrix.print()
    matrix.initWithNaturalNumbers()
    matrix.print()
    val valueToFind = 19
    val isValueExists = matrix.isExist(valueToFind)
    println("Is value, $valueToFind exists in matrix: $isValueExists")
}