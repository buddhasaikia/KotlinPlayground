package org.kotlinplayground.array

class Matrix2DBoundaryTraversal {
    private val maxRow = 4
    private val maxCol = 4
    private val defaultValue = 0
    private val matrix = Array(maxRow) { Array(maxCol) { defaultValue } }
    private val matrixOperation = MatrixOperation()

    fun traverseBoundaryElements() {
        matrixOperation.initMatrixWithNaturalNumbers(matrix, maxRow, maxCol)
        for (iteration in 1..4) {
            when (iteration) {
                1 -> {
                    for (col in 0..<maxCol) {
                        print("${matrix[0][col]}    ")
                    }
                }

                2 -> {
                    for (row in iteration - 1..<maxRow) {
                        print("${matrix[row][maxCol - 1]}   ")
                    }
                }

                3 -> {
                    for (col in maxCol - 2 downTo 0) {
                        print("${matrix[maxRow - 1][col]}   ")
                    }
                }

                4 -> {
                    for (row in maxRow - 2 downTo 1) {
                        print("${matrix[row][0]}    ")
                    }
                }
            }
        }

    }
}

fun main() {
    Matrix2DBoundaryTraversal().traverseBoundaryElements()
}