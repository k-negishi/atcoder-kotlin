package smtb2019

fun main(args: Array<String>) {
    val n = readInt()
    val s = read()
    var ansSet = mutableSetOf<String>()
    var tempSet = mutableSetOf<String>()

    for (i in 0 until s.length - 2) {
        var x = s[i].toString()
        if (x in tempSet) continue
        tempSet.add(x)
        for (j in i+1 until s.length -1) {
            var y = x + s[j].toString()
            if (y in tempSet) continue
            tempSet.add(y)
            for (k in j+1 until s.length) {
                var z = y + s[k].toString()
                if (z in tempSet) continue
                tempSet.add(z)
                ansSet.add(z)
            }
        }
    }
    println(ansSet.size)
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

