fun main(args: Array<String>) {
    var dizitamsayı = Array<Int>(5) { 0 }
    dizitamsayı[2] = 45
    println(dizitamsayı[2])

    println("Dizinin tüm elemanları:")
    for(eleman in dizitamsayı){
        println(eleman)
    }
    println("İndex olarak dizinin elemanları  :")
    for(index in 0..4){
        println("dizi[$index]" +dizitamsayı[index])
    }
    var Dizistr=Array<String>(4){""}
    for(index in 0..3){
        println("dizistr($index):")
        Dizistr[index]= readln()
    }
    for(index in 0..3)
    {
        println("dizistr:"+Dizistr[index])
    }
    }
