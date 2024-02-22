import java.util.*
import kotlin.math.sin

fun main() {
    val scanner  = Scanner(System.`in`)

    val a  = scanner.nextInt()
//    val b  = scanner.nextInt()
//    val c  = scanner.nextInt()
//    val d  = scanner.nextInt()
//    println(agar1(n))
//    println(agar2(n))
//    println(agar3(n))
//    println(agar4(a, b, c))
//    println(agar5(a, b, c))
//    println(agar6(a, b))
//    println(agar7(a, b))
//    println(agar8(a, b))
//    println(agar9(a, b))
//    println(agar10(a, b))
//    println(agar11(a, b))
//    println(agar12(a, b, c))
//    println(agar13(a, b, c))
//    println(agar14(a, b, c))
//    println(agar15(a, b, c))
//    println(agar16(a, b, c))
//    println(agar17(a, b, c))
//    println(agar18(a, b, c))
//    println(agar19(a, b, c, d))
//    println(agar28(a))
    println(agar29(a))
}

fun agar1(n: Int) : Int {
    return if (n > 0) n + 1 else n
}

fun agar2(n: Int) : Int {
    return if (n > 0) n + 1 else n - 2
}

fun agar3(n: Int) : Int {
    return if (n > 0) { n + 1 } else if(n == 0) n + 10 else n - 2
}

fun agar4(a: Int, b: Int, c: Int) : Boolean {
    return a > 0 && b > 0 && c> 0
}

fun agar5(a: Int, b: Int, c: Int) : String {
    var musbat = 0
    var manfiy = 0
    if (a > 0) { musbat ++ } else { manfiy ++}
    if (b > 0) { musbat ++ } else { manfiy ++}
    if (c > 0) { musbat ++ } else { manfiy ++}
    return "musbat sonlar $musbat, manfiy sonlar $manfiy"
}

fun agar6(a: Int, b: Int) : Int {
    return if (a > b) a else b
}

fun agar7(a: Int, b: Int) : Int {
    return if (a > b) 2 else 1
}

fun agar8(a: Int, b: Int) : String {
    return if (a > b) "Kattasi $a kichigi $b" else "Kattasi $b kichigi $a"
}

fun agar9(a: Int, b: Int) : String {
    return if (a > b) "A = $b B = $a" else "A = $a B = $b"
}

fun agar10(a: Int, b: Int) : String {
    return if (a != b) "A = $a B = $b yigindisi = ${a + b}" else "A = $a B = $b ozlashtirish = 0"
}

fun agar11(a: Int, b: Int) : String {
    return if (a != b) { if (a > b) { "A = $a B = $b Kattasi = $a" } else {"A = $a B = $b Kattasi = $b"} }
    else "A = $a B = $b ozlashtirish = 0"
}

fun agar12(a: Int, b: Int, c: Int) : Int {
    return if (a > b && b < c) b else if (a < b && a < c) a else c
}

fun agar13(a: Int, b: Int, c: Int) : Int {
    return if (a > b && b < c) b else if (a < b && a < c) a else c
}

fun agar14(a: Int, b: Int, c: Int) : Int {
    return if (a>b && b>c) b else if (a>c && c>b) c else a
}

fun agar15(a: Int, b: Int, c: Int) : String {
    return if (a+b > a+c) "$a va $b" else if (a+c > c+b) "$a va $c" else "$b va $c"
}

fun agar16(a: Int, b: Int, c: Int) : String {
    return if (a < b && b < c) "a = $a b = $b c= $c ikkilantirish  a = ${2*a} b = ${2*b} c= ${2*c}" else "a= -$a b= -$b c= -$c"
}

fun agar17(a: Int, b: Int, c: Int) : String {
    return if (a < b && b < c || a > b && b > c) "a = $a b = $b c= $c ikkilantirish  a = ${2*a} b = ${2*b} c= ${2*c}" else "a= -$a b= -$b c= -$c"
}

fun agar18(a: Int, b: Int, c: Int) : Int {
    return if (a == b) 3 else if (a == c) 2 else if (b == c) 1 else 0
}

fun agar19(a: Int, b: Int, c: Int, d: Int) : Int {
    return if (a == b && a == c) 4 else if (a == b && a == d) 3 else if (b == c && b == d) 1 else if (a == c && c == d) 2 else 0
}

fun agar24(a: Double) : Double {
    return if(a > 0) {2 * sin(a) } else { a-6 }
}

fun agar28(a: Int) : String {
    return if(a%4 == 0) { "Kabisa yil" } else { "Kabisa yili emas" }
}

fun agar29(a: Int) : String {
    return if(a%2 == 0 && a > 0) { "Musbat Juft son" } else { if (a%2 != 0 && a > 0) { "Musbat toq son"} else "nol soni"}
}
