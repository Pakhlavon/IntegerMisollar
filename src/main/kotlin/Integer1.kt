import java.util.Scanner

fun main() {
   val scanner  = Scanner(System.`in`)

   val n  = scanner.nextInt()
//   val a  = scanner.nextInt()
//  convertSmToM(n)
//   integer2(n)

//   integer3(n)
//   integer4(n,a)
//      integer5(n,a)
//      integer6(n)
//         integer7(n)
//    integer8(n)
//   integer9(n)
//   integer10(n)
//   integer11(n)
//   integer12(n)
//   integer13(n)
//   integer14(n)
//   integer15(n)
//   integer16(n)
//   integer17(n)
//   integer18(n)
//   integer19(n)
//   integer20(n)
//   integer21(n)
//   integer22(n)
//   integer23(n)
//   integer24(n)
//   integer25(n)
//   integer26(n)
//   integer27(n)
//   integer28(n)
//   integer29()
   integer30(n)
}
fun convertSmToM(l:Int){
   var m = 0F
   m = l/100F
   println(" $l santimetr $m metrga teng bo'ladi")
}

fun integer2(m:Int){
   val t= m/1000F
   println(" $m kilogram $t tonnaga teng")
}

fun integer3(b:Int){
   val k = b/1024
   println(" $b bayt $k kilobatga teng")
}

fun integer4(a:Int, b:Int){
   val n = a/b
   println(" $n marta aylantirish mumkin")

}
fun integer5(a:Int,  b:Int){
   val c= a%b
      println(" $a sonini $b soniga bo'lganda $c qoldiq qoladi")
}
fun integer6(a:Int){
   val c = a/10
   val d = a%10

   println("$a ning o'nliklar xonasidagi qiymati $c ga teng")
   println("$a ning birliklar xonasidagi qiymati $d ga teng")
}

fun integer7(a:Int){
   val c = a/10
   val d = a%10

   val f= c+d
   println(" $a sonining raqamlari yig'indisi $f  ga teng")
}

fun integer8(a:Int) {
   val c = a/10
   val d = a%10
   val f = "$d$c"
   println(" $a sonining raqamlari o'rinlarini almashtirsak ${f}")
}

fun integer9(a:Int){
   val s = a/100
   println(" $a sonining yuzlar xonasidagi raqami $s ga teng")
}

fun integer10(a:Int){
    val c = a/100
    val d = a - c*100
    val r = d / 10
    val g = d%10
   println(" $a sonining birliklar xonasidagi raqami $g ga teng")
   println(" $a sonining o'nliklar xonasidagi raqami $r ga teng")
}
 fun integer11(a:Int){
    val c = a/100
    val d = a - c*100
    val r = d / 10
    val g = d%10
    val t = c+r+g
    println(" $a sonining raqamlari yig'indisi $t ga teng")
 }

fun integer12(a:Int){
   val c = a/100
   val d = a - c*100
   val r = d / 10
   val g = d%10

   println("$a sonining raqamlarini teskari tartibda yozishdan hosil bo'lgan son $g$r$c ga teng")
}

fun integer13(a:Int){
   val c = a/100
   val d = a - c*100
   val r = d / 10
   val g = d%10

   println(" $a sonining chap tomonidan birinchi raqamni o'chirib o'ng tomoniga yozishdan hosil bo'lgan son $r$g$c ga teng ")
}

fun integer14(a:Int){
   val c = a/100
   val d = a - c*100
   val r = d / 10
   val g = d%10

   println(" $a sonining chap tomonidan birinchi raqamni o'chirib o'ng tomoniga yozishdan hosil bo'lgan son $g$c$r ga teng ")
}

fun integer15(a:Int){
   val c = a/100
   val d = a - c*100
   val r = d / 10
   val g = d%10

   println(" $a sonining o'nlar xonasidagi sonlar bilan yuzlar xonasidagi sonni almashtirishdan hosil bo'lgan son $r$c$g ga teng")
}

fun integer16(a:Int){
   val c = a/100
   val d = a - c*100
   val r = d / 10
   val g = d%10
   println(" $a sonining o'nlar xonasidagi sonni birliklar xonasidagi son bilan almashtirishdan hosil bo'lgan son $c$g$r ga teng ")
}
fun integer17(a:Int){
   val c = a/1000
   val d = a - c*1000
   val r = d/100

   println(" $a sonining yuzlar xonasidagi qiymati $r ga teng")
}

fun integer18(a:Int){
   val s= a/1000
   println(" $a sonining mingliklar xonasidagi son bu $s ga teng")
}
fun integer19(a:Int){
   val s = a/60

   println(" $a sekund kun boshidan beri to'liq $s minut o'tdi")
}

