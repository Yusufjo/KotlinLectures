fun main(args: Array<String>) {
    do {
        print("Yol uzunluğunu yazınız:")
        val YolUzunluk = readln().lowercase()
        if (YolUzunluk!="q")
        {
        val BirLitreIleGidilebilenYol = 25.5
        val BenzinLitre = 3.55
        val Sonuc = (YolUzunluk.toDouble() * BenzinLitre) / BirLitreIleGidilebilenYol
        println("Toplam maliyet:$Sonuc₺'dir.")
        }
    }while (YolUzunluk!="q")
    println("Program Sonlandırılıyor...")
}