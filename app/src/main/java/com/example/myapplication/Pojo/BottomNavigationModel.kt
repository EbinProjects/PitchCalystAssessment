package com.example.myapplication.Pojo

import android.media.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationModel(
    val title : String,
    val unselectedIcons : Int,
    val selectedIcons : Int,
)
