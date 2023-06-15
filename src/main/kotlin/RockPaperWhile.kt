fun main(args: Array<String>) {
    // Rock, paper, scissor ödevini tekrar yap. Bu ödevde kullanıcıdan kaç el oynamak istediğini sor.
// Oyunlar tek haneli sayılarda oynanabilir. 1-3-5-7 gibi. Kazanan belli olana kadar ya da el sayısı bitene kadar oyun
// devam etsin. Örneğin, 5 el oynanacaksa ve kullanıcı ilk 3 eli alırsa oyun biter.
    print("Kaç el oynamak istiyorsunuz?(Tek sayı giriniz):")
    val kacOyun = readln().toInt()
    var deger = 0
    var kazandi = 0
    var kaybetti = 0
    while (deger < kacOyun) {
        deger++
        if (kacOyun.toDouble()/2 > kazandi && kacOyun.toDouble()/2 > kaybetti) {
            val list = listOf("taş", "kağıt", "makas")
            val listRandom = list.random()
            print("Lütfen birisini seçin. Taş(0), Kağıt(1), Makas(2) :\n\n")
            val input = readln()
            var value = ""
            if (input.equals("0"))
                value = "taş"
            else if (input.equals("1"))
                value = "kağıt"
            else if (input.equals("2"))
                value = "makas"


            if (value == "taş" && listRandom == "makas" || value == "kağıt" && listRandom == "taş" || value == "makas" && listRandom == "kağıt") {
                kazandi++
                println("Seçiminiz: $value\nBilgisayar $listRandom seçmişti. Kazandınız.\nSiz:$kazandi Bilgisayar:$kaybetti")
            } else if (listRandom == value)
                println("Seçiminiz $value\nBilgisayar $listRandom seçmişti. Berabere kaldınız.\nSiz:$kazandi Bilgisayar:$kaybetti")
            else {
                kaybetti++
                println("Seçiminiz: $value\nBilgisayar $listRandom seçmişti. Kaybettiniz.\nSiz:$kazandi Bilgisayar:$kaybetti")
            }

        }
    }
    if (kazandi > kaybetti)
        println("KAZANDINIZ!!")
    else
        println("KAYBETTİNİZ:(")
}