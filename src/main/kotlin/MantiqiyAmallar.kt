import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val f = scanner.nextInt()
//    boolean1(n)
//    boolean2(n)
//    boolean3(n)
//    boolean4(n,m)
//    boolean5(n,m)
//    boolean6(n,m,f)
//    boolean7(n,m,f)
//    boolean8(n,m)
//    boolean9(n,m)
//    boolean10(n,m)
//    boolean11(n,m)
//    boolean12(n,m,f)
//    boolean13(n,m,f)
//    boolean14(n,m,f)
//    boolean15(n,m,f)
//    boolean16(n)
//    boolean17(n)
    boolean18(n,m,f)
//    boolean16(n)
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
fun boolean6(a:Int, b:Int, c:Int){
    if (a<=b && b<=c){
        println("Rostlikka to'g'ri")
    }
    else {
        println("Rostlikka yolg'on")
    }
}
fun boolean7(a:Int, b:Int, c:Int){
    if (a<=b && b<=c){
        println("Rostlikka to'g'ri")
    }
    else{
        println("Rostlikka noto'g'ri")
    }
}
fun boolean8(a:Int, b:Int){
    if (a%2!=0 && b%2 != 0){
        println("Rostlikka to'g'ri")
    }
    else{
        println("Rostlikka Noto'g'ri")
    }
}
fun boolean9(a:Int,b:Int){
    if (a%2 !=0 || b%2 !=0 ){
        println("Rostlikka to'g'ri")
    }
    else{
        println("Rostlikka Noto'g'ri")
    }
}
fun boolean10(a:Int, b:Int){
    if (a%2 != 0 && b%2 ==0){
        println("Rostlikka to'g'ri")
    }
    else if (a%2 == 0 && a%2 !=0 ) {
    println("Rostlikka to'g'ri")
    }
    else{
        println("Rostlikka Noto'g'ri")
    }
}

fun boolean11(a:Int,b:Int){
    if (a%2 == 0 && b%2 == 0){
        println("Rostlikka to'g'ri")
    }
    else if (a%2 != 0 && b%2 != 0){
        println("Rostlikka To'g'ri")
    }
    else{
        println("Rostlikka noto'g'ri")
    }
}
fun boolean12(a:Int, b:Int, c:Int){
    if (a>0 && b>0 && c>0){
        println("Rostlikka to'g'ri")
    }
    else
    {
        println("Rostlikka Noto'g'ri")
    }
}
fun boolean13(a:Int, b:Int, c:Int){
    if (a>0 || b>0 || c>0)
    {
        println("Rostlikka to'g'ri")
    }
    else{
        println("Rostlikka noto'g'ri")
    }
}
fun boolean14(a:Int,b:Int,c:Int){
    if (a>0 && b<0 && c<0){
        println("Rostlikka to'g'ri")
    }
    else if (a<0 && b>0 && c<0 ){
        println("Rostlikka to'g'ri")
    }
    else if (a<0 && b<0 && c > 0){
        println("Rostlikka to'g'ri")
    }
    else {
        println("Rostlikka notog'ri")
    }
}
fun boolean15(a:Int, b:Int, c:Int){
    if (a>0 && b>0 && c<0){
        println("Rostlikka to'g'ri")
    }
    else if (a>0 && b<0 && c>0 ){
        println("Rostlikka to'g'ri")
    }
    else if (a<0 && b>0 && c > 0){
        println("Rostlikka to'g'ri")
    }
    else {
        println("Rostlikka notog'ri")
    }
}
fun boolean16(a:Int){
     if (a>9 && a<100 && a%2 == 0){
         println("Rostlikka to'g'ri")
     }
     else {
         println("Rostlikka notog'ri")
     }
}
fun boolean17(a:Int){
    if (a>99 && a<=999 && a%2 !=0){
        println("Rostlikka to'g'ri")
    }
    else {
        println("Rostlikka notog'ri")
    }
}
fun boolean18(a:Int, b:Int, c:Int){
    if (a==b && a==c && c!=b){
        println("Rostlikka to'g'ri")
    }
    else if (a==b && b== c && a!=c){ println("Rostlikka to'g'ri")
    }
    else if(a!=b && b==c &&a==c){
        println("Rostlikka to'g'ri")
    }
    else if (a==b && a!=c && b!=c){
        println("Rostlikka to'g'ri")
    }
    else if (a!=b && a==c && b!=c){
        println("Rostlikka to'g'ri")
    }
    else if (a!=c && a!=b && b==c){
        println("Rostlikka to'g'ri")
    }
    else{
        println("Rostlikka notog'ri")
    }
}
fun boolean19(a:Int, b:Int, c:Int){
    if (a==b && a==c && c!=b){
        println("Rostlikka to'g'ri")
    }
    else if (a==b && b== c && a!=c){ println("Rostlikka to'g'ri")
    }
    else if(a!=b && b==c &&a==c){
        println("Rostlikka to'g'ri")
    }
    else if (a==b && a!=c && b!=c){
        println("Rostlikka to'g'ri")
    }
    else if (a!=b && a==c && b!=c){
        println("Rostlikka to'g'ri")
    }
    else if (a!=c && a!=b && b==c){
        println("Rostlikka to'g'ri")
    }
    else{
        println("Rostlikka notog'ri")
    }
}