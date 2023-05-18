import java.util.*

fun main() {
    val baslik= "Türkiye'ye hoş geldiniz"
    println(baslik[2])
    println(baslik.toLowerCase())
    println(baslik.toUpperCase())
    println("split özelliği: " +baslik.split(" "))
}

fun println(ints: Array<Int>, intRange: IntRange) {

}

fun main(args: Array<String>) {
    var dizitamsayı= Array<Int> (5){0}
    dizitamsayı[2]=45
    println(dizitamsayı)

}