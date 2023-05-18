fun main(args: Array<String>) {
    print("Vize Notunuzu giriniz:")
    val vize = readln().toDouble()
    print("Final Notunuzu giriniz:")
    val final = readln().toDouble()
    print("Ödev Notunuzu giriniz:")
    val odev = readln().toDouble()
    val sonuc = (vize * 0.3) + (final * 0.5) + (odev * 0.2)
    println("sonuc::" + sonuc)
    if (
        sonuc <= 45
    )
        println("Kaldınız.")
    else
        print("Geçtiniz.")
}