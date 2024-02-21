import java.util.*

fun main() {
    val scanner  = Scanner(System.`in`)

    val n  = scanner.nextInt()
//    println(agar1(n))
    println(agar2(n))
}

fun agar1(n: Int) : Int {
    return if (n > 0) n + 1 else n
}

fun agar2(n: Int) : Int {
    return if (n > 0) n + 1 else n - 2
}