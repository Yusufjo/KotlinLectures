fun main(args: Array<String>) {
    //4 Soruluk Quiz ödevini tekrar yap. Bu ödevde 4 soru üretmek yerine kaç soru
// sorulacağını kullanıcıdan al. İşlemleri eşit sayıda sor. Hepsinden 2'şer tane gibi.
    //        Ek-1: Soruların yeri karışık olsun
    //        Ek-2: Soru sayıları rastgele olsun
    //        Ek-3: Kullanıcı isterse özel olarak kaç tane toplama kaç tane çıkartma kaç tane çarpma ve kaç tane bölme
//        istediğini söyleyebilir. Eğer herhangi bir işlem için bilgi vermezse rastgele sen üret. Örneğin kullanıcı 10
//        soru istedi bu 10 sorudan 3 tanesi toplama olsun dedi. O halde kalan 7 taneyi rastgele diğer işlemlere dağıt.
    val islemlistesi = listOf("+", "*", "/", "-")
    var deger = 0
    var deger3=0
    print("Kaç adet soru istiyorsunuz?:")
    val kacSoruInput = readln().toInt()
    print("Kaç adet toplama, çarpma,çıkarma, bölme istediğinizi yazınız:")
    val hangiIslemKacKere = readln().split(",")
    val hangiIslemKacKereListesi = mutableListOf<String>()
    hangiIslemKacKereListesi.addAll(hangiIslemKacKere)
    for (i in hangiIslemKacKereListesi) {
        i.substring(0, i.length - (i.length - 1))//kaç adet olduklarını ayırdım
        i.substring(1, i.length)//hangi işlemi istediklerini ayırdım
        var deger = 0
        var hangiIslemiNeKadarIstiyor = i.substring(0, i.length - (i.length - 1)).toInt()
        var hangiIslemiIstiyor = i.substring(1, i.length)
        var deger2 = 0
        while (deger < kacSoruInput) {
            val sayi1 = (1..99).random()
            val sayi2 = (1..99).random()

            if (hangiIslemiNeKadarIstiyor > deger2) {
                print("$sayi1$hangiIslemiIstiyor$sayi2=?:")
                val input = readln().toInt()
                deger2++
                deger3++
                deger++
            } else {deger++
                if (hangiIslemiNeKadarIstiyor != deger2)  {
                    val islem = islemlistesi.random()
                    println("$sayi1$islem$sayi2=?:")
                    val input = readln().toInt()

                    if (islem == islemlistesi[0] && sayi1 + sayi2 == input ||
                        islem == islemlistesi[1] && sayi1 * sayi2 == input ||
                        islem == islemlistesi[2] && sayi1 / sayi2 == input ||
                        islem == islemlistesi[3] && sayi1 - sayi2 == input
                    )
                        println("Doğru Cevap")
                    else
                        println("Yanlış Cevap")


                    deger++
                }
            }
        }
    }
}