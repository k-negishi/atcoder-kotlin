package aising2020

import java.lang.Math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val N = readInt()
    val rootN = sqrt(N.toDouble()).toInt() + 1
    var list = MutableList<Int>(N + 1) { 0 }

    // x
    for (x in 1..rootN) {
        // y
        for (y in 1..rootN) {
            // z
            for (z in 1..rootN) {
                val sahen = (pow(x.toDouble(), 2.0) + pow(y.toDouble(), 2.0) + pow(z.toDouble(), 2.0) +
                        x * y + y * z + z * x).toInt()
                if (sahen <= N) {
                    list[sahen]++
                }
            }
        }
    }
    for (i in 1 .. N) {
        println(list[i])
    }

}


private fun read() = readLine()!!

private fun readInt() = read().toInt()

private fun readLong() = read().toLong()

private fun readDouble() = read().toDouble()

private fun readStringList(): MutableList<String> = read().split(" ").toMutableList()

private fun readIntList(): MutableList<Int> = readStringList().map { it.toInt() }.toMutableList()

private fun readLongList(): MutableList<Long> = readStringList().map { it.toLong() }.toMutableList()

private fun readDoubleList(): MutableList<Double> = readStringList().map { it.toDouble() }.toMutableList()

private fun readStringMatrix(n: Int): MutableList<MutableList<String>> {
    val matrix = mutableListOf<MutableList<String>>()
    for (i in 0 until n) {
        val list = readStringList()
        matrix.add(list)
    }
    return matrix
}

private fun readIntMatrix(n: Int): MutableList<MutableList<Int>> {
    val matrix = mutableListOf<MutableList<Int>>()
    for (i in 0 until n) {
        val list = readIntList()
        matrix.add(list)
    }
    return matrix
}

private fun readDoubleMatrix(n: Int): MutableList<MutableList<Double>> {
    val matrix = mutableListOf<MutableList<Double>>()
    for (i in 0 until n) {
        val list = readDoubleList()
        matrix.add(list)
    }
    return matrix
}

private fun readLongMatrix(n: Int): MutableList<MutableList<Long>> {
    val matrix = mutableListOf<MutableList<Long>>()
    for (i in 0 until n) {
        val list = readLongList()
        matrix.add(list)
    }
    return matrix
}

