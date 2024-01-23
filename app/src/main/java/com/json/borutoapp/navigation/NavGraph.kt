package com.json.borutoapp.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.json.borutoapp.presentation.screens.splash.SplashScreen
import com.json.borutoapp.presentation.screens.welcome.WelcomeScreen
import com.json.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Welcome.route
    ){
        composable(Screen.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(Screen.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(Screen.Home.route){
            //HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
                type = NavType.IntType
            })
        ){

        }
        composable(Screen.Search.route){
            //SearchScreen(navController = navController)
        }
    }
}