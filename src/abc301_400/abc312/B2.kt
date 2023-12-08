package abc301_400.abc312

fun main() {
    val (n, m) = readIntList()
    val s = mutableListOf<String>()
    repeat(n) {
        s.add(read())
    }

    val T: List<String> = """
        ###.?????
        ###.?????
        ###.?????
        ....?????
        ?????????
        ?????....
        ?????.###
        ?????.###
        ?????.###
    """.trimIndent().split("\n")

    fun valid(s: List<String>): Boolean {
        repeat(9) { i ->
            repeat(9) hoge@{ j ->
                if (T[i][j] == '?') return@hoge
                if (s[i][j] != T[i][j]) return false
            }
        }
        return true
    }

    for (si in 0 until n - 8) {
        for (sj in 0 until m - 8) {
            val t = MutableList<String>(9) { "" }
            repeat(9) { it1 ->
                repeat(9) { it2 ->
                    t[it1] = t[it1] + s[si+it1][sj+it2]
                }
            }
            if (valid(t)) {
                println((si+1).toString() + " " + (sj+1).toString())
            }
        }
    }

}

private fun read() = readln()

private fun readInt() = read().toInt()

private fun readLong() = read().toLong()

private fun readDouble() = read().toDouble()

private fun readStringList(): MutableList<String> = read().split(" ").toMutableList()

private fun readIntList(): MutableList<Int> = readStringList().map { it.toInt() }.toMutableList()

private fun readIntListFromOne(): MutableList<Int> {
    val a = listOf(0)
    val b = readStringList().map { it.toInt() }.toList()
    return (a + b).toMutableList()
}

private fun readLongList(): MutableList<Long> = readStringList().map { it.toLong() }.toMutableList()

private fun readLongListFromOne(): MutableList<Long> {
    val a = listOf(0L)
    val b = readStringList().map { it.toLong() }.toList()
    return (a + b).toMutableList()
}

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

private fun List<Int>.lowerBound(value: Int): Int {
    var left = 0
    var right = this.size

    while (left < right) {
        val mid = left + (right - left) / 2
        if (this[mid] < value) {
            left = mid + 1
        } else {
            right = mid
        }
    }

    return left
}

