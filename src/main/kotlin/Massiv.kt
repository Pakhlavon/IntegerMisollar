import java.lang.Math.pow
import java.util.*

fun main() {
 val scanner  = Scanner(System.`in`)

 val n  = scanner.nextInt()
// val A  = scanner.nextInt()
// val D  = scanner.nextInt()
// array1(n)
// array2(n)
// array3(A, D, n)
println(fib(n))
}

fun array1(n: Int) {
  var array: Array<Int> = arrayOf()
  for(i in 1..n step 2) {
    array +=i
  }
 println(array.contentToString())
}
fun array2(n: Int) {
    var array: Array<Int> = arrayOf()
    for(i in 1..n) {
        val a =  pow(2.0, i.toDouble())
        array += a.toInt()
    }
    println(array.contentToString())
}
fun array3(A: Int, D: Int, n: Int) {
    var array: Array<Int> = arrayOf()
    for(i in 1..n) {
        val a =  A + (i - 1) * D
        array += a
    }
    println(array.contentToString())
}

fun fib(n:Int) : Int {
    if (n<=2) {
        return 1
    }
    else {
        return fib(n-1) + fib(n-2)
    }
}