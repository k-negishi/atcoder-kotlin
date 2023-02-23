package abc101_200.abc173

fun main(args: Array<String>) {
    val n = readInt()
    val A = readLongList().sortedDescending()

    if (n == 2) {
        println(A[0])
        return
    }
    var count = A[0]

    var plsnt = 0
    var idx = 1
    for (i in 2 until n ) {
        if (plsnt  == 2) {
            idx++
            plsnt = 0
        }
        count += A[idx]
        plsnt++
    }

    println(count)

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

