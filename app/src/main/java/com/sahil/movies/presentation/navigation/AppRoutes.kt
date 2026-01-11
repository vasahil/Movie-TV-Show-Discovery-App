package com.sahil.movies.presentation.navigation

sealed class AppRoutes(val route: String) {
    object Home : AppRoutes("home")
    object Details : AppRoutes("details/{id}"){
        fun passId(id: Int) = "details/$id"
    }
}