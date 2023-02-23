package abc101_200.abc173

fun main(args: Array<String>) {
    val (n, k) = readIntList()
    val a = readLongList().sortedDescending()
    a.sortedBy {
        kotlin.math.abs(it) * -1
    }
    val mod = 1_000_000_007

    if (k % 2 == 0) {

        return
    }



}


private fun read() = readLine()!!

private fun readInt() = read().toInt()

private fun readLong() = read().toLong()

private fun readDouble() = read().toDouble()

private fun readStringList() = read().split(" ")

private fun readIntList() = readStringList().map { it.toInt() }

private fun readLongList() = readStringList().map { it.toLong() }

private fun readDoubleList() = readStringList().map { it.toDouble() }

private fun readStringMatrix(n: Int): List<List<String>> {
    val matrix = mutableListOf<List<String>>()
    for (i in 0 until n) {
        val list = readStringList()
        matrix.add(list)
    }
    return matrix
}

private fun readIntMatrix(n: Int): List<List<Int>> {
    val matrix = mutableListOf<List<Int>>()
    for (i in 0 until n) {
        val list = readIntList()
        matrix.add(list)
    }
    return matrix
}

private fun readDoubleMatrix(n: Int): List<List<Double>> {
    val matrix = mutableListOf<List<Double>>()
    for (i in 0 until n) {
        val list = readDoubleList()
        matrix.add(list)
    }
    return matrix
}

private fun readLongMatrix(n: Int): List<List<Long>> {
    val matrix = mutableListOf<List<Long>>()
    for (i in 0 until n) {
        val list = readLongList()
        matrix.add(list)
    }
    return matrix
}

