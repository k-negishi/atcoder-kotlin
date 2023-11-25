package abc301_400.abc309

fun main() {
    val n = readInt()
    val a = List(n) { read().toCharArray().toList() }.toList()

    val ans = a.map { it.toMutableList() }.toMutableList()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                if (i == 0 && j < n -1) ans[i][j+1] = a[i][j]
                if (i < n - 1 && j == n -1) ans[i+1][j] = a[i][j]
                if (i == n - 1 && j > 0) ans[i][j-1] = a[i][j]
                if (i > 0 && j == 0) ans[i-1][j] = a[i][j]
            }
        }

    }

    for (line in ans) {
        println(line.joinToString(""))
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

