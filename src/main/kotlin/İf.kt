fun main(args: Array<String>)
{
    print("Notunuzu giriniz:")
    var not= readLine()!!.toDouble()

    if(not>=80)
        (
         println("A ile geçtiniz.")
                )
    if(not >=50 && not<=85)
    {
                not=not+10
                println("notunuz 10 puan arttırılmıştır.")
    }
    if(not<50)
        (
        println("Kaldın oç")
                )
    print("Yıl sonu notunuz: "+not+" ")
}