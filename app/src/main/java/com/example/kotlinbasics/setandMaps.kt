package com.example.kotlinbasics

fun main()
{
    val   fruits = setOf("mango","orange","apple","banana")
print(fruits.toSortedSet())
    val addfruits = fruits.toMutableList()
addfruits.add("melon")
    addfruits.add("grapes")
    print(addfruits.elementAt(3))
    print(addfruits)

val daysofweek = mapOf(1 to "monday", 2 to "tuesday")
    //key exist only one time.
//    for(key in daysofweek.keys)
//    {
//        print("$key is tp ${daysofweek[key]}")
//    }

        val newdays = daysofweek.toMutableMap()
         newdays[4] = "thursday"
    print(newdays)

}


