

fun main() {
    val ar: Array<Long> = arrayOf(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)
    println(aVeryBigSum(ar))
}

fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sumOf { it }
}