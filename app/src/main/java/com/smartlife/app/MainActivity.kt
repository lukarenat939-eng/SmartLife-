package com.smartlife.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

val Navy = Color(0xFF0A1931)
val Teal = Color(0xFF14B8A6)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { WelcomeScreen() }
    }
}

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(Navy),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("SmartLife", color = Teal, fontSize = 40.sp)
        Text("Welcome", color = Color.White, fontSize = 18.sp)
    }
}
