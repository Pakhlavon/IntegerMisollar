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
//    array9()
//    array10()
//    array11(n)
//    array12()
//    array13()
//    array14()
//    array15()
//    array16()
    array18()
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

fun array10() {
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45)
    var array2: Array<Int> = arrayOf()
    var array3: Array<Int> = arrayOf()
    for(i in 0..array.size - 1){
        if (array[i]%2 == 0) {
            array2 += array[i]
            array2.sort()
        } else {
            array3 += array[i]
            array3.sortDescending()
        }
    }
    println(array2.contentToString())
    println(array3.contentToString())
}

fun array11(k: Int){
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45)
    var array2: Array<Int> = arrayOf()
    for (i in 0..array.size-1) {
        when(array[i]%k){
           0 -> array2 += array[i]
        }
    }
    println(array2.contentToString())
}

fun array12(){
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45, 88)
    var array2: Array<Int> = arrayOf()
    for (i in 0..array.size-1){
        when(i%2){
            0 -> array2 += array[i]
        }
    }
    println(array2.contentToString())
}
fun array13(){
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45, 88, 89)
    var array2: Array<Int> = arrayOf()
    for (i in 0..array.size-1){
        when(i%2){
            1 -> array2 += array[i]
        }
    }
    array2.sortDescending()
    println(array2.contentToString())
}

fun array14(){
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45, 88, 89)
    var array2: Array<Int> = arrayOf()
    var array3: Array<Int> = arrayOf()
    for (i in 0..array.size-1){
        when(i%2){
            1 -> array2 += array[i]
            0 -> array3 += array[i]
        }
    }
    println(array3.contentToString())
    println(array2.contentToString())
}

fun array15(){
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45, 88, 89)
    var array2: Array<Int> = arrayOf()
    var array3: Array<Int> = arrayOf()
    for (i in 0..array.size-1){
        when(i%2){
            1 -> array2 += array[i]
            0 -> array3 += array[i]
        }
    }
    array2.sortDescending()
    println(array3.contentToString())
    println(array2.contentToString())
}

fun array16(){
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45, 88, 89)
    var array2: Array<Int> = arrayOf()
    for (i in 0..array.size-1){
       array2 += array[i]
       array2 += array[i-1]
    }
    println(array2.contentToString())
}

fun array18(){
    val array: Array<Int> = arrayOf(2, 6, 8, 97, 11, 12, 45, 88, 89)
      for(i in 0 .. array.size -1) {
          if (array.last() > array[i]){
              println(array[i])
          }
      }
}