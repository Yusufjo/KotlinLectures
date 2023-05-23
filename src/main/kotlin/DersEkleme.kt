fun main(args: Array<String>) {
    val usernick = listOf("Yusufjoe", "NuNu12", "Beyaz.61")
    val userpass = listOf("Joefree61", "Nurten123", "Ookumus")
    val LessonBil = setOf(
        "mat-1",
        "mat-2",
        "fizik-1",
        "fizik-2",
        "digital design",
        "computer programming-1",
        "computer programming-2",
        "data structures",
        "algorithm analysis"
    )
    val LessonMak = setOf(
        "mat-1",
        "mat-2",
        "fizik-1",
        "fizik-2",
        "diferansiyel Denklemler",
        "statik-1",
        "statik-2",
        "dinamik-1",
        "dinamik-2",
        "termodinamik",
        "içten yanmalı motorlar"
    )
    val LessonIng = setOf(
        "dilbilime giriş",
        "ingiliz kültürü",
        "çeviri uygulamaları",
        "eski ve ortaçağ ingiliz edebiyatı",
        "16. ve 17. yüzyıl ingiliz edebiyatı",
        "18. yy ingiliz romanı",
        "kısa öykü"
    )
    val YusufDersler = mutableListOf("Mat-2","fizik-1", "data structures")
    val NurtenDersler = mutableListOf("mat-2", "fizik-2", "statik-1, dinamik-1")
    val OmerDersler = mutableListOf("çeviri Uygulamaları", "eski ve ortaçağ ingiliz edebiyatı")

    val YusufVerilenDersler = mutableListOf("mat-1","digital Design", "computer programming-1")
    val NurtenVerilenDersler = mutableListOf("mat-1", "fizik-1", "diferansiyel denklemler")
    val OmerVerilenDersler = mutableListOf("dilbilime giriş", "ingiliz kültürü")

    print("Kullanıcı adınız:")
    //  val Kull = readln()
    //if (Kull in usernick) {
    //  print("Şifreniz:")
    //val Sifre = readln()
    //if (Kull == usernick[0] && Sifre == userpass[0]||Kull == usernick[1] && Sifre == userpass[1]||Kull == usernick[2] && Sifre == userpass[2]) {
    println("Giriş başarılı..\n\n")
    print("1- Ders Ekleme\n2- Ders Çıkarma\n3- Çıkış\n")
    val input = readln()
    when (input) {
        "1" -> {//if (Kull == usernick[0] && Sifre == userpass[0])
            println("Alınabilecek Dersler: ")
            val AlDerslerYusuf = LessonBil.subtract(YusufVerilenDersler).subtract(YusufDersler)
            println(AlDerslerYusuf)
            println("Hangi dersleri eklemek istediğinizi yazınız:")
            val derssecme = readln().lowercase()
            if (YusufDersler.contains(derssecme))
                println("Bu dersi zaten almışsınız.")
            else {
                val eklenendersler = derssecme.split(",")
                YusufDersler.addAll(eklenendersler)
                if (YusufDersler.size > 4)
                    println("Maksimum 4 adet ders seçebilirsiniz.")
                else
                    if (derssecme.contains("2") && !YusufVerilenDersler.contains("1"))
                        print("$derssecme 1 Dersini tamamlamadan 2. dersi alamazsınız.")
                    else print("Ders Seçiminiz Başarılı Olarak Eklendi.\nMevcut Dersleriniz: $YusufDersler")
            }

        }


        "2" -> {

        }

        "3" -> {
            println("Program sonlandırılıyor...")
        }
    }
}// else
// println("Şifreniz hatalıdır.")
//} //else
//println("Kullanıcı adınız hatalıdır..")
//}