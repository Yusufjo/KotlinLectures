fun main(args: Array<String>) {
    val kartnumarasi= listOf("1","2","3","4","5","6","7","8","9","10","jack","Queen","King")
    val kartturu= listOf("Maça","Karo","Sinek","Kupa")
    val randomnumara=kartnumarasi.random()
    val randomtur=kartturu.random()
    println("Seçilen kart: $randomnumara $randomtur")
}