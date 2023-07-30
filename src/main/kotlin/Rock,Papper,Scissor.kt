// bi taraf oyunun yarısını geçtiğinde programı sonlandırmayı yapamadım
fun main(args: Array<String>) {
    println("Oyun sayısını giriniz:")
    val input = getOddNumberFromUsers()

    println("Taş, Kağıt, Makas seçeneklerinden birisini yazınız:")
    val input2 = readln()
    firstLetterUpperCaseWord(input2)

   println( whoWinTheGame(randomForRPS(), firstLetterUpperCaseWord(input2)))
}

fun getOddNumberFromUsers(): Int {
    var input = 1
    do {
        input = readln().toInt()
        if (input % 2 == 0) {
            println("Yazdığınız sayının tek basamaklı bir sayı olması gerekmetkedir.")
        }

    } while (input % 2 == 0)
    return input
}//-> Rastgele Rock, paper, scissor üreten fonskiyon yaz.

fun randomForRPS(): String {
    val arrayList = arrayListOf("Taş", "Kağıt", "Makas").random()
    return arrayList
}

fun whoWinTheGame(Computer: String, User: String):Int {
    var Computer = ""
    var User = ""
var kazandi=0
    var kaybetti=0

    if ( User == "Taş" && Computer == "Makas" || User == "Kağıt" && Computer == "Taş" || User == "Makas" && Computer == "Kağıt") {
        println("Bilgisayar ${randomForRPS()} seçmişti kazandınız.")
        kazandi++
    }else{println("Bilgisayar ${randomForRPS()} seçmişti kaybettiniz.")
        kaybetti++}
return kazandi + kaybetti
}

fun firstLetterUpperCaseWord(word: String): String {
    val input = word
    val ilkHarfBuyuk = input[0].uppercase() + input.substring(1, input.length).lowercase()
    return input
}
//-> İki yarışmacının hangisinin kazandığını kontrol eden fonksiyon yaz