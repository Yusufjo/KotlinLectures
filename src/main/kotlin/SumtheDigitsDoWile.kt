fun main(args: Array<String>) {
    println("Basamaklarını toplamak istediğiniz sayıyı yazınız:")
    val Sayi= readln()
    val SayiFilter=Sayi.filter { it != '.' }.toInt()
    var Toplam=0
    var Sayi1=SayiFilter
    while (Sayi1>0)
    {
        val Basamak=Sayi1%10
        Toplam+=Basamak
         Sayi1/=10
    }
    println("Toplam Basamak Sayısı:$Toplam")
}