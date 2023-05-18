fun main(args: Array<String>) {
    val oyun = listOf("taş","kağıt","makas")
val tas="taş"
    val kagit="kağıt"
    val makas="makas"
    val random = oyun.random()
    print("Taş, kağıt, makas seçeneklerinden birisini yazın:")

    val talep = readln()
//    var value = ""
//    if (talep.equals("0"))
//        value = "Taş"
//    else if (talep.equals("1"))
//        value = "Kağıt"
//    else if (talep.equals("2"))
//        value = "Makas"

    if (talep.equals(tas) && random.equals(makas))
        println("Bilgisayar $random seçmişti. Kazandınız.")
    else if (talep.equals("Taş",ignoreCase = true) && random.equals("Kağıt"))
        println("Bilgisayar $random seçmişti. Kaybettiniz.")
    else if (talep.equals("Kağıt") && random.equals("Makas"))
        println("Bilgisayar $random seçmişti. Kaybettiniz.")
    else if (talep.equals("Kağıt") && random.equals("Taş"))
        println("Bilgisayar $random seçmişti. Kazandınız.")
    else if (talep.equals("Makas") && random.equals("Kağıt"))
        println("Bilgisayar $random seçmişti. Kazandınız.")
    else if (talep.equals("Makas") && random.equals("Taş"))
        println("Bilgisayar $random seçmişti. Kaybettiniz.")
    else if (random == talep)
        println("Bilgisayar $random seçmişti. Berabere kaldınız.")


}