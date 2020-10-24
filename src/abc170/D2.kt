package abc170

const val M = 1000006
fun main(args: Array<String>) {
    val n = readInt()
    val a = readListInt().sorted()
    val cnt = List<Int>(M){ 0 }.toMutableList()
    for (x in a) {
        if (cnt[x] != 0 ) {
            cnt[x] = 2
            continue
        }
        for (i in x until M step x) {
            cnt[i] ++
        }
    }
    var ans = 0
    for (x in a) {
        if (cnt[x] == 1) ans++
    }
    println(ans)


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

