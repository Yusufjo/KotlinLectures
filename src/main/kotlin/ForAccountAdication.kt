fun main(args: Array<String>) {
    for (i in 1..Int.MAX_VALUE) {
        print("Hizmet bedeliniz yazınız:")
        val HizmetBedeli = readln()
        if (HizmetBedeli == "q")
            { print("Program Sonlandırılıyor.")
            break
            }
         else {
            val BahsisBedeli = HizmetBedeli.toDouble() * 0.15
            val Toplam = HizmetBedeli.toDouble() + BahsisBedeli
            println("Hizmet Bedeli:$HizmetBedeli\nBahşiş Bedeli:$BahsisBedeli\nToplam Maliyet:$Toplam")
        }
    }
}