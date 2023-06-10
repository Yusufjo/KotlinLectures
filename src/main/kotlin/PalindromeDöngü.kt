fun main(args: Array<String>) {
    val Deger=0
    do {
    print("Palindrome olarak kontrol etmek istediğinizi yazınız:")
    val input = readln().lowercase()
        if (input!="q"&& input.length%2==1){
    val ilkPalindrome = input.substring(0, input.length / 2)
    val ikinciPalindrome = input.substring(input.length / 2 + 1, input.length).reversed()
    if (ilkPalindrome == ikinciPalindrome) {
        println("Belirttiğiniz kelime ya da sayı Palindromedir.")
    } else
        println("Belirttiğiniz kelime ya da sayı Palindrome değildir.")}
        else if (input!="q"&& input.length%2!=1)
            println("Palindrome olabilmesi için tek basamaklı sayı ya da kelime giriniz.")
    //
    }while (input!="q")
    println("Program Sonlandırılıyor..")
}