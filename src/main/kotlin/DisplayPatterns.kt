//Display Patterns
//Kullanıcıdan satır sayısını alarak aşağıdaki şekilleri bastıran kodu yaz. Her şekil için ayrı kod yaz
//Kullanıcı 5 girerse;
//Şekil-1             Şekil-2             Şekil-3            Şekil-4
//1                   1 2 3 4 5                   1          5 4 3 2 1
//1 2                 1 2 3 4                   2 1            4 3 2 1
//1 2 3               1 2 3                   3 2 1              3 2 1
//1 2 3 4             1 2                   4 3 2 1                2 1
//1 2 3 4 5           1                   5 4 3 2 1                  1
fun main(args: Array<String>) {
print("Oluşturmak istediğiniz piramit sayısını yazınız:")
    val input= readln().toInt()

    for (i in 1..input) {
        var numara = ""
        for (j in 1..i) {
            numara += j
        }
        println(numara)
    }
    println()

    for (a in 1..input){
        var numara=""

        for (b in 1..(input+1)-a)
            numara+=b
        println(numara)
    }
println(" ")
    for(c in 1..input){
        var numara=""
        for (d in 1..input-c)
            numara+=" "
        for (d in c downTo 1){
            numara+=d
        }
        println(numara)
    }
    println(" ")
     for (e in 1..input){
         var numara=""
         for (d in 1..e-1){
             numara+=" "
         }
         for (d in (input-e)+1 downTo 1){
             numara+=d
         }
         println(numara)
     }

}