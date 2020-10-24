package abc173

fun main(args: Array<String>) {
    val n = readInt()
    var s = mutableListOf<String>()
    for (i in 0 until n ) {
        s.add(read())
    }

    val ac = s.count { it == "AC" }
    val wa = s.count { it == "WA" }
    val tle = s.count { it == "TLE" }
    val re = s.count { it == "RE" }

    println("AC x $ac")
    println("WA x $wa")
    println("TLE x $tle")
    println("RE x $re")



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

