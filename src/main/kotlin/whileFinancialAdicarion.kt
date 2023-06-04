fun main(args: Array<String>) {

    var deger=0
    while(deger<1)
    {
        print("Hizmet bedelini söyleyiniz:")
        val HizmetBedeli= readln().lowercase()
        if (HizmetBedeli=="q"){
            print("Program kapatılıyor...")
            break
        }
        val BahsisOrani=HizmetBedeli.toDouble()*0.15
        val Toplam=HizmetBedeli.toDouble()+BahsisOrani
        println("Toplam ücret Bahşiş Oranı:$BahsisOrani\n+Hizmet Bedeli:$HizmetBedeli\n=Toplam:$Toplam")
    }
}