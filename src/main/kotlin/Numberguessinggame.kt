//1 --> 1-20 arasında sayı üret
//2 --> Kullanıcıdan bu sayıyı iste
//3 --> Tahmin daha küçükse daha küçük daha büyükse daha büyük olduğunu belirt ve tahmin sayısını ekrana yazdır.
//4 -->tahmini bilirse tebrikler yazdır
//5 -->tahmin bittiğinde bilememişse bulamadınız tahmin etmeniz gereken buydu diye yazsın
fun main(args: Array<String>) {
    val sayi = (0..20).random()
    var sans=1
    var kalan=2
    while (sans<4){
    print("Tahminizi yazın lütfen:")
        val tahmin= readln().toInt()
        if (tahmin<sayi)
        {
            println("Bilemediniz, daha büyük bir sayı deneyin. Kalan tahmin sayısı:$kalan ")
            sans++
            kalan--
        }
        else if (tahmin>sayi)
        {   println("Bilemediniz, daha küçük bir sayı deneyin. Kalan tahmin sayısı:$kalan")
        sans++
        kalan--}
        else if (tahmin==sayi){
            print("Tahmin doğru. Tebrikler! $sans. denemede sonuca ulaştınız")
            sans=5
        }
    }
    if (sans==4)
        println("Tahmin hakkınız doldu. Bilemediniz. Bulmanız gereken sayı $sayi idi.")
}

