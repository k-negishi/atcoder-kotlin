package abc170


import kotlin.math.*

fun main(args: Array<String>) {
    val (x, n) = readListInt()
    if (n == 0) {
        println(x)
        return
    }
    val p = readListInt()
    p.sorted()
    var m = Int.MAX_VALUE
    var a = 0
    for (i in p) {
        if (m > abs(i - x)) {
            m = min(m, abs(i - x))
            a = i
        }
    }
    var k = a
    var j = a
    var ans = 0
    while (true) {
        k--
        j++
        if (!p.contains(k)) {
            ans = k
            break
        }
        if (!p.contains(j)) {
            ans = j
            break
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

