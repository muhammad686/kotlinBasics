package com.example.kotlinbasics

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

val add ={a:Int,b:Int-> println(a+b)}
fun main()
{
   // val sum :(Int,Int)->{a:Int,b:Int->a+b}
    println(sum(2,3))


     add(3,4)
}