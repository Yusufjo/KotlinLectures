fun main(args: Array<String>) {
    var sonuc= topla(3,8)
    println(sonuc)
    sonuc=cikar(13,8)
    println(sonuc)
    print("İsminizi giriniz:")
    val isim2= readln()
    println(merhabaYaz(isim2))
    println(bol(5.0,2.0))
}
fun topla(sayi1:Int, sayi2:Int):Int{
    return sayi1+sayi2
}

fun cikar(sayi1: Int, sayi2: Int):Int=sayi1-sayi2

fun merhabaYaz(isim:String):String="Merhaba "+ isim

fun bol(sayi1: Double,sayi2: Double=1.0): Double=(sayi1/sayi2).toDouble()