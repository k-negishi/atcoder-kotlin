package abc173

fun main(args: Array<String>) {
    val (H, W, K) = readIntList()
    val C = readStringMatrix(H)



}

fun opeRow(s:List<List<String>>, n: Int, h: Int) {
    var list: MutableList<MutableList<String>> = s as MutableList<MutableList<String>>
    for (i in 0 until h) {
        list[n][i] = "a"
    }
}

fun opeCol(s:List<List<String>>, n: Int, w: Int) {
    var list: MutableList<MutableList<String>> = s as MutableList<MutableList<String>>
    for (i in 0 until w) {
        list[i][n] = "a"
    }
}

fun count(s:List<List<String>>, n: Int) {
    var count = 0
    s.forEach { it ->
        count += it.count { it2 ->
            it2 == "#"
        }
    }
}



private fun read() = readLine()!!

private fun readInt() = read().toInt()

private fun readLong() = read().toLong()

private fun readDouble() = read().toDouble()

private fun readStringList() = read().split(" ").toMutableList()

private fun readIntList() = readStringList().map { it.toInt() }

private fun readLongList() = readStringList().map { it.toLong() }

private fun readDoubleList() = readStringList().map { it.toDouble() }

private fun readStringMatrix(n: Int): MutableList<MutableList<String>> {
    val matrix = mutableListOf<MutableList<String>>()
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

