package com.pgonrod.aad.UT01.Ex05.presentation

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pgonrod.aad.R
import com.pgonrod.aad.UT01.Ex05.data.UserRepository
import com.pgonrod.aad.UT01.Ex05.data.local.UsersLocalDataSource
import com.pgonrod.aad.UT01.Ex05.data.remote.UsersRemoteDataSource

class Ut01Ex05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01_ex05)

        init()
    }
    private  fun init(){
        //Obtain all users from data layer
        val userRepository = UserRepository(
            UsersLocalDataSource(
                    getPreferences(Context.MODE_PRIVATE),
            UsersRemoteDataSource()
        )

        val users = userRepository.getUsers()
        Log.d("@dev", "Users: $users")
    }
}