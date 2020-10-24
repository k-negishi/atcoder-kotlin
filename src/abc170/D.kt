package abc170

fun main(args: Array<String>) {
    val n = readInt()
    val a = readListInt()
    var count = n
    var c = mutableListOf<Int>()

    val b = a.sorted()

    var flag = true
    for (i in 0 until n) {
        if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 == 0 || a[i] % 7 == 0) {
            count
        }
        var flag = true
        for (j in 0 until c.size) {
            if (b[i] % c[j] == 0) {
                count--
                flag = false
                break
            }
        }

        if (flag) {
            for (j in 0 until n) {
                if (i == j) continue
                if (b[i] < b[j]) break
                if (b[i] % b[j] == 0) {
                    c.add(b[j])
                    count--
                    break
                }
            }
        }

    }
    println(count)

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

