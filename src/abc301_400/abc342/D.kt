package abc301_400.abc342

import kotlin.math.sqrt

fun main() {
    val n = readLong()
    val a = readLongList()

    // 素因数分解結果を保存するマップ
    val map = mutableMapOf<Int, Long>()

    // a の中に含まれる0の個数
    var zero = 0L

    // a の各要素に対して処理を行う
    a.forEach { it ->
        // 0 の場合は zero をインクリメント
        if (it == 0L) {
            zero++
        } else {
            var calcA = it
            var newA = 1
            // 2からsqrt(it)までの素数で割り切れる回数を計算
            for (p in 2..sqrt(it.toDouble()).toInt()) {
                var count = 0
                // 割り切れるだけ割り、その回数を count に加算
                while (calcA % p == 0L) {
                    calcA /= p
                    count++
                }
                // 素数の出現回数を2で割った余りが1の場合、新しい数にその素数を掛ける
                if (count %2 == 1) newA *= p
            }
            // 最後に残った素数を新しい数に掛ける
            if (calcA != 1L) newA *= calcA.toInt()
            // 新しい数をマップに追加または更新
            map[newA] = (map[newA] ?: 0) + 1
        }
    }
    // 全部0でない場合の組み合わせ数を計算
    var ans = c2(n) - c2(n - zero)
    // 素因数分解結果のマップを使って組み合わせ数を追加
    map.forEach { (k, v) ->
        ans += c2(v)
    }
    println(ans)

}

private fun c2(n: Long): Long {
    return n * (n - 1) / 2
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
