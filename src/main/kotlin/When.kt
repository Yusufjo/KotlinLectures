fun main(args: Array<String>) {
    print(" a değerini giriniz:")
    var a= readLine()!!.toInt()

    when(a)
    {
  1-> print("Belirlemiş olduğunuz a daeğeri 1'dir.")
        2,3-> print("Belirlemiş olduğunuz a değeri 2'dir.")
        else-> print("Belirlemiş olduğunuz a değeri geçersizdir.")
        }

}
