package com.example.boardfragment.ui.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton


class Preference (context: Context){
    private  val sharedPreferences1 = PreferenceManager.getDefaultSharedPreferences(context)
    private  val sharedPreferences:SharedPreferences = context.getSharedPreferences("preference",
        Context.MODE_PRIVATE
    )
    fun isShowBoard():Boolean{
        return sharedPreferences.getBoolean("board",false)
    }
    fun boardShowed(isShow:Boolean){
        sharedPreferences.edit().putBoolean("board",isShow).apply()
    }
}