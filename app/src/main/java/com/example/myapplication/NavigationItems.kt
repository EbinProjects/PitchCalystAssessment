package com.example.myapplication


import SelectCard
import com.example.myapplication.Pojo.BottomNavigationModel


object NavigationItems{
    val bottomLists = listOf(
        BottomNavigationModel(
            title = "HOME",
            selectedIcons = R.drawable.selecedhome,
            unselectedIcons = R.drawable.unhome
        ), BottomNavigationModel(
            title = "CHAT",
            selectedIcons =  R.drawable.selectchat,
            unselectedIcons = R.drawable.unchat
        ),
        BottomNavigationModel(
            title = "CART",
            selectedIcons = R.drawable.selectshop,
            unselectedIcons = R.drawable.unshop
        ),
        BottomNavigationModel(
            title = "PROFILE",
            selectedIcons = R.drawable.selectuser,
            unselectedIcons = R.drawable.unuser
        )
    )

}