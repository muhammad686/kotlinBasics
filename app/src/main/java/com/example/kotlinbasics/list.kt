package com.example.kotlinbasics

fun main()
{
    val months= listOf("january","february","march","april","may")
    val  addmonths = months.toMutableList()
    val newmonths = arrayOf("june ","july")
    addmonths.addAll(newmonths)
    //addmonths.add("august")
//    for(mon in addmonths)
//    {
//        print("$mon\t")
//    }
    print(addmonths)

    val days = mutableListOf<String>("monday","tuesday")
    days.add("jkl")
    for(day in days)
    {
        print("$day\t")
    }
    days.reverse()
    print(days)
    days.removeAll(days)
    print(days)

}