fun main(args: Array<String>) {
    var toplam = 0
    var sayi: Int

    do {
        print("Bir sayı girin (0 çıkış): ")
        sayi = readLine()!!.toInt()
        toplam += sayi
    } while (sayi != 0)

    println("Toplam: $toplam")
}


