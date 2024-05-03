package org.kotlinplayground.array


class Matrix2DSnakePattern {
    private val row = 3
    private val col = 4
    private val defaultValue = 0
    private val matrix = Array(row) { Array(col) { defaultValue } }
    private val matrixOperation = MatrixOperation()

    /*
    * Time complexity= Θ(MxN)
    */
    fun printSnakePattern() {
        matrixOperation.initMatrixWithNaturalNumbers(matrix, row, col)
        for (i in 0..<row) {
            if (i % 2 == 0) {
                for (j in 0..<col) {
                    print("${matrix[i][j]}  ")
                }
            } else {
                for (j in col - 1 downTo 0) {
                    print("${matrix[i][j]}  ")
                }
            }
        }
    }
}

fun main() {
    Matrix2DSnakePattern().printSnakePattern()
}