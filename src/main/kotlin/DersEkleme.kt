fun main(args: Array<String>) {
    val usernick = listOf("Yusufjoe", "NuNu12", "Beyaz.61")
    val userpass = listOf("Joefree61", "Nurten123", "Ookumus")
    val LessonBil = listOf(
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
    val LessonMak = listOf(
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
    val LessonIng = listOf(
        "dilbilime giriş",
        "ingiliz kültürü",
        "çeviri uygulamaları",
        "eski ve ortaçağ ingiliz edebiyatı",
        "16. ve 17. yüzyıl ingiliz edebiyatı",
        "18. yy ingiliz romanı",
        "kısa öykü"
    )
    val YusufDersler = mutableListOf("mat-2", "fizik-1", "data structures")
    val NurtenDersler = mutableListOf("mat-2", "fizik-2", "statik-1, dinamik-1")
    val OmerDersler = mutableListOf("çeviri Uygulamaları", "eski ve ortaçağ ingiliz edebiyatı")

    val YusufVerilenDersler = mutableListOf("mat-1", "digital design", "computer programming-1")
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
    when (readln()) {
        "1" -> {//if (Kull == usernick[0] && Sifre == userpass[0])
            println("Alınabilecek Dersler: ")
            val AlDerslerYusuf = LessonBil.subtract(YusufVerilenDersler).subtract(YusufDersler)
            println(AlDerslerYusuf)
            println("Hangi dersleri eklemek istediğinizi yazınız:")
            val derssecmeY = readln().lowercase()
            if (YusufDersler.contains(derssecmeY))
                println("Bu dersi zaten almışsınız.")
            else {
                val EklenenDerslerY = derssecmeY.split(",")
                YusufDersler.addAll(EklenenDerslerY)
                if (EklenenDerslerY.size > 4)
                    println("Maksimum 4 adet ders seçebilirsiniz.")
                else if (EklenenDerslerY.size < 2)
                    println("Minimum 2 ders seçebilirsiniz.")
                else
                    if (derssecmeY.endsWith("2") && !YusufVerilenDersler.contains(derssecmeY.substring(0, 3)))
                        print("1.sini tamamlamadığınız derslerin 2.sini alamazsınız.")
                    else print("$EklenenDerslerY Başarılı Olarak Eklendi.\nMevcut Dersleriniz: $YusufDersler")
            }
            // else if (Kull == usernick[1] && Sifre == userpass[1]
            println("Alınabilecek Dersler: ")
            val AlNurtenDersler = LessonMak.subtract(NurtenVerilenDersler).subtract(NurtenDersler)
            println(AlNurtenDersler)
            println("Hangi Dersleri Eklemek İstediğinizi Yazınız: ")
            val DersSecmeN = readln().lowercase()
            if (NurtenDersler.contains(DersSecmeN))
                println("Bu dersi zaten almışsınız.")
            else {
                val EklenenDerslerN = DersSecmeN.split(",")
                NurtenDersler.addAll(EklenenDerslerN)
                if (EklenenDerslerN.size>4)
                    println("Minimum 4 ders seçmelisiniz.")
                else if (EklenenDerslerN.size<2)
                    println("Minimum 2 ders seçmelisiniz.")
                else println("$EklenenDerslerN Başarılı olarak eklendi.\nMevcut Dersleriniz: $NurtenDersler")
            }
// else if (Kull == usernick[2] && Sifre == userpass[2]
            println("Alınabilecek Dersler: ")
            val AlOmerDersler = LessonIng.subtract(OmerVerilenDersler).subtract(OmerDersler)
            println(AlOmerDersler)
            println("Hangi Dersleri Eklemek İstediğinizi Yazınız: ")
            val DersSecmeO = readln().lowercase()
            if (OmerDersler.contains(DersSecmeN))
                println("Bu dersi zaten almışsınız.")
            else {
                val EklenenDerslerO = DersSecmeN.split(",")
                OmerDersler.addAll(EklenenDerslerO)
                if (EklenenDerslerO.size>4)
                    println("Minimum 4 ders seçmelisiniz.")
                else if (EklenenDerslerO.size<2)
                    println("Minimum 2 ders seçmelisiniz.")
                else println("$EklenenDerslerO Başarılı olarak eklendi.\nMevcut Dersleriniz: $OmerDersler")
            }
        }


        "2" -> {//if (Kull == usernick[0] && Sifre == userpass[0])
            println("Çıkartabileceğiniz dersler: $YusufDersler\n Hangi dersleri çıkarmak istediğinizi yazın:")
            val inputCikarY = readln().lowercase()
            val InputCikarYCok = inputCikarY.split(",")
            YusufDersler.removeAll(InputCikarYCok)
            println("$YusufDersler\nProgram sonlandırılıyor...")

            //if (Kull == usernick[1] && Sifre == userpass[1])
            println("Çıkartabileceğiniz dersler: $NurtenDersler\n Hangi dersleri çıkarmak istediğinizi yazın:")
            val inputCikarN = readln().lowercase()
            val InputCikarNCok = inputCikarN.split(",")
            NurtenDersler.removeAll(InputCikarNCok)
            println("$NurtenDersler\nProgram sonlandırılıyor...")

            //if (Kull == usernick[2] && Sifre == userpass[2])
            println("Çıkartabileceğiniz dersler: $NurtenDersler\n Hangi dersleri çıkarmak istediğinizi yazın:")
            val inputCikarO = readln().lowercase()
            val InputCikarOCok = inputCikarO.split(",")
            OmerDersler.removeAll(InputCikarOCok)
            println("$OmerDersler\nProgram sonlandırılıyor...")

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