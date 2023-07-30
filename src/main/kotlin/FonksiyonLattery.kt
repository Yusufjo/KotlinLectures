fun main(args: Array<String>) {
    val input=randomNumber(10,99)
    val guess= takeInput()
    println("$input - $guess")
    if (tamBilmesiDurumu(input,guess)){
        println("10₺ kazandınız.")
    }
    else if (tersiniBilmesiDurumu(input,guess)){
        println("5₺ kazandınız")
    }
    else if (birBasamakBilmesiDurumu(input, guess)){
        println("1₺ kazandınız")
    }
    else
        println("yaramı kazandınız.")
}
fun tamBilmesiDurumu(input:Int,Gues:Int):Boolean{
    return input==Gues
}
fun tersiniBilmesiDurumu(input:Int,guess:Int):Boolean{
    return input.toString()==guess.toString().reversed()
}
fun birBasamakBilmesiDurumu(input: Int,guess: Int):Boolean{
   return input.toString()[0] in guess.toString() || input.toString()[1] in guess.toString()
}