package aising2020

fun main(args: Array<String>) {
    var N = readInt()
    val X = read()

    for (i in 0 until N) {
        var a = X
        if (i != N -1) {
            if (a[i] == '1') {
                a = a.substring(0, i) + "0" + a.substring(i + 1, N)
            } else {
                a = a.substring(0, i) + "1" + a.substring(i + 1, N)
            }
        } else {
            if (a[i] == '1') {
                a = a.substring(0, i) + "0"
            } else {
                a = a.substring(0, i) + "1"
            }
        }
        val b = java.lang.Long.parseLong(a, 2)
        println(execute(b))
    }


}

fun binaly(n: Long): String {
    var decimal2 = n
    var decimal1 = n
    var numstr = ""
    while (decimal2 > 0) {
        val rem = decimal2 % 2
        if (rem == 1L) {
            numstr = "1$numstr"
        } else {
            numstr = "0$numstr"
        }
        decimal2 = decimal2 / 2
    }
    if (decimal1 == 0L) {
        numstr = "0"
    }
    return numstr
}

fun popcount(n: Long): Int {
    val a = n.toString()
    val b = binaly(n)
    return b.count {
        it == '1'
    }
}

fun execute(n: Long): Int {
    var a = n
    var count = 0
    while(a != 0L) {
        a %= popcount(a)
        count++
    }
    return count
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

