#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

fun main() {
    

}


private fun read() = readln()

private fun readInt() = read().toInt()

private fun readLong() = read().toLong()

private fun readDouble() = read().toDouble()

private fun readStringList(): MutableList<String> = read().split(" ").toMutableList()

private inline fun <reified T> readList(transform: (String) -> T): MutableList<T> =
    readStringList().map(transform).toMutableList()

private fun readIntList(): MutableList<Int> = readList { it.toInt() }
private fun readLongList(): MutableList<Long> = readList { it.toLong() }
private fun readDoubleList(): MutableList<Double> = readList { it.toDouble() }

private inline fun <reified T> readListFromOne(zero: T, transform: (String) -> T): MutableList<T> {
    val initialList = listOf(zero)
    return (initialList + readStringList().map(transform)).toMutableList()
}

private fun readIntListFromOne(): MutableList<Int> = readListFromOne(0) { it.toInt() }
private fun readLongListFromOne(): MutableList<Long> = readListFromOne(0L) { it.toLong() }

private inline fun <reified T> readMatrix(n: Int, readRow: () -> MutableList<T>): MutableList<MutableList<T>> {
    val matrix = mutableListOf<MutableList<T>>()
    repeat(n) {
        matrix.add(readRow())
    }
    return matrix
}

private fun readStringMatrix(n: Int): MutableList<MutableList<String>> =
    readMatrix(n) { readStringList() }

private fun readIntMatrix(n: Int): MutableList<MutableList<Int>> =
    readMatrix(n) { readIntList() }

private fun readDoubleMatrix(n: Int): MutableList<MutableList<Double>> =
    readMatrix(n) { readDoubleList() }

private fun readLongMatrix(n: Int): MutableList<MutableList<Long>> =
    readMatrix(n) { readLongList() }

private fun <T : Comparable<T>> List<T>.lowerBound(value: T): Int {
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

private fun <T : Comparable<T>> List<T>.upperBound(value: T): Int {
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

#end
#parse("File Header.java")
