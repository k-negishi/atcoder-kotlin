package abc169

import java.lang.Math.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val n = readLong()
    var cnt = 0
    var soinsu = mutableListOf<Long>()
    var divs = mutableSetOf<Long>()

    var a = n
    val sqrt = sqrt(n.toDouble())
    for (i in 2 until sqrt.toLong() + 1) {
        while (a % i == 0L) {
            soinsu.add(i)
            divs.add(i)
            a /= i
        }
    }

    if (a > 1) {
        soinsu.add(n)
        divs.add(n)
    }

    var b = n
    for (i in divs) {
        var z = i
        val count = soinsu.count { it == i }
        for (j in 1..count) {
            if (b % z == 0L) {
                cnt++
                b /= z
                z *= i
            } else {
                break
            }
        }
    }
//    for (i in divs) {
//        var z = i
//        val count = soinsu.count{ it == i}
//        for (j  in 1 .. count) {
//            cnt++
//            b /= z
//            z *= i
//            if (z > b)
//        }
//    }
    if (soinsu.size == 0 && n != 1L) {
        cnt = 1
    }

    println(cnt)

}

private fun myPow(a: Long, b: Int): Long {
    var x = a
    for (i in 1 until b) {
        x *= a
    }
    return x
}

private fun read() = readLine()!!

private fun readInt() = read().toInt()

private fun readLong() = read().toLong()

private fun readDouble() = read().toDouble()

private fun readListString() = read().split(" ")

private fun readListInt() = readListString().map { it.toInt() }

private fun readListLong() = readListString().map { it.toLong() }

private fun readListDouble() = readListString().map { it.toDouble() }

private fun readMatrixString(n: Int): List<List<String>> {
    val matrix = mutableListOf<List<String>>()
    for (i in 0 until n) {
        val list = readListString()
        matrix.add(list)
    }
    return matrix
}

private fun readMatrixInt(n: Int): List<List<Int>> {
    val matrix = mutableListOf<List<Int>>()
    for (i in 0 until n) {
        val list = readListInt()
        matrix.add(list)
    }
    return matrix
}

private fun readMatrixDouble(n: Int): List<List<Double>> {
    val matrix = mutableListOf<List<Double>>()
    for (i in 0 until n) {
        val list = readListDouble()
        matrix.add(list)
    }
    return matrix
}

private fun readMatrixLong(n: Int): List<List<Long>> {
    val matrix = mutableListOf<List<Long>>()
    for (i in 0 until n) {
        val list = readListLong()
        matrix.add(list)
    }
    return matrix
}

