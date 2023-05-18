fun main(args: Array<String>) {
    print("Bugün günlerden nedir?:")
    val gun = readln().lowercase()
    var value = 0
    if (gun.equals("pazartesi"))
        value = 0
    if (gun.equals("salı"))
        value = 1
    if (gun.equals("çarşamba"))
        value = 2
    if (gun.equals("perşembe"))
        value = 3
    if (gun.equals("cuma"))
        value = 4
    if (gun.equals("cumartesi"))
        value = 5
    if (gun.equals("pazar"))
        value = 6


    print("Kaç gün sonrasını öğrenmek istiyorsunuz?:")
    val kacgunsonrasi = readln().toInt()
    val toplam = (value + kacgunsonrasi)
    if (toplam % 7 == 0)
        println("$kacgunsonrasi gün sonrası pazartesi günü'dür.")
    if (toplam % 7 == 1)
        println("$kacgunsonrasi gün sonrası salı günü'dür.")
    if (toplam % 7 == 2)
        println("$kacgunsonrasi gün sonrası çarşamba günü'dür.")
    if (toplam % 7 == 3)
        println("$kacgunsonrasi gün sonrası perşembe günü'dür.")
    if (toplam % 7 == 4)
        println("$kacgunsonrasi gün sonrası cuma günü'dür.")
    if (toplam % 7 == 5)
        println("$kacgunsonrasi gün sonrası cumartesi günü'dür.")
    if (toplam % 7 == 6)
        println("$kacgunsonrasi gün sonrası pazar günü'dür.")

}






