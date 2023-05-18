fun main(args: Array<String>) {
    //1->3 tane kullanıcı adı ve şifre oluştur.
    //2-> Kullanıcı adı ve şifreyi üyeden iste
    //3-> doğru ise hoş geldin yanlış ise şifreyi tekrar denet
    val kullanici1 = "joefree"
    val sifre1 = "12345"
    val kullanici2 = "Nurten"
    val sifre2 = "Nunu123"
    val kullanici3 = "omerokumus"
    val sifre3 = "oomer12"
    var sans = 0
    var kulsans = 2
    print("Kullanıcı adınızı giriniz:")
    val isteKul = readln()
    while (sans < 3) {

        print("Şifrenizi giriniz:")
        val isteSif = readln()
        if (isteKul == kullanici1 && isteSif != sifre1) {
            println("Şifreniz hatalıdır. Kalan hakkınız:$kulsans")
            sans++
            kulsans--
        } else if (isteKul == kullanici2 && isteSif != sifre2) {
            println("Şifreniz hatalıdır. Kalan hakkınız:$kulsans")
            sans++
            kulsans--
        } else if (isteKul == kullanici3 && isteSif != sifre3) {
            println("Şifre hatalıdır. Kalan hakkınız:$kulsans")
            sans++
            kulsans--
        } else if (isteKul == kullanici1 && isteSif == sifre1) {
            print("Hoş geldin $kullanici1")
            sans = 5
        } else if (isteKul == kullanici2 && isteSif == sifre2) {
            print("Hoş geldin $kullanici2")
            sans = 5
        } else if (isteKul == kullanici3 && isteSif == sifre3) {
            print("Hoş geldin $kullanici3")
            sans = 5
        } else {
            println("Kullanıcı adı ya da şifre hatalıdır.")
            sans = 3
        }
    }
    if (isteKul == kullanici1) {

    } else if (isteKul == kullanici2) {

    } else if (isteKul == kullanici3) {

    } else {

    }
}
