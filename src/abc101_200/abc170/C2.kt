package abc101_200.abc170

import java.lang.Math.*

fun main(args: Array<String>) {
    val (x, n) = readListInt()
    if (n == 0) {
        println(x)
        return
    }
    val p = readListInt()

    val booleans = BooleanArray(102) {true}
    repeat(n) {
        booleans[p[it]] = false
    }
    var m = Int.MAX_VALUE
    var ans = Int.MAX_VALUE
    for (i in 0 until 102) {
        if (booleans[i]) {
            val d = abs(x - i)
            if (d < m) {
                ans = i
            }
            m = min(d, m)
        }
    }
    println(ans)
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

