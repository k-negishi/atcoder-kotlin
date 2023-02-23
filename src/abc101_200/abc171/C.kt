package abc101_200.abc171

import kotlin.math.pow

fun main(args: Array<String>) {
    var n = readLong()
    println(solve(n))
}

fun solve(n: Long): String {
    var keta = 0
    var temp = 0
    for (i in 1..100) {
        if (n <= 26.0.pow(i) + temp) {
            keta = i
            break
        }
        temp = 26.0.pow(i).toInt()
    }
    var ans = ""
    var temp2 = 0L
    for (i in 1..keta) {
        var amari = (n-temp2) % 26.0.pow(i).toInt()
//        println(amari)
        ans = if (i == 1) {
            alphabet(amari.toInt()) + ans
        } else {
            alphabet2(amari.toInt()) + ans
        }
        temp2 += amari
    }
    return ans
}

fun alphabet(n: Int): String {
    val str = "abcdefghijklmnopqrstuvwxyz"
    return str[n - 1].toString()
}

fun alphabet2(n: Int): String {
    val str = "abcdefghijklmnopqrstuvwxyz"
    var amari = n % 26
    println(amari)
    var num = if (amari == 0) 25 else amari - 1
    return str[amari - 1].toString()
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

