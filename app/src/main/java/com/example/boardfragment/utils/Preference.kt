package com.example.boardfragment.utils

import android.content.Context
import android.content.SharedPreferences

class Preference (context: Context){
    private  val sharedPreferences: SharedPreferences = context.getSharedPreferences("preference",
        Context.MODE_PRIVATE
    )
    fun isShowBoard():Boolean{
        return sharedPreferences.getBoolean("board",false)
    }
    fun boardShowed(isShow:Boolean){
        sharedPreferences.edit().putBoolean("board",isShow).apply()
    }
}