package com.jshvarts.composebottomnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import com.jshvarts.composebottomnav.navigation.BottomNavigationBar
import com.jshvarts.composebottomnav.navigation.NavigationSetup
import com.jshvarts.composebottomnav.ui.theme.ComposeBottomNavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBottomNavTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = { BottomNavigationBar(navController) }
                    ) {
                        NavigationSetup(navController = navController)
                    }
                }
            }
        }
    }
}
