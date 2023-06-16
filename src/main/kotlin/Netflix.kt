fun main(args: Array<String>) {
    println("NETFLİX!")
    val kullanicilar =
        mutableListOf("Yusuf61")// daha sonra kayıtlı değilse kayıt olabilecekleri bir sayfa oluştur ve kullanıcılara ekle
    val sifreler = mutableListOf("yusuf6161")
    var inputKullanici = ""
    var inputSifresi = ""
    var kayitOlundu = 0
    while (kayitOlundu != 1) {
        // Eğer kullanıcı adını ya da şifresini yanlış girerse tekrar giriş yapılması için
        print("Kayıtlı değilseniz kayıt olmak için lütfen '0' yazınız.\n\nKullanıcı adınızı giriniz:")
        inputKullanici = readln()
        var olanKullaniciAdi = 0

        if (inputKullanici == "0") {
            while (olanKullaniciAdi == 0) {
                //Eğer Kayıt olmak isterken olan bir kullanıcı adı girerse tekrar farklı bir kullanıcı adı girsin diye
                print("Lütfen bir kullanıcı adı belirleyin:")
                val kullaniciadiEkle = readln()
                if (kullanicilar.contains(kullaniciadiEkle)) {
                    println("Böyle bir kullanıcı adı bulunmaktadır.\n")

                } else {
                    olanKullaniciAdi = 1
                    if (olanKullaniciAdi == 1) {
                        kullanicilar.add(kullaniciadiEkle)

                        print("Lütfen bir şifre belirleyin")
                        val sifreEkle = readln()
                        println("Kayıt Başarılı. Tekrar giriş sayfasına yönlendiriliyorsunuz.\n\n")
                        sifreler.add(sifreEkle)
                    }

                }
            }
        } else {
            print("Şifrenizi giriniz:")
            inputSifresi = readln()


            val kullaniciIndeks = kullanicilar.indexOf(inputKullanici)
            val sifreIndeks = sifreler.indexOf(inputSifresi)

            if (kullanicilar.contains(inputKullanici) && sifreler.contains(inputSifresi) && kullaniciIndeks == sifreIndeks) {
                println("Giriş Başarılı\n\n\n**NETFLİX**")
                kayitOlundu = 1
            } else
                println("Kullanıcı adınız ya da şifreniz yanlış.")
        }
    }

    val filmler = mutableListOf("")
    val dramaFilmler = mutableListOf("The Mother", "Buğday Tanesi", "Bir Yılda Yaşam", "Bir Eksik")
    val bagimsizFilmler = mutableListOf("Rüzgarı Dinleyen Çocuk", "Kod8", "Amatör", "Kayıp Odanın Eşyaları")
    val gerilimFilmler = mutableListOf("Zamanda Tutsak", "Tin ve Tina", "Kurak Günler", "Prestij", "Yaralı Yüz")
    val korkuFilmler = mutableListOf("Arınma Gecesi", "Parçalanmış", "Korku Seansı", "Day Shift")
    val aileVeCocukFilmler = mutableListOf("Spirit", "Cadılar", "Şapkalı Kedi", "Chupa")
    val diziler = mutableListOf("New Amsterdam", "Bloudhounds", "Sahte Profil", "Black Mirror")
}
