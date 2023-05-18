fun main(args: Array<String>) {


    print("Lütfen Sayıyı Giriniz:")
    val a= readln().toInt()

    if  (a%2==0 && a%3==0 && a%5==0)
        println("5 ve 6 sayılarına tam bölünebiliyor.")
    else
    {
        if (a % 2 == 0 && a % 3 == 0)
            println("6 ile tam bölünebiliyor")
        else
            println("6 ile tam bölünemiyor")
        if (a % 5 == 0)
            println("5 ile tam bölünebiliyor.")
        else
            println("5 ile tam bölünemiyor.")
        println("5 ve 6 sayılarına tam bölünemiyor.")
    }



}