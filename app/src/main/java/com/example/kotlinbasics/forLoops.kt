package com.example.kotlinbasics
fun main() {
// FOR LOOPS
    var i = 0
    for (i in 1..10) {
        print("$i ")
    }
    println("\n")
    for (i in 1.until(10))  // for(i in 1 until 10)
    {
        print("${i * 3} ")
    }
    println("\n")
    for (i in 10.downTo(0).step(2)) //for(i in 1 until 10 step 2 )
    {
        print("${i * 2} ")
    }
    println("\n")
    for (i in 100 downTo 0 step (5)) {
        print("$i ")
    }
    //EXERCISE
    var num = 0
    for (num in 0 until 10000) {
        if (num == 9001) {
            println("its over 9000")
        }
    }
    for (x in 0..9) {
        for (y in 0..9) {
            print("Result = ${x * y} ")
        }
    }

}