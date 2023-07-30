fun main(args: Array<String>) {
    var input=""
    while (input!="q") {
        input = readln()
        println(palindrome(input))
    }
}
fun palindrome(x:String):Boolean{
    return x==x.reversed()
}