import kotlin.math.abs

fun main() {
    val myList = listOf(-1,1,2,3,5,6,56,80,85,96)
//    println(linerSearch(myList, 56))
    println(binarySearch(myList, -1))
}

fun linerSearch(list: List<Int>, item: Int): Int? {
    for (n in list) {
        if (list[n]== item) {
            return n
        }
    }
    return null
}

fun binarySearch(list: List<Int>, item: Int) : Int {
    var low = 0
    var high = list.size - 1
    while (low <= high) {
        val mid = (low + high)//2
        val guess = list[mid]
        if (guess == item) return mid
        else if (guess > mid) high = mid - 1
        else low = mid + 1
    }
    return -1
}