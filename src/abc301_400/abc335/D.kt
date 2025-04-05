package abc301_400.abc335

fun main() {
    val n = readInt()
    val masu = MutableList(n) { MutableList(n) { "0" } }
    val center = (n-1)/2

    var x = 0
    var y = 0
    var arrow = "R"

    (1.. n*n-1).forEach { it ->
        masu[x][y] = it.toString()
        if (arrow == "R") {
            if (x + 1 >= n || masu[x + 1][y] != "0") {
                arrow = "D"
                y += 1
                return@forEach
            }
            x += 1
        }
        if (arrow == "D") {
            if (y + 1 >= n || masu[x][y + 1] != "0") {
                arrow = "L"
                x -= 1
                return@forEach
            }
            y += 1
        }
        if (arrow == "L") {
            if (x - 1 < 0 || masu[x - 1][y] != "0") {
                arrow = "U"
                y -= 1
                return@forEach
            }
            x -= 1
        }
        if (arrow == "U") {
            if (y - 1 < 0 || masu[x][y - 1] != "0") {
                arrow = "R"
                x += 1
                return@forEach
            }
            y -= 1
        }
    }

    masu[center][center] = "T"

    masu.forEach {
        println(it.joinToString(" "))
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

/**
 * 最大公約数を求める
 */
private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        gcd(b, a % b)
    }
}

/**
 * 最大公約数を求める
 */
private fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) {
        a
    } else {
        gcd(b, a % b)
    }
}


/**
 * 最小公倍数を求める
 */
private fun lcm(a: Int, b: Int): Int {
    return a * b / gcd(a, b)
}

/**
 * 最小公倍数を求める
 */
private fun lcm(a: Long, b: Long): Long {
    return a * b / gcd(a, b)
}

