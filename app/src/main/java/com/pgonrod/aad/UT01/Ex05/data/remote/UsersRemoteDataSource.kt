package com.pgonrod.aad.UT01.Ex05.data.remote

import com.pgonrod.aad.UT01.Ex05.domain.User

class UsersRemoteDataSource {

    /*
    * Mock (invencion de los datos con la misma estructura)
    * Reemplazar con getUser from PSP
    * */
    fun getUsers(): List<User>{
        return mutableListOf(
            User(1, "User1", "Username1"),
            User(2, "User2", "Username2"),
            User(3, "User3", "Username3"),
            User(4, "User4", "Username4"),
            User(5, "User5", "Username5"),
            User(6, "User6", "Username6"),
            User(7, "User7", "Username7"),
        )
    }
    fun getUser(userId: Int) : User{
        return  User(userId, "User$userId", "Username$userId")
    }
}