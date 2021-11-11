package controlFlow

fun main(){
    //0 부터 3까지
    for(i in 0..3) {             // 1
        print(i)
    }
    print(" ")

    //0부터 2까지
    for(i in 0 until 3) {        // 2
        print(i)
    }
    print(" ")

    //2부터 8까지 2씩 증가
    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    print(" ")

    //8뷰터 2까지 2씩 감소
    for(i in 8 downTo 2 step 2){
        print(i)
    }
    print(" ")

    //3부터 0까지 감소
    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    print(" ")

    //Char ranges are also supported:
    for (c in 'a'..'d') {        // 1
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    print(" ")

    //Ranges are also useful in if statements:
    val x = 2
    if (x in 1..5) {            // 1
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          // 2
        print("x is not in range from 6 to 10")
    }

}