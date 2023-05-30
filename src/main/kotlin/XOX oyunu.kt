fun main(args: Array<String>) {
    val oyun = mutableListOf<String>()

    val sutun11 = mutableListOf<String>()
    val sutun12 = mutableListOf<String>()
    val sutun13 = mutableListOf<String>()
    val satir1 = mutableListOf(sutun11,sutun12,sutun13)

    val sutun21 = mutableListOf<String>()
    val sutun22 = mutableListOf<String>()
    val sutun23 = mutableListOf<String>()
    val satir2 = mutableListOf(sutun21,sutun22,sutun23)


    val sutun31 = mutableListOf<String>()
    val sutun32 = mutableListOf<String>()
    val sutun33 = mutableListOf<String>()
    val satir3 = mutableListOf(sutun31,sutun32,sutun33)

    println(satir1)
    println(satir2)
    println(satir3)

    println("Kullanıcı1: X ya da O harflarinden birisini yazınız:")
    val inputXorO = readln().uppercase().substring(0, 1)
    println("Yazmak istediğiniz harfi satır ve sütun sırasına göre ',' ile ayırarak yazınız.")
    val inputKonum = readln()
    when (inputKonum) {
        "1,1" -> sutun11.add(inputXorO)
        "1,2" -> sutun12.add(inputXorO)
        "1,3" -> sutun13.add(inputXorO)

        "2,1" -> sutun21.add(inputXorO)
        "2,2" -> sutun22.add(inputXorO)
        "2,3" -> sutun23.add(inputXorO)

        "3,1" -> sutun31.add(inputXorO)
        "3,2" -> sutun32.add(inputXorO)
        "3,3" -> sutun33.add(inputXorO)
    }

    println(satir1)
    println(satir2)
    println(satir3)

    println("Kullanıcı2: X ya da O harflarinden birisini yazınız:")
    val inputXorO1 = readln().uppercase().substring(0, 1)
    println("Yazmak istediğiniz harfi satır ve sütun sırasına göre ',' ile ayırarak yazınız.")
    val inputKonum1 = readln()
    when (inputKonum1) {
        "1,1" -> sutun11.add(inputXorO1)
        "1,2" -> sutun12.add(inputXorO1)
        "1,3" -> sutun13.add(inputXorO1)

        "2,1" -> sutun21.add(inputXorO1)
        "2,2" -> sutun22.add(inputXorO1)
        "2,3" -> sutun23.add(inputXorO1)

        "3,1" -> sutun31.add(inputXorO1)
        "3,2" -> sutun32.add(inputXorO1)
        "3,3" -> sutun33.add(inputXorO1)
    }

    println(satir1)
    println(satir2)
    println(satir3)

    println("Kullanıcı1: X ya da O harflarinden birisini yazınız:")
    val inputXorO2 = readln().uppercase().substring(0, 1)
    println("Yazmak istediğiniz harfi satır ve sütun sırasına göre ',' ile ayırarak yazınız.")
    val inputKonum2 = readln()
    when (inputKonum2) {
        "1,1" -> sutun11.add(inputXorO2)
        "1,2" -> sutun12.add(inputXorO2)
        "1,3" -> sutun13.add(inputXorO)

        "2,1" -> sutun21.add(inputXorO2)
        "2,2" -> sutun22.add(inputXorO2)
        "2,3" -> sutun23.add(inputXorO2)

        "3,1" -> sutun31.add(inputXorO2)
        "3,2" -> sutun32.add(inputXorO2)
        "3,3" -> sutun33.add(inputXorO2)
    }
    println(satir1)
    println(satir2)
    println(satir3)

    println("Kullanıcı2: X ya da O harflarinden birisini yazınız:")
    val inputXorO3 = readln().uppercase().substring(0, 1)
    println("Yazmak istediğiniz harfi satır ve sütun sırasına göre ',' ile ayırarak yazınız.")
    val inputKonum3 = readln()
    when (inputKonum3) {
        "1,1" -> sutun11.add(inputXorO3)
        "1,2" -> sutun12.add(inputXorO3)
        "1,3" -> sutun13.add(inputXorO)

        "2,1" -> sutun21.add(inputXorO3)
        "2,2" -> sutun22.add(inputXorO3)
        "2,3" -> sutun23.add(inputXorO3)

        "3,1" -> sutun31.add(inputXorO3)
        "3,2" -> sutun32.add(inputXorO3)
        "3,3" -> sutun33.add(inputXorO3)
    }
    println(satir1)
    println(satir2)
    println(satir3)
}