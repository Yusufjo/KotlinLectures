fun main(args:Array<String>) {
    print("İlk sayıyı lütfen giriniz:")
    var n1:Int= readLine()!!.toInt()
    print("2. sayıyı lütfen giriniz:")
    var n2:Int= readLine()!!.toInt()
    var sonuc:Int?
    sonuc= n1*n2
    print("Belirtmiş olduğunuz ilk sayı olan $n1 ve ikinci sayı olan $n2 çarpımı $sonuc olarak bulunmuştur")

}
