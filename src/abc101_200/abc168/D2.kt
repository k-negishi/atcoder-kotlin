package abc101_200.abc168

import java.util.*

fun main(args: Array<String>) {
    val (n, m) = readListInt()
    var graph = Array(100005) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = readListInt()
        graph[a-1].add(b-1)
        graph[b-1].add(a-1)
    }

    var queue = ArrayDeque<Int>()
    var dist = List<Int>(n){Int.MAX_VALUE }.toMutableList()
    var pre = List<Int>(n){ -1 }.toMutableList()
    dist[0] = 0
    queue.push(0)
    while (!queue.isEmpty()) {
        var v = queue.first()
        queue.removeFirst()
        for (u in graph[v]) {
            if (dist[u] != Int.MAX_VALUE) continue
            dist[u] = dist[v] + 1
            pre[u] = v
            queue.push(u)

        }
    }
    println("Yes")
    for (i in 1 until n) {
        var ans = pre[i]
        ans++
        println(ans)
    }
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

