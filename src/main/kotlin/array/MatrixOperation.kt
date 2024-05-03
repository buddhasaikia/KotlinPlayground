package org.kotlinplayground.array

class MatrixOperation {
    fun printMatrix(matrix: Array<Array<Int>>, row: Int, col: Int) {
        for (i in 0..<row) {
            for (j in 0..<col) {
                print("${matrix[i][j]}   ")
            }
            println()
        }
    }

    fun initMatrixWithNaturalNumbers(matrix: Array<Array<Int>>, row: Int, col: Int, print: Boolean = false) {
        var num = 0
        for (i in 0..<row) {
            for (j in 0..<col) {
                matrix[i][j] = ++num
            }
        }
        if (print)
            printMatrix(matrix, row, col)
    }
}