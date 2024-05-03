package org.kotlinplayground.array

class Matrix2DBoundaryTraversal {
    private val maxRow = 4
    private val maxCol = 4
    private val defaultValue = 0
    private val matrix = Array(maxRow) { Array(maxCol) { defaultValue } }
    private val matrixOperation = MatrixOperation()

    fun traverseBoundaryElements() {
        matrixOperation.initMatrixWithNaturalNumbers(matrix, maxRow, maxCol)
        var row = 0
        var col = 0
        while (col < maxCol) {
            print("${matrix[row][col]}    ")
            col++
        }
        row += 1
        col--
        while (row < maxRow) {
            print("${matrix[row][col]}    ")
            row++
        }
        row--
        col = row - 1
        while (col >= 0) {
            print("${matrix[row][col]}    ")
            col--
        }

        row--
        col = 0
        while (row > 0) {
            print("${matrix[row][col]}    ")
            row--
        }
    }
}

fun main() {
    Matrix2DBoundaryTraversal().traverseBoundaryElements()
}