package abc201_300.abc295

import kotlin.math.abs

fun main() {
    val (r, c) = readIntList()
    var b = List(r) { readLine()!!.toCharArray() }

    val ex: MutableList<MutableList<Boolean>> = MutableList(r) { MutableList(c) { false } }

    for (i in 0 until r) {
        for (j in 0 until c) {
            val num = b[i][j]
            if (num != '.' && num.isDigit()) {
                val d = num.toInt()
                for (i2 in 0 until r) {
                    for (j2 in 0 until c) {
                        if (abs(i2 - i) + abs(j2 - j) <= d) {
                            ex[i2][j2] = true
                        }
                    }
                }
            }
        }
    }

    val ans = MutableList(r) { MutableList(c) { '.' } }
    for (i in 0 until r) {
        for (j in 0 until c) {
            if (b[i][j] == '#' && !ex[i][j]) ans[i][j] = '#'
        }
        println(ans[i].joinToString(""))
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

