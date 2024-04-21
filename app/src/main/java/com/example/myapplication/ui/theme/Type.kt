package com.example.myapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.intersemibold)),
        fontWeight = FontWeight(600),
        fontSize = 21.sp,
        lineHeight = 28.89.sp,
        letterSpacing = 0.5.sp
    ),
    displayMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.intersemibold)),
        fontWeight = FontWeight(600),
        fontSize = 17.sp,
        lineHeight = 20.89.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
    fontFamily = FontFamily(Font(R.font.intersemibold)),
    fontWeight = FontWeight(600),
    fontSize = 10.89.sp,
    lineHeight = 15.89.sp,
    letterSpacing = 0.5.sp
),
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.interregular)),
        fontWeight = FontWeight(500),
        fontSize = 7.47.sp,
        lineHeight = 9.04.sp,
        letterSpacing = 3.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.intersemibold)),
        fontWeight = FontWeight(600),
        fontSize = 14.sp,
        lineHeight = 13.sp,
        letterSpacing = 8.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.intersemibold)),
        fontWeight = FontWeight(500),
        fontSize = 7.47.sp,
        lineHeight = 9.04.sp,
        letterSpacing = 3.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.intermedium)),
        fontWeight = FontWeight(500),
        fontSize = 4.47.sp,
        lineHeight = 5.04.sp,
        letterSpacing = 3.5.sp
    ),


    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)