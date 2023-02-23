package abc101_200.abc167

fun main() {
    var (a, b, c,k) = readListInt()
    var ans = 0

    if (a >= k) {
        println(k)
        return
    }
    ans += a
    k -= a
    if (b >= k) {
        println(ans)
        return
    }
    k -= b
    ans -= k
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


