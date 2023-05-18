fun main(args: Array<String>) {
    println("Aşağıdaki soruları doğru şekilde cevaplayınız.")

    val dogrucevap1 = 11
    var chance1 = 1
    while (chance1 < 3) {
        print("Soru1 :7+4=")
        val cevap1 = readln().toInt()
        if (chance1 == 2 && dogrucevap1 != cevap1) {
            println("Son cevap hakkınızı yanlış olarak tamamladınız.")
            break
        } else if (dogrucevap1 != cevap1) {
            println("Cevap yanlıştır. Tekrar cevap verebilirsiniz.")
            chance1++
        } else {
            chance1 = 5
        }

    }

    var chance2 = 1
    val dogrucevap2 = 4
    while (chance2 < 3) {
        print("Soru2: 2+2=")
        val cevap2 = readln().toInt()
        if (chance2==2 && cevap2!=dogrucevap2)
        {
            println("Son cevap hakkınızı yanlış olarak tamamladınız.")
            break
        }
       else if (cevap2 != 4) {
            println("Verdiğiniz cevap yanlıştır. Bir cevap daha hakkınız bulunmaktadır.")
            chance2++
        } else
            chance2 = 5
    }

    var chance3 = 1
    val dogrucevap3 = 5
    while (chance3 < 3) {
        print("Soru3: 5/1=")
        val cevap3 = readln().toInt()
        if (cevap3 != dogrucevap3) {
            println("Cevabınız yanlıştır. Bir cevap daha verme hakkınız bulunmaktadır.")
            chance3++
        } else
            chance3 = 5
    }
    var chance4 = 1
    val dogrucevap4 = "ankara"
    while (chance4 < 3) {
        print("Soru4: Türkiyenin başkenti neresidir?:")
        val cevap4 = readln().toString().lowercase()
        if (cevap4 != dogrucevap4) {
            println("Cevabınız yanlıştır. Bir cevap daha verme hakkınız bulunmaktadır.")
            chance4++
        } else
            chance4 = 5
    }

    var toplamdogru = 0

    if (chance1 == 5) {
        toplamdogru += 1
    } else
        println("1. soru cevabınız yanlıştır.")


    if (chance2 == 5)
        toplamdogru++
    else
        println("2. soru cevabınız yanlıştır.")


    if (chance3 == 5)
        toplamdogru++
    else
        println("3. soru cevabınız yanlıştır.")

    if (chance4 == 5)
        toplamdogru++
    else
        println("4. soru cevabınız yanlıştır.")

    if (toplamdogru == 4)
        println("Yanlış cevap bulunmamaktadır.")

    println("toplam doğru: $toplamdogru")


}