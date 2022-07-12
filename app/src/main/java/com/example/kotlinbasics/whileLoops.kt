package com.example.kotlinbasics

fun main()
{
    //WHILE & DO WHILE LOOPS

  var n = 80
    var x = 2
    while(n>0)
    {
        n-= 8
        print("$n ")
    }
    println("end of loop")
    do{
        x+=2
        print("$x ")
    }
        while(x<50)

            var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp=="cold")
    {
        roomTemp++
        if(roomTemp>=20)
        {
            feltTemp =" it's comfortable"
            println("$feltTemp")
        }
    }

    //Exercise
      var qwe = 0
    while(qwe<10000)
    {
        qwe++
        if(qwe==9001)
        {
            println("it's over 9000")
        }
    }
//EXERCISE
var humidity = "humid"
    var humidityLevel = 80
    while(humidity =="humid")
    {
        humidityLevel-=5
        println("humididty decreased")
        if(humidityLevel<60)
        {
            humidity ="confy"
            println("its $humidity now")
        }
    }





   // BREAK AND CONTINUE STATEMENT
    var y =0
    while(y<=100)
    {

        print("$y ")
        if(y==56)
        {
            break
        }
            ++y
    }



}