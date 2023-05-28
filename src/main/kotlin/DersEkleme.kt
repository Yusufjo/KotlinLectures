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
    var DersN = LessonMak[0]

    print("Kullanıcı adınız:")
    val Kull = readln()
    if (Kull in usernick) {
        print("Şifreniz:")
        val Sifre = readln()
        if (Kull == usernick[0] && Sifre == userpass[0] || Kull == usernick[1] && Sifre == userpass[1] || Kull == usernick[2] && Sifre == userpass[2]) {
            println("Giriş başarılı..\n\n")
            print("1- Ders Ekleme\n2- Ders Çıkarma\n3- Çıkış\n")
            when (readln()) {
                "1" -> if (Kull == usernick[0] && Sifre == userpass[0]) {
                    println("Alınabilecek Dersler: ")
                    val AlDerslerYusuf = LessonBil.subtract(YusufVerilenDersler).subtract(YusufDersler)
                    println(AlDerslerYusuf)
                    println("Hangi dersleri eklemek istediğinizi yazınız:")
                    val derssecmeY = readln().lowercase()
                    val EklenenDerslerY = derssecmeY.split(",")
                    YusufDersler.addAll(EklenenDerslerY)
                    if (YusufDersler.contains(derssecmeY)) {
                        println("Bu dersi zaten almışsınız.")
                    } else {
                        if (EklenenDerslerY.size > 4)
                            println("Maksimum 4 adet ders seçebilirsiniz.")
                        else if (EklenenDerslerY.size < 2)
                            println("Minimum 2 ders seçebilirsiniz.")
                        else
                            if (EklenenDerslerY.contains("mat-2") && !YusufVerilenDersler.contains("mat-1") || EklenenDerslerY.contains(
                                    "fizik-2"
                                ) && !YusufVerilenDersler.contains("fizik-1") || EklenenDerslerY.contains("computer programming-2") && !YusufVerilenDersler.contains(
                                    "computer programming-1"
                                )
                            )
                                print("1.sini tamamlamadığınız derslerin 2.sini alamazsınız.")
                            else print("$EklenenDerslerY Başarılı Olarak Eklendi.\nMevcut Dersleriniz: $YusufDersler")
                    }
                } else if (Kull == usernick[1] && Sifre == userpass[1]) {
                    println("Alınabilecek Dersler: ")
                    val AlNurtenDersler = LessonMak.subtract(NurtenVerilenDersler).subtract(NurtenDersler)
                    println(AlNurtenDersler)
                    println("Hangi Dersleri Eklemek İstediğinizi Yazınız: ")
                    val DersSecmeN = readln().lowercase()

                    if (NurtenDersler.contains(DersSecmeN)) {
                        println("Bu dersi zaten almışsınız.")
                    } else {
                        val EklenenDerslerN = DersSecmeN.split(",")
                        NurtenDersler.addAll(EklenenDerslerN)

                        if (EklenenDerslerN.size > 4)
                            println("Minimum 4 ders seçmelisiniz.")
                        else if (EklenenDerslerN.size < 2)
                            println("Minimum 2 ders seçmelisiniz.")
                        else
                            for (kontrol2 in EklenenDerslerN) {
                                for (kontrol in NurtenVerilenDersler) {
                                    if (!kontrol2.substring(0, kontrol2.length - 1).contains(kontrol))
                                    {DersN = kontrol2
                                        }
                                }

                            }
                        print("${DersN.substring(0, DersN.length - 1)}2 dersini ${DersN.substring(0, DersN.length - 1
                                        )
                                    }1 dersini tamamlamadığınız için alamazsınız.")

                        if (EklenenDerslerN.contains("mat-2") && !NurtenVerilenDersler.contains("mat-1") || EklenenDerslerN.contains(
                                "fizik-2"
                            ) && !NurtenVerilenDersler.contains("fizik-1") || EklenenDerslerN.contains("statik-2") && !NurtenVerilenDersler.contains(
                                "statik-1"
                            ) || EklenenDerslerN.contains("dinamik-2") && !NurtenVerilenDersler.contains("dinamik-1")
                        )
                            print("1.sini tamamlamadığınız derslerin 2.sini alamazsınız.")
                        else println("$EklenenDerslerN Başarılı olarak eklendi.\nMevcut Dersleriniz: $NurtenDersler")
                    }
                } else if (Kull == usernick[2] && Sifre == userpass[2]) {
                    println("Alınabilecek Dersler: ")
                    val AlOmerDersler = LessonIng.subtract(OmerVerilenDersler).subtract(OmerDersler)
                    println(AlOmerDersler)
                    println("Hangi Dersleri Eklemek İstediğinizi Yazınız: ")
                    val DersSecmeO = readln().lowercase()
                    if (OmerDersler.contains(DersSecmeO))
                        println("Bu dersi zaten almışsınız.")
                    else {
                        val EklenenDerslerO = DersSecmeO.split(",")
                        OmerDersler.addAll(EklenenDerslerO)
                        if (EklenenDerslerO.size > 4)
                            println("Minimum 4 ders seçmelisiniz.")
                        else if (EklenenDerslerO.size < 2)
                            println("Minimum 2 ders seçmelisiniz.")
                        else println("$EklenenDerslerO Başarılı olarak eklendi.\nMevcut Dersleriniz: $OmerDersler")
                    }
                }

                "2" -> {
                    if (Kull == usernick[0] && Sifre == userpass[0])
                        println("Çıkartabileceğiniz dersler: $YusufDersler\n Hangi dersleri çıkarmak istediğinizi yazın:")
                    val inputCikarY = readln().lowercase()
                    val InputCikarYCok = inputCikarY.split(",")
                    YusufDersler.removeAll(InputCikarYCok)
                    val MaksCikY = YusufDersler.size + InputCikarYCok.size - 2

                    if (YusufDersler.size < 2)
                        println("En az 2 ders seçmek zorundasınız. Bu nedenle maksimum $MaksCikY ders çıkarabilirsiniz.")
                    else
                        println("$inputCikarY dersleri çıkarıldı. Kalan dersleriniz $YusufDersler\nProgram sonlandırılıyor...")

                    if (Kull == usernick[1] && Sifre == userpass[1])
                        println("Çıkartabileceğiniz dersler: $NurtenDersler\n Hangi dersleri çıkarmak istediğinizi yazın:")
                    val inputCikarN = readln().lowercase()
                    val InputCikarNCok = inputCikarN.split(",")
                    NurtenDersler.removeAll(InputCikarNCok)
                    val MaksCikN = YusufDersler.size + InputCikarNCok.size - 2
                    if (NurtenDersler.size < 2)
                        println("En az 2 ders seçmek zorundasınız. Bu nedenle maksimum $MaksCikN ders çıkarabilirsiniz.")
                    else
                        println("$inputCikarN dersleri çıkarıldı. Kalan dersleriniz $NurtenDersler\nProgram sonlandırılıyor...")

                    if (Kull == usernick[2] && Sifre == userpass[2])
                        println("Çıkartabileceğiniz dersler: $NurtenDersler\n Hangi dersleri çıkarmak istediğinizi yazın:")
                    val inputCikarO = readln().lowercase()
                    val InputCikarOCok = inputCikarO.split(",")
                    OmerDersler.removeAll(InputCikarOCok)
                    val MaksCikO = YusufDersler.size + InputCikarOCok.size - 2
                    if (OmerDersler.size < 2)
                        println("En az 2 ders seçmek zorundasınız. Bu nedenle maksimum $MaksCikO ders çıkarabilirsiniz.")
                    else
                        println("$inputCikarO dersleri çıkarıldı. Kalan dersleriniz $OmerDersler\nProgram sonlandırılıyor...")

                }

                "3" -> {
                    println("Program sonlandırılıyor...")
                }
            }
        } else
            println("Şifreniz hatalıdır.")
    } else
        println("Kullanıcı adınız hatalıdır.")
}


