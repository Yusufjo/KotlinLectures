fun main(args: Array<String>) {


    do {
        print("Hizmet bedelini yazınız:")
        val HizmetBedeli= readln().lowercase()
        if (HizmetBedeli!="q")
        { val BahsisOrani=HizmetBedeli.toDouble()*0.15
        val Toplam=HizmetBedeli.toDouble()+BahsisOrani
        println("Hizmet Bedeli:$HizmetBedeli\nBahşiş Oranı:$BahsisOrani\nToplam Maliyet:$Toplam")}
    }while (HizmetBedeli!="q")
    println("Program Sonlandırılıyor...")
}