//- Display Pyramid
//Kullanıcıdan satır sayısını alarak aşağıdaki şekilleri bastıran kodu yaz. Her şekil için ayrı kod yaz
//Kullanıcı 7 girerse;
//Şekil-1                      Şekil-2
//            *                                         1
//          * * *                                     2 1 2
//        * * * * *                                 3 2 1 2 3
//      * * * * * * *                             4 3 2 1 2 3 4
//    * * * * * * * * *                         5 4 3 2 1 2 3 4 5
//  * * * * * * * * * * *                     6 5 4 3 2 1 2 3 4 5 6
//* * * * * * * * * * * * *                 7 6 5 4 3 2 1 2 3 4 5 6 7
//
//Şekil-3                      Şekil-4
//              *                             1
//            *   *                         2   2
//          *       *                     3       3
//        *           *                 4           4
//      *               *             5               5
//    *                   *         6                   6
//  * * * * * * * * * * * * *     7 6 5 4 3 2 1 2 3 4 5 6 7
fun main(args: Array<String>) {
    val input = 7
    for (i in 1..input) {
        var piramit = ""
        for (j in 1..input - i) {
            piramit += " "
        }
        for (j in 1..i) {
            piramit += "*"
        }
        for (j in 1..i - 1) {
            piramit += "*"
        }
        for (j in 1..input - i) {
            piramit += " "
        }

        println(piramit)
    }
//            *                                         1
//          * * *                                     2 1 2
//        * * * * *                                 3 2 1 2 3
//      * * * * * * *                             4 3 2 1 2 3 4
//    * * * * * * * * *                         5 4 3 2 1 2 3 4 5
//  * * * * * * * * * * *                     6 5 4 3 2 1 2 3 4 5 6
//* * * * * * * * * * * * *                 7 6 5 4 3 2 1 2 3 4 5 6 7
    for (i in 1..input) {
        var piramit = ""
        for (j in 1..input - i) {
            piramit += " "
        }
        for (j in i downTo 1) {
            piramit += j
        }
        for (j in 1..i-1) {
            piramit += j+1
        }
        for (j in 1..input - i) {
            piramit += " "
        }
        println(piramit)
    }
    //Şekil-3                      Şekil-4
    //7-1*2=12 7-2*2=10 7-3*2=8 7-4*2=6      2-3-4-5-6
    //i-1+1 2*2+1=5 3*2+1=7 4*2+1=9 5*2+1=11 1-3-5-7-9 0-3-7-11-15-19  25 7
//           12 *                             1
//          10*   *                         2   2
//     7   8*       *                     3       3
// 11   6 *           *                 4           4
//    4 *               *             5               5
//  2 *                   *         6                   6
// 0* * * * * * * * * * * * *     7 6 5 4 3 2 1 2 3 4 5 6 7
    for (i in 1..input){
        var piramit=""
        for (j in 1..(input-i)*2){
            piramit+=" "
        }
        for (j in 1..1) {
            piramit += "*"
        }
        for (j in 1..(i-1)*2){
        piramit+=" "
        }
        for (j in 1..((i-1)*2)-1){
            piramit+=" "
        }
        for (j in 1..1) {
            if (i!=1){
                piramit+="*"
            }
        }
        println(piramit)
}
}