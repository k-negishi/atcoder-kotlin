package abc127

fun main(args: Array<String>) {
    val (n, m) = readListInt()
    var a = readListLong().sorted().toMutableList()
    var list = mutableListOf<Pair<Int, Long>>()
    repeat(m) {
        var (b, c) = readListLong()
        list.add(b.toInt() to c)
    }
    val calcList = list.sortedByDescending {
        it.second
    }
    var idx = 0
    calcList.forEach { p ->
        repeat(p.first) {
            if (idx > a.size - 1 || a[idx] > p.second) return@forEach
            a[idx] = p.second
            idx++
        }
    }
    println(a.sum())
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

