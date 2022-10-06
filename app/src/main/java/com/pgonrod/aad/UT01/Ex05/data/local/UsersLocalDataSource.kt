package com.pgonrod.aad.UT01.Ex05.data.local

import android.content.SharedPreferences
import com.google.gson.Gson
import com.pgonrod.aad.UT01.Ex05.domain.User

class UsersLocalDataSource (val sharedPref: SharedPreferences) {

    private val gson = Gson()

    fun saveUsers(users: List<User>){
        val jsonUser = gson.toJson(users, User::class.java)
        val editor = sharedPref.edit()

        editor.putString(users.id.toString(), jsonUser)
        editor.apply()
    }

    fun getUsers(): List<User>{
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