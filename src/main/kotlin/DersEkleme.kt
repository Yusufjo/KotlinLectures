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
    val YusufDersler = mutableListOf("mat-2", "fizik-1", "data structures")
    val NurtenDersler = mutableListOf("mat-2", "fizik-2", "statik-1, dinamik-1")
    val OmerDersler = mutableListOf("çeviri Uygulamaları", "eski ve ortaçağ ingiliz edebiyatı")

    val YusufAlinanDersler = mutableListOf("Mat-1", "Digital Design", "Computer Programming-1")
    val NurtenAlinanDersler = mutableListOf("Mat-1", "Fizik-1", "Diferansiyel Denklemler")
    val OmerAlinanDersler = mutableListOf("Dilbilime Giriş", "İngiliz Kültürü")

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
            for (kalandersler1 in LessonBil)
                if (kalandersler1 !in YusufDersler && kalandersler1 !in YusufAlinanDersler)
                    println(kalandersler1)
            println("Hangi dersleri eklemek istediğinizi yazınız:")
            val derssecme = readln().lowercase()
            if (YusufDersler.contains(derssecme))
                println("Bu dersi zaten almışsınız.")
            else {
                YusufDersler.add(derssecme)
                print("Mevcut Dersleriniz: $YusufDersler")
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