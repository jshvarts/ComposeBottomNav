package com.jshvarts.composebottomnav.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jshvarts.composebottomnav.screens.AboutScreen
import com.jshvarts.composebottomnav.screens.HomeScreen
import com.jshvarts.composebottomnav.screens.SettingsScreen

@Composable
fun NavigationSetup(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            HomeScreen()
        }
        composable(BottomNavItem.Settings.route) {
            SettingsScreen(navController)
        }
        composable(Screen.About.route) {
            AboutScreen()
        }
    }
}