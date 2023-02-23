package abc000_100.abc068

fun main(args: Array<String>) {
    val (n, m) = readListInt()
    val ab = readMatrixInt(m)
    var boxA = mutableSetOf<Int>()
    var boxB = mutableSetOf<Int>()
    ab.forEach {
        if (it[0] == 1) boxA.add(it[1])
        if (it[1] == n) boxB.add(it[0])
    }

    if (boxA.find { boxB.contains(it) } != null) {
        println("POSSIBLE")
    } else {
        println("IMPOSSIBLE")
    }
}

private fun read() = readLine()!!

private fun readInt() = Integer.parseInt(read())

private fun readLong() = read().toLong()

private fun readDouble() = read().toDouble()

private fun readListString() = read().split(" ")

private fun readListInt() = readListString().map { Integer.parseInt(it) }

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

