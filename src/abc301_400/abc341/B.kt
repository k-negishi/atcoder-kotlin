package abc301_400.abc341

fun main() {
    val n = readInt()
    val a = readLongList()
    val s = mutableListOf<Long>()
    val t = mutableListOf<Long>()
    repeat(n-1) {
        val (x, y) = readLongList()
        s.add(x)
        t.add(y)
    }

    for (i in 0 until n-1) {
//        while (a[i] >= s[i]) {
//            a[i] -= s[i]
//            a[i+1] += t[i]
//        }
        if (a[i] >= s[i]) {
            val sho = a[i] / s[i]
            a[i] -= s[i] * sho
            a[i+1] += t[i] * sho
        }
    }

    println(a.last())

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

private fun List<Long>.lowerBound(value: Long): Long {
    var left = 0L
    var right = this.size.toLong()

    while (left < right) {
        val mid = left + (right - left) / 2
        if (this[mid.toInt()] < value) {
            left = mid + 1
        } else {
            right = mid
        }
    }

    return left
}

private fun List<Int>.upperBound(value: Int): Int {
    var left = 0
    var right = this.size

    while (left < right) {
        val mid = left + (right - left) / 2
        if (this[mid] <= value) {
            left = mid + 1
        } else {
            right = mid
        }
    }

    return left
}

private fun List<Long>.upperBound(value: Long): Long {
    var left = 0L
    var right = this.size.toLong()

    while (left < right) {
        val mid = left + (right - left) / 2
        if (this[mid.toInt()] <= value) {
            left = mid + 1
        } else {
            right = mid
        }
    }

    return left
}

