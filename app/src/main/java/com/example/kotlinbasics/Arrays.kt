package com.example.kotlinbasics

fun main()
{
    val arr :IntArray = intArrayOf(1,2,3,4,5,6)
    val ar = intArrayOf(1,2,3,4,5,6)
    val arraY = arrayOf(1,2,3,4,5,6)
    ar[0]=9
    //print(arr.contentToString());
    for (element in ar)
    {
        print("$element\t")
    }
    print("\n")

//    for (element in ar)
//    {
//
//        print("${element*2}\t")
//    }

    val fruits = arrayOf(Fruit("apple",90.7),Fruit("banana",90.0))
    //print(fruits.contentToString())
//    for(index in fruits.indices)
//    {
//        print("Fruit Name: ${fruits[index].name} \n Fruit price: ${fruits[index].price} is in index ; $index\n")
//    }

    for(fruit in fruits)
    {
        print("${fruit.name}\t\t" + "${fruit.price}\n")
    }

}
data class Fruit(val name:String, val price:Double)