package com.example.myapplication.NavScreens

sealed class Screenes(val route:String) {
    data object home : Screenes("HOME")
    data object message : Screenes("CHAT")
    data object shopping : Screenes("CART")
    data object account : Screenes("PROFILE")
}