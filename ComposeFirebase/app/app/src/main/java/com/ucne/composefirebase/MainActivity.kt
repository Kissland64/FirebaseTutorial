package com.ucne.composefirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ucne.composefirebase.ui.theme.ComposeFirebaseTheme
import com.ucne.composefirebase.ui.theme.screens.cars.CarListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeFirebaseTheme {
                CarListScreen()
            }
        }
    }
}