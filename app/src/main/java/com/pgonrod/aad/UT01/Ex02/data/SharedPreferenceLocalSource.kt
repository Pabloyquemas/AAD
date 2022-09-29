package com.pgonrod.aad.UT01.Ex02.data

import android.content.Context
import com.pgonrod.aad.R
import com.pgonrod.aad.UT01.Ex02.domain.State

const val firstopen = "isfirstopen"
class SharedPreferenceLocalSource (val context: Context) {
    val sharedPref = context.getSharedPreferences(
        context.getString(R.string.preference_ut01ex02), Context.MODE_PRIVATE)

    fun saveState(state: State){
        val editor = sharedPref.edit()

        editor.putBoolean(firstopen, state.estado)
        editor.apply()

    }
    fun getState(): State {
        return State(
            sharedPref.getBoolean(firstopen, true)
        )


    }
}