fun main(args: Array<String>) {
    var kayitlilar = listOf("joefree", "Nurten", "omerokumus")
    val randomsayi = (10..99).random()
    val randomsayi1 = (10..99).random()
    print("Kullanici adını giriniz:")
    val kullanici = readln()

    //if (kullanici == kayitlilar[0] || kullanici == kayitlilar[1] || kullanici == kayitlilar[2])
if (!kayitlilar.contains(kullanici))
        println("Bu kullanıcı adı zaten alınmış..Bunları deneyebilirsiniz: $kullanici$randomsayi, $kullanici$randomsayi1")
    else {
        print("Şifrenizi giriniz:")
        val sifre = readln()

        if (sifre.length < 8)
            println("Şifreniz 8 karakterden küçüktür.")
        else
            println("Kullanıcı oluşturuldu.")
    }
}


