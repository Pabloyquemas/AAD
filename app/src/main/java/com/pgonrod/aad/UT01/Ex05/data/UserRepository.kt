package com.pgonrod.aad.UT01.Ex05.data

import com.pgonrod.aad.UT01.Ex05.data.local.UsersLocalDataSource
import com.pgonrod.aad.UT01.Ex05.data.remote.UsersRemoteDataSource
import com.pgonrod.aad.UT01.Ex05.domain.User

class UserRepository (val localSource: UsersLocalDataSource,
                      val remoteSource: UsersRemoteDataSource) {
    /*
    * Primero desde local si no desde remoto
    * */

    fun getUsers(): List<User>{
        var users = localSource.getUsers()
        if (users == null){
            users = remoteSource.getUsers()
            localSource.saveUsers(users)
        }
        return users
    }

    /*
    fun getUserById(userId: Int): User {
        //TODO: verificar en local sino en remote
    }
    */
    fun removeUser(userId: Int){
        //TODO: Local
    }
}