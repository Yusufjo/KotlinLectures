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

    val filmler = mutableListOf<String>()
    val dramaFilmler = mutableListOf("The Mother", "Buğday Tanesi", "Bir Yılda Yaşam", "Bir Eksik")
    val bagimsizFilmler = mutableListOf("Rüzgarı Dinleyen Çocuk", "Kod8", "Amatör", "Kayıp Odanın Eşyaları")
    val gerilimFilmler = mutableListOf("Zamanda Tutsak", "Tin ve Tina", "Kurak Günler", "Prestij", "Yaralı Yüz")
    val korkuFilmler = mutableListOf("Arınma Gecesi", "Parçalanmış", "Korku Seansı", "Day Shift")
    val aileVeCocukFilmler = mutableListOf("Spirit", "Cadılar", "Şapkalı Kedi", "Chupa")
    val diziler = mutableListOf("New Amsterdam", "Bloudhounds", "Sahte Profil", "Black Mirror")
    val diziAvM= mutableListOf("Walking Dead","Gölge ve Kemik","Lupin","Outlander","Narcos")
    val diziSBG= mutableListOf("Transformers","Arnold","The Days","Manifest","Alice")
    val diziAmerikan= mutableListOf("Power","Breaking Bad","Lucifer","Good Girls","BlackList")
    val diziBelgesel= mutableListOf("Kraliçe Kleopatra","Formula1","Neymar","Bebekler","İnsan")
    val diziBKF= mutableListOf("Ragnar","Vorteks","%3","Titans","Sabrina")
    val romantikFilmler = mutableListOf("Bir Yılda Yaşam", "Hayat Güzel", "Bay ve Bayan Smith", "Ufo")
    val BKF = mutableListOf("Assasins Creed", "Yıldızlararası", "Lucy", "Drifting Home")
    val komediFilmleri = mutableListOf("İllegal Hayatlar", "Düşeş", "İnce İşler", "Murder Mystery")
    filmler.addAll(dramaFilmler)
    filmler.addAll(bagimsizFilmler)
    filmler.addAll(gerilimFilmler)
    filmler.addAll(korkuFilmler)
    filmler.addAll(diziler)
    filmler.addAll(romantikFilmler)
    filmler.addAll(aileVeCocukFilmler)
    filmler.addAll(komediFilmleri)
    filmler.addAll(BKF)
    diziler.addAll(diziAvM)
    diziler.addAll(diziSBG)
    diziler.addAll(diziAmerikan)
    diziler.addAll(diziBelgesel)
    diziler.addAll(diziBKF)
    filmler.shuffle()

    println("FİLMLER\n"+filmler.take(5))
    println("DİZİLER\n"+diziler.take(5))

    println("Menü(1)")
    val menu= readln()

    if (menu.equals("1")){
        print("1-Filmler\n2-Diziler")
        var degerGeri=0
        val inputGeri=0
        val inputMenu= readln()

        while (degerGeri==0){
        if(inputMenu=="1"){
           println("1-Drama Filmler\n2-Bağımsız Filmler\n3-Gerilim Filmler\n4-Korku Filmleri\n5-Romantik Filmler" +
                   "\n6-Aile ve Çocuk\n7-Komedi Filmleri\n8-Bilim Kurgu ve Fantastik\n9-Çıkış")
            val inputFMenu= readln()


            if(inputFMenu=="1"){
               println("DRAMA FİLMLER"+dramaFilmler+"\nGeri için (q)'e basınız.")
            val inputFgeri= readln()
                if (inputFgeri=="q"){
                    inputGeri==0}
                else {
                    println(dramaFilmler.indexOf(inputFgeri+1))// burası düzenlenecek-q haricinde hala döngü devam ediyor
                degerGeri==1}
            }

              else if (inputFMenu=="2")  {
               println("BAĞIMSIZ FİLMLER"+bagimsizFilmler+"\nGeri için (1)'e basınız.")}
            else if (inputFMenu=="3"){
                println("GERİLİM FİLMLER"+gerilimFilmler+"\nGeri için (1)'e basınız.")}
            else if (inputFMenu=="4"){
               println("KORKU FİLMLERİ"+gerilimFilmler+"\nGeri için (1)'e basınız.")}
            else if (inputFMenu=="5"){
                println("ROMANTİK FİLMLER"+gerilimFilmler+"\nGeri için (1)'e basınız.")}
            else if (inputFMenu=="6"){
               println("AİLE ve ÇOCUK"+gerilimFilmler+"\nGeri için (1)'e basınız.")}
            else if (inputFMenu=="7"){
                println("KOMEDİ FİLMLERİ"+gerilimFilmler+"\nGeri için (1)'e basınız.")}
            else if (inputFMenu=="8"){
                println("BİLİM KURGU ve FANTASTİK"+gerilimFilmler+"\nGeri için (1)'e basınız.")}
            else if (inputFMenu=="9")  {
                 println("Çıkış")}}






           else if (inputMenu=="2") {
            println(
                "1-Aksiyon ve Macera\n2-Son Bir Yılda Girenler\n3-Amerikan Dizileri\n4-Belgesel diziler" +
                        "\n5-Bilim ve Kurgu Dizileri\n6-Çıkış"
            )
            val inputDMenu = readln()

        }
           }
        }}





