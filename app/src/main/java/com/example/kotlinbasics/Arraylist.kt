package com.example.kotlinbasics

fun main()
{
    val ar = ArrayList<Double>()
    ar.add(12.3)
    ar.add(11.1)
    ar.add(11.2)
    ar.add(11.3)
    ar.add(11.4)
    var avg = 0.0

    for(ind in ar.indices)
    {
        //avg = avg+ar[ind]
        avg+=ind
    }
    var result = avg / ar.size
    print(result)



}