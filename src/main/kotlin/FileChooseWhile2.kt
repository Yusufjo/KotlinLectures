
fun main(args: Array<String>) {
//    - Password Generator ödevini tekrar yap. Bu ödevde şifre karakter sayısını, kaç tane küçük harf, kaç tane büyük harf,
//    kaç tane sayı, kaç tane noktalama işareti olacağını kullanıcıdan al. Şifre belirli bir kalıpta olmayacak, shuffle edilmeli.
//    - Password Generator
//            Part 1: 8 haneli rastgele karakterlerden oluşan içinde 2 tane büyük harf,
//    2 tane sayı ve 4 tane de küçük harf bulunan bir şifre oluştur. Buradaki şifre deseni (pattern) şöyle olsun:
//    bbnnsskkkk
//    b: büyük harf
//    s: sayı
//    k: küçük harf
    val KucukHarfListesi= listOf("q","w","e","r","t","y","u","ı","o","p","ğ","ü","a","s","d"
        ,"f","g","h","j","k","l","ş","i","z","x","c","v","b","n","m","ö","ç")
    val BuyukHarfListesi= listOf("Q","W","E","R","T","Y","U","I","O","P","Ğ","Ü","A","S","D"
        ,"F","G","H","J","K","L","Ş","İ","Z","X","C","V","B","N","M","Ö","Ç")
val NoktalaIsaretleriListesi= listOf("!","^","+","%","&","/","(",")","=","?","_","-","*",".")
    val SayiListesi= listOf("1","2","3","4","5","6","7","8","9","0")
    val tumliste= mutableListOf<String>()
    tumliste.addAll(BuyukHarfListesi)
    tumliste.addAll(KucukHarfListesi)
    tumliste.addAll(SayiListesi)
    tumliste.addAll(NoktalaIsaretleriListesi)
    var sifre= mutableListOf<String>()
    println("Şifre karakter sayısını yazınız:")
    var SifreSayisi= readln().toInt()
    var Deger=0
    var Deger2=0
    print("Kaç adet küçük harf olsun:")
    val KacAdetK =readln().toInt()
    print("Kaç adet büyük harf olsun:")
    val KacAdetB=readln().toInt()
    print("Kaç adet noktalama işaretleri olsun:")
    val KacAdetN=readln().toInt()
    print("Kaç adet sayı olsun:")
    val KacAdetS=readln().toInt()




        for (kucukharf in 1..KacAdetK) {
        sifre.add(KucukHarfListesi.random())
            Deger++
        }


    for (buyukharf in 1..KacAdetB) {
        sifre.add(BuyukHarfListesi.random())
        Deger++
    }


            for (Noktalama in 1..KacAdetN) {
                sifre.add(NoktalaIsaretleriListesi.random())
                Deger++
            }


            for (Sayi in 1..KacAdetS) {
                sifre.add(SayiListesi.random())
                Deger++
            }
    sifre.shuffle()



    println(sifre.joinToString(""))
}