package com.pgonrod.aad.UT01.Ex02.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pgonrod.aad.R
import com.pgonrod.aad.UT01.Ex02.domain.State

class Ut01Ex02Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex02)

        initPreferences()

    }
    private  fun initPreferences(){

            val spState= com.pgonrod.aad.UT01.Ex02.data.SharedPreferenceLocalSource(this)
            val newState = spState.getState()
            spState.saveState(
                State(false)
            )

    }
    private fun newState(state: State){
        if (state.estado){
            Log.d("@dev", "aplicacion abierta por primera vez:  ${state.estado}")
        } else {
            Log.d("@dev", "aplicacion abierta por primera vez:  ${state.estado}")
        }
    }
}