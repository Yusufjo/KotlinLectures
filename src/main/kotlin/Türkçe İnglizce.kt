fun main(args: Array<String>) {
    print("Kullanmak istediğiniz dil seçenği nedir?:")
    val dil= readln().lowercase()
    if (dil=="tr")
        println("Hoş geldiniz!")
    else if (dil=="en")
        println("Welcome!")
}
