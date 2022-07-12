package com.example.kotlinbasics

class Person(fn: String, ln: String, i: Int)
{
    var myFirstName : String? = null
    var myLastName : String? = null
    var myAge : Int? = null
   // myAge = 23



    init {
        this.myFirstName = fn
        this.myLastName = ln
        this.myAge=i
        println("p1 Name is : $myFirstName \t\t Last Name is : $myLastName \t\t Age is : $myAge \n ")
    }

}

fun main()
{
    var p1 = Person("Muhammad", "Taha",9)
}