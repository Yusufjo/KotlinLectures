fun main(args: Array<String>) {
    print("9 basamaklı ISBN sayısını giriniz:")

    val isbniste = readln()
    if (isbniste.length < 9)
    { println("Hata! giriş yapmış olduğunuz rakam 9 basamaktan azdır.")}
    else if (isbniste.length > 9)
        println("Girmiş olduğunuz sayı 9 basamaktan büyük olduğu için ilk 9 basamağa göre değerlendirilecektir.")
val isbniste2=isbniste.substring(0,9)

    val isbnsayi = isbniste2[0].toString().toInt() * 1 + isbniste2[1].toString().toInt() * 2 + isbniste2[2].toString()
        .toInt() * 3 + isbniste2[3].toString().toInt() * 4 + isbniste2[4].toString().toInt() * 5 + isbniste2[5].toString()
        .toInt() * 6 + isbniste2[6].toString().toInt() * 7 + isbniste2[7].toString().toInt() * 8 + isbniste2[8].toString()
        .toInt() * 9
    val sonsayi = isbnsayi % 11
    if (isbnsayi % 11 == 10)
        println(isbniste2 + "X")
    else
        println(isbniste2 + sonsayi)

}