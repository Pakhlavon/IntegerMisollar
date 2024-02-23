import java.util.*

fun main() {
 val scanner  = Scanner(System.`in`)

 val n  = scanner.nextInt()
 val k  = scanner.nextInt()
// println(for1(n,k))
// println(for2(n,k))
// println(for3(n,k))
// println(for4(n))
// println(for5(n))
    for7(n, k)
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
 val A = 0
 for (i in n..k) {
  println(A += i)
 }
}