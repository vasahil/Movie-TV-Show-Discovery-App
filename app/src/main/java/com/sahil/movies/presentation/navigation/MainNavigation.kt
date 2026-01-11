package com.sahil.movies.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sahil.movies.presentation.details.DetailsScreen
import com.sahil.movies.presentation.home.HomeScreen

@Composable
fun MainNavigation(){
    val navController = rememberNavController()

    NavHost(navController, startDestination = AppRoutes.Home.route) {
        composable(AppRoutes.Home.route){
            HomeScreen(
                onItemClick = {id ->
                    navController.navigate(AppRoutes.Details.passId(id))
                }
            )
        }

        composable(AppRoutes.Details.route,
            arguments = listOf(
                navArgument("id") {type = NavType.IntType}
            )){backStackEntry->
            val id = backStackEntry.arguments?.getInt("id")?: 0
            DetailsScreen(id = id)
        }
    }
}