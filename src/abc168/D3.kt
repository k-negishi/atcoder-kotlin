import java.util.*

fun main() {
    val (n, m) = readIntList()
    val graph = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = readIntList()
        graph[a].add(b)
        graph[b].add(a)
    }
    val memo = Array(n + 1) { -1 }.apply { this[1] = 0 }

    val queue = ArrayDeque<Int>()
    queue.addLast(1)
    while (queue.isNotEmpty()) {
        val room = queue.first()
        queue.removeFirst()
        graph[room].forEach {
            if (memo[it] == -1) {
                memo[it] = room
                queue.addLast(it)
            }
        }
    }

    println("Yes")
    for (i in 2..n) {
        println(memo[i])
    }
}

fun readString() = readLine()!!
fun readInt() = readLine()!!.toInt()
fun readLong() = readLine()!!.toLong()
fun readIntList() = readLine()!!.split(" ").map(String::toInt)
fun readLongList() = readLine()!!.split(" ").map(String::toLong)
fun <T> Array<Array<T>>.print() {
    this.forEach {
        println(it.joinToString(" "))
    }
}
