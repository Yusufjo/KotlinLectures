fun main(args: Array<String>) {
    var Deger = 1
    while (Deger < 2) {
        print("Yol uzunluğunu yazınız:")
        val YolUzunluk = readln().lowercase()
        if (YolUzunluk!="q"){
        val BirLitreIleGidilebilenYol = 25.5
        val BenzinLitre = 3.55
        val Sonuc = (YolUzunluk.toDouble() * BenzinLitre) / BirLitreIleGidilebilenYol
        println("Toplam maliyet:$Sonuc₺'dir.")}
        else if (YolUzunluk=="q"){
            println("Program Sonlandırılıyor...")
            Deger++
        }

    }
}