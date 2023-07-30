fun main(args: Array<String>) {

    val input=takeInput()
    val input2= takeInput()
    val min=Math.min(input,input2)
    val max=Math.max(input,input2)
    val n=randomNumber(min,max)
    println(n)
}

fun randomNumber(start: Int, end: Int) :Int {
    val randomNum = (start..end).random()
    return randomNum
}
fun takeInput():Int{
    var input:Int?
    do { input= readln().toIntOrNull()
        if(input==null){
            println("Sayı olarak giriniz.")
        }
    }while (input==null)
    return input
}

