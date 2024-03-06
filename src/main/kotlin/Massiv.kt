import java.lang.Math.pow
import java.util.*

fun main() {
 val scanner  = Scanner(System.`in`)

// val n  = scanner.nextInt()
// val A  = scanner.nextInt()
// val B  = scanner.nextInt()
// array1(n)
// array2(n)
// array3(A, D, n)
//println(fib(n))
//    array5(n)
//    array6(n, A, B)
//    array7()
//    array8()
    array9()
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
fun array5(n:Int) {
    var array: Array<Int> = arrayOf()
    for (i in 1..n){
        array += fib(i)
    }
    println(array.contentToString())
}

fun array6(n: Int, A: Int, B: Int) {
    var S = A + B
    var array: Array<Int> = arrayOf(A, B, S)
    for (i in 1..n){
        S += S
        array += S
    }
    println(array.contentToString())
}

fun array7() {
    val array: Array<Int> = arrayOf(2, 6, 8, 9, 10, 12, 45)
    println(array.contentToString())
    array.reverse()
    println(array.contentToString())
}
fun array8() {
    val array: Array<Int> = arrayOf(2, 6, 8, 9, 11, 12, 45)
    for(i in 0..array.size){
        if(array[i]%2 != 0){
            println(array[i])
        }
    }
}
fun array9() {
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45)
    array.sort()
    println(array.contentToString())
}

fun array10(n: Int) {

}