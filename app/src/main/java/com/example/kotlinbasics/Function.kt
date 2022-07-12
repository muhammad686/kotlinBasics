package com.example.kotlinbasics

// a method is function within a class
fun sum(a:Int,b:Int) :Int
{
    return a+b
}
fun rndom()
{
    var num = 0
    for(num in 0 until 10000)
    {
        if(num==9001)
        {
            println("its over 9000")
        }
    }
}
fun NUllABLE()
{
    var name: String?= "haha"
    name = null
    if(name!=null)
    {
        var l = name.length
        print("\n $l \n")
    }
    else
        name = null

    var x = name?.length
    print("\n$x \n")
    // elvis operator
    val nAme = name ?: "guest"
    // not NUll Assertion
//    nAme!!.toLowerCase()
//    print(" name is : $nAme \n")
//    nAme!!.toUpperCase()
//    print(" name is : $nAme \n")
    print(nAme!!?.toLowerCase())
    println("\n")
    print(nAme!!?.toUpperCase())


}


fun main()
{
   var result = sum(2,3)
print("sum of values are $result\n")
    rndom()

    NUllABLE()
}