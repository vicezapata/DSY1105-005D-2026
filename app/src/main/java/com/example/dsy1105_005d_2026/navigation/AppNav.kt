package com.example.dsy1105_005d_2026.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.dsy1105_005d_2026.ui.theme.HomeScreen

@Composable


fun AppNav{
    val navController= rememberNavController()

    NavHost(navController=navController, startDestination = "login"){
        composable("login"){
            HomeScreen(navController=navController)
        }
    }// fin composable

    composable(
        route="muestraDatos/{username}",
        arguments=listOf(
            navArgument("username"){
                type= NavType.StringType
            }//fin list
        )//fin arg
    )//fin compo


}// fin AppNav