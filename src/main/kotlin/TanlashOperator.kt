import java.util.Scanner
import java.util.StringJoiner

fun main() {
    val scanner  = Scanner(System.`in`)

    val a  = scanner.nextInt()
//    val b  = scanner.nextInt()
//    val c  = scanner.nextInt()
//    println(choose1(a))
//    println(choose2(a))
//    println(choose3(a))
//    println(choose4(a))
//    println(choose5(a, b, c))
//    println(choose6(a, b))
//    println(choose7(a, b))
//    println(choose16(a))
    println(choose17(a))
}

fun choose1(a: Int): String {
    val s = a%7
   return when(s) {
        0 -> "Yakshanba"
        1 -> "Dushanba"
        2 -> "Seshanba"
        3 -> "Chorshanba"
        4 -> "Payshanba"
        5 -> "Juma"
        6 -> "Shanba"
       else -> {""}
   }
}

fun choose2(a:Int) : String {
    return when(a) {
        1 -> "Yomon"
        2 -> "Qoniqarsiz"
        3 -> "Qoniqarli"
        4 -> "Yaxshi"
        5 -> "A'lo"
        else -> {"Xato"}
    }
}

fun choose3(a:Int) : String {
    return when(a) {
      in 1..2 -> "Qish"
      in  3..5 -> "Bahor"
      in  6..8 -> " Yoz"
      in  9..11 -> "Kuz"
        12 -> "Qish"
        else -> "Xato"
    }
}

fun choose4(a:Int) : Int {
    return  when(a) {
        1,3,5,7,8,10,12 -> 31
        4,6,9,11 -> 30
        2 -> 29
        else -> 0
    }
}

fun choose5(a: Int, b: Int, amal:Int) : Int {
    return when(amal) {
            1 -> a+b
            2 -> a-b
            3 -> a/b
            4 -> a*b
            else -> amal
    }
}

fun choose6(a: Int, birlik:Int) : Int {
    return when(birlik) {
        1 -> a * 10
        2 -> a * (1/1000)
        3 -> a
        4 -> a / 1000
        5 -> a / 100
        else -> a
    }
}
fun choose7(a: Int, birlik:Int) : Int {
    return when(birlik) {
        1 -> a
        2 -> a / 1000
        3 -> a /100
        4 -> a * 1000
        5 -> a / 100
        else -> a
    }
}

fun choose16(a:Int) : String {
    val f = a/10
    var e = 0
    if (f>2 && f<6) {
      e = a % 10
    }
   val on =  when(f) {
        2 -> "Yigirma"
        3 -> "ottiz"
        4 -> "Qirq"
        5 -> "Ellik"
        6 -> "oltmish"
        else -> "Xato"
    }
    val birlik = when(e) {
        0 -> ""
        1 -> "Bir"
        2 -> "Ikki"
        3 -> "Uch"
        4 -> "Tort"
        5 -> "Besh"
        6 -> "Olti"
        7 -> "Yetti"
        8 -> "Sakkiz"
        9 -> "Toqqiz"
        else -> ""
    }
    return "$on $birlik yosh"
}

fun choose17(a:Int) : String {
    val w = a/100
    val f = (a - w * 100)/10
    val e = (a - w * 100) % 10
    val yuz = when(w) {
        1 -> "Yuz"
        2 -> "Ikki Yuz"
        3 -> "Uch Yuz"
        4 -> "Tort Yuz"
        5 -> "Besh Yuz"
        6 -> "Olti Yuz"
        7 -> "Yetti Yuz"
        8 -> "Sakkiz Yuz"
        9 -> "Toqqiz Yuz"
        else -> "Xato"
    }
    val on =  when(f) {
        1 -> "On"
        2 -> "Yigirma"
        3 -> "ottiz"
        4 -> "Qirq"
        5 -> "Ellik"
        6 -> "oltmish"
        7 -> "yetmish"
        8 -> "sakson"
        9 -> "toqson"
        else -> "Xato"
    }
    val birlik = when(e) {
        0 -> ""
        1 -> "Bir"
        2 -> "Ikki"
        3 -> "Uch"
        4 -> "Tort"
        5 -> "Besh"
        6 -> "Olti"
        7 -> "Yetti"
        8 -> "Sakkiz"
        9 -> "Toqqiz"
        else -> ""
    }
    return "$yuz $on $birlik yosh"
}