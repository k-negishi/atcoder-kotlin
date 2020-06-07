//package abc169
//
//fun main(args: Array<String>) {
//    val a = readInt()
//    val b = readInt()
//
//    println(a * b)
//}
//
//fun read() = readLine()!!
//
//fun readInt() = read().toInt()
//
//fun readLong() = read().toLong()
//
//fun readDouble() = read().toDouble()
//
//fun readListString() = read().split(" ")
//
//fun readListInt() = readListString().map { it.toInt() }
//
//fun readListLong() = readListString().map { it.toLong() }
//
//fun readListDouble() = readListString().map { it.toDouble() }
//
//fun readMatrixString(n: Int): List<List<String>> {
//    val matrix = mutableListOf<List<String>>()
//    for (i in 0 until n) {
//        val list = readListString()
//        matrix.add(list)
//    }
//    return matrix
//}
//
//fun readMatrixInt(n: Int): List<List<Int>> {
//    val matrix = mutableListOf<List<Int>>()
//    for (i in 0 until n) {
//        val list = readListInt()
//        matrix.add(list)
//    }
//    return matrix
//}
//
//fun readMatrixDouble(n: Int): List<List<Double>> {
//    val matrix = mutableListOf<List<Double>>()
//    for (i in 0 until n) {
//        val list = readListDouble()
//        matrix.add(list)
//    }
//    return matrix
//}
//
//fun readMatrixLong(n: Int): List<List<Long>> {
//    val matrix = mutableListOf<List<Long>>()
//    for (i in 0 until n) {
//        val list = readListLong()
//        matrix.add(list)
//    }
//    return matrix
//}