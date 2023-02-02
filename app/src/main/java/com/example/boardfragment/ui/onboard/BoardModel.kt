package com.example.boardfragment.ui.onboard

data class BoardModel(
    val image :Int ?= null,
    val text:String ?= null
    ,val isLastBoard :Boolean ?=false
):java.io.Serializable
