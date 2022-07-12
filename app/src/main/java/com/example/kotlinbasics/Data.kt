package com.example.kotlinbasics

data class User(val id: Int,var name: String)
{

}
fun main()
{
    val user1 = User(1,"Taha")
    val n = user1.name
    val iD  = user1.id
    println("the id of user is: $iD\n Name o fuser is: $n")
    user1.name = "akbar"
    val user2 = User(1, "javed")

    println(user1.equals(user2))
    val updateUser = user1.copy(name = "Noman")
    print("user 1 details are: $user1 \n user 2 details are: $user2\n")
    print(updateUser)
    println()
    println(updateUser.component1())
    println(updateUser.component2())

    val (id,name) = updateUser
    println("id: $id\t\t\t Name: $name")
}