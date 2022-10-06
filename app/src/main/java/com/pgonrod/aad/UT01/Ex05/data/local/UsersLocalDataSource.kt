package com.pgonrod.aad.UT01.Ex05.data.local

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pgonrod.aad.UT01.Ex05.data.remote.UsersRemoteDataSource
import com.pgonrod.aad.UT01.Ex05.domain.User

class UsersLocalDataSource (val sharedPref: SharedPreferences,
                            val remoteSource: UsersRemoteDataSource) {

    private val gson = Gson()

    fun saveUsers(users: List<User>){
        val editor = sharedPref.edit()
        val jsonNews = gson.toJson(users, User::class.java)
        editor.apply {
            var UsersRemoteList = remoteSource.getUsers()
            apply()
        }
    }
    fun getUsers(): List<User>?{
        //TODO

        return emptyList()
    }
    /*
    fun findByid(userId: Int): User {
        //TODO return a user
    }
    */
    fun remove(userId: Int){
        //TODO
    }
}