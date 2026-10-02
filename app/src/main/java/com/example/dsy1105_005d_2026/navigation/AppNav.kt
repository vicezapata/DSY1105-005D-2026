package com.example.dsy1105_005d_2026.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.dsy1105_005d_2026.ui.Home.MuestraDatosScreen
import com.example.dsy1105_005d_2026.ui.theme.HomeScreen

@Composable
//cambios para sacar error
//fun AppNav()
// mover el } al final
//    }//fin NavHost

fun AppNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            HomeScreen(navController = navController)
        }// fin composable
//
// Para la opcion de muestradatos se pasa username
        composable(
            route = "muestraDatos/{username}",
            arguments = listOf(
                navArgument("username") {
                    type = NavType.StringType
                }//fin list
            )//fin arg
        )//fin compo

        {
          backStackEntry ->
            val username=backStackEntry.arguments?.getString("username").orEmpty()
            MuestraDatosScreen(username=username, navController=navController)


        }

    }//fin NavHost
}// fin AppNav