import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val m = scanner.nextInt()
//    boolean1(n)
//    boolean2(n)
//    boolean3(n)
//    boolean4(n,m)
    boolean5(n,m)
}

fun boolean1(a:Int){
    if (a>=0) {
        println("A soni musbat")
    }else{
        println("A soni manfiy")
    }
}
fun boolean2(a:Int){
 if (a%2==0){
     println(" A soni juft son")
 }
    else
 {
     println("A soni toq son")
 }
}
fun boolean3(a:Int){
    if (a%2!=0){
        println(" A soni toq son")
    }
    else
    {
        println("A soni juft son")
    }
}
fun boolean4(a:Int,b:Int){
    if (a>2 && b<=3){
        println("amal to'gri")
    }
    else{
        println("amal noto'g'ri")
    }
}

fun boolean5(a:Int,b:Int){
    if (a>=0 && b<-2){
        println("Rostlik to'g'ri")
    }
    else{
        println("Rostlik yolg'on")
    }
}
fun boolean6(a:Int){
    
}