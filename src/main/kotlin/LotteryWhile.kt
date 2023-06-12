//Lottery ödevini tekrar yap. Bu ödevde kullanıcıdan 1 yerine 5 tane tahmin al. Sırayla her tahminin ne kadar kazandığını ekrana yazdır.
fun main(args: Array<String>) {
    val randomSayi = (10..99).random()
    val random=randomSayi.toString()
    var deger=0
    while (deger<5) {
        var tahmin1 = readln()
        deger++
        if (random == tahmin1) {
            println("10.000₺ kazandınız.")
            break
        }
        else if (tahmin1[0] == random[1] && tahmin1[1] == random[0]) {
            println("3.000₺ kazandınız!")
        }
        else if (random[0] == tahmin1[0] || random[0] == tahmin1[1] || random[1] == tahmin1[0] || random[1] == tahmin1[1]) {
            println("1.000₺ kazandınız.")}

        else
            println("Kazanamadınız.")
        }
println("Kazanan sayı:$random")
    }

