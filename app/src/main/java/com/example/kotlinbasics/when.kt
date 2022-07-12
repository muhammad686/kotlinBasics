package com.example.kotlinbasics

fun main()
{

    //WHEN STATEMENT

   var season = 4
    when (season)
    {
        1-> print("Spring")
        2-> print("Summer")
        3-> print("Autumn")
        4-> print("Winter")
    }


   //IS
    var x: Any = "asdf"
    when(x)
    {
         is Int ->print("$x is an integer")
       is Double ->print("$x is an double")
        is String ->print("$x is a string")
        is Char ->print("$x is a char")
        else -> print("None of above")

        //!is = will speacify to that value
    }

    // IN

    var month = 12
    when(month)
    {
        in 3..5 -> print("spring")
        in 6..8 -> print("Summer")
        in 9..11 ->print("Fall")
        in 12 downTo 2 -> print("Winter")
    }


}