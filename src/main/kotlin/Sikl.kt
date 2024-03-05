import java.lang.Math.pow
import java.util.*

fun main() {
 val scanner  = Scanner(System.`in`)

 val n  = scanner.nextDouble()
 val k  = scanner.nextDouble()
// println(for1(n,k))
// println(for2(n,k))
// println(for3(n,k))
// println(for4(n))
// println(for5(n))
//    for7(n,k)
//    for8(n,k)
//    for9(n,k)
// for10(n)
// for11(n)
// for12(n)
 for36(n,k)
}
fun for1(n: Int, k: Int) {
  for (i in 1..n) {
   println(k)
  }
}

fun for2(n: Int, k: Int) {
 for (i in n..k) {
  println(i)
 }
}

fun for3(n: Int, k: Int) {
 for (i in k-1 downTo  n+1) {
  println(i)
 }
}

fun for4(n: Int) {
 for (i in 1..10) {
  println(i*n)
 }
}

fun for7(n: Int, k:Int) {
 var A = 0
 for (i in n.rangeTo(k)) {
  A += i
 }
 println(A)
}

fun for8(n: Int, k:Int) {
 var A = 1
 for (i in n.rangeTo(k)) {
  A *= i
 }
 println(A)
}

fun for9(n:Int, k:Int) {
 var S = 0
 for (i in n.rangeTo(k)) {
  S += (i*i)
 }
 println(S)
}

fun for10(n:Int) {
 var S = 0
 for (i in 1.rangeTo(n)) {
  S += 1/i
 }
 println(S)
}

fun for11(n:Int) {
 var S = 0
 for (i in 1.rangeTo(n)) {
  S += (2*i) * (2*i)
 }
 println(S)
}

fun for12(n:Int) {
 var S = 0.0
 for (i in 1.rangeTo(n)) {
  S += (i + 1.1)
 }
 println(S)
}

fun for36(n:Double, k: Double) {
 var S = 0.0
 for (i in 1..n.toInt()) {
  for (k in 1..i) {
   S += pow(i.toDouble(), k.toDouble())
  }
 }
 println(S)
}

fun while1(){
 
}