fun integer20(a:Int){
   val d = a/3600
   println(" $a sekund kun boshidan beri $d soat to'la vaqt o'tdi")
}

fun integer21(a:Int){
   val s = a/60
   val d = a%60
   println(" $a sekund kun bo'yidan boshlab $s minut va $d sekund vaqt o'tdi")
}

fun integer22(a:Int){
   val d = a/3600
   val f = a%3600

   println(" $a sekund kun boshidan beri $d soat va $f sekund o'tdi")
}

fun integer23(a:Int){
   val s = a/3600
   val m = a - s*3600
   val d = m/60
   val e = m%60
   println(" $a sekund kun boshidan beri $s soat, $d minut va $e sekund o'tdi")
}
fun integer24(k:Int){
   val d = k%7
   when(d){
      1-> println("Dushanba")
      2-> println("Seshanba")
      3-> println("Chorshanba")
      4-> println("Payshanba")
      5-> println("Juma")
      6-> println("Shanba")
      0-> println("Yakshanba")
   }
}
fun integer25(k:Int){
   val d = k%7
   when(d){
      5-> println("Dushanba")
      6-> println("Seshanba")
      0-> println("Chorshanba")
      1-> println("Payshanba")
      2-> println("Juma")
      3-> println("Shanba")
      4-> println("Yakshanba")
   }
}
fun integer26(k:Int){
   val d = k%7
   when(d){
      0-> println("Dushanba")
      1-> println("Seshanba")
      2-> println("Chorshanba")
      3-> println("Payshanba")
      4-> println("Juma")
      5-> println("Shanba")
      6-> println("Yakshanba")
   }
}
fun integer27(k:Int){
   val d = k%7
   when(d){
      2-> println("Dushanba")
      3-> println("Seshanba")
      4-> println("Chorshanba")
      5-> println("Payshanba")
      6-> println("Juma")
      0-> println("Shanba")
      1-> println("Yakshanba")
   }
}
fun integer28(k:Int){
   val d = k%7
   when(d){
      0-> {
         when (d) {
            1 -> println("Dushanba")
            2 -> println("Seshanba")
            3 -> println("Chorshanba")
            4 -> println("Payshanba")
            5 -> println("Juma")
            6 -> println("Shanba")
            0 -> println("Yakshanba")
         }
      }
      1-> {
         when(d){
            2 -> println("Dushanba")
            3 -> println("Seshanba")
            4 -> println("Chorshanba")
            5 -> println("Payshanba")
            6 -> println("Juma")
            0 -> println("Shanba")
            1 -> println("Yakshanba")
         }
      }
      2-> {
         when(d){
            3 -> println("Dushanba")
            4 -> println("Seshanba")
            5 -> println("Chorshanba")
            6 -> println("Payshanba")
            0 -> println("Juma")
            1 -> println("Shanba")
            2 -> println("Yakshanba")
         }
      }
      3-> {
         when(d){
            4 -> println("Dushanba")
            5 -> println("Seshanba")
            6 -> println("Chorshanba")
            0 -> println("Payshanba")
            1 -> println("Juma")
            2 -> println("Shanba")
            3 -> println("Yakshanba")
         }
      }
      4-> {
         when(d){
            5 -> println("Dushanba")
            6 -> println("Seshanba")
            0 -> println("Chorshanba")
            1 -> println("Payshanba")
            2 -> println("Juma")
            3 -> println("Shanba")
            4 -> println("Yakshanba")
         }
      }
      5-> {
         when(d){
            6 -> println("Dushanba")
            0 -> println("Seshanba")
            1 -> println("Chorshanba")
            2 -> println("Payshanba")
            3 -> println("Juma")
            4 -> println("Shanba")
            5 -> println("Yakshanba")
         }
      }
      6-> {
         when(d){
            5 -> println("Dushanba")
            4 -> println("Seshanba")
            3 -> println("Chorshanba")
            2 -> println("Payshanba")
            1 -> println("Juma")
            0 -> println("Shanba")
            6 -> println("Yakshanba")
         }
      }
   }
}
fun integer29(){
   val a = 4
   val b = 5
   val c =3

   val S1 = (a+b)*2
   val S2 = c*c
   println(" biz ${S1/S2} ta butun kvadrat joylashishimiz mumkin va ${S1%S2} yuza qolyapti")
}

fun integer30(a:Int){
 val s = a/100
   println(" $a yil ${s + 1} yuz yillikga kiradi")

}