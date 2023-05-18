fun main(args: Array<String>) {
    print("Hizmet bedeli:")
    var h=readLine()!!.toDouble()
    var b=h*0.15
    var t=h+b
    println("Hizmet bedeliniz: $h")
    println("Bahşiş tutarı: $b")
    println("Toplam Tutar: $t")
}