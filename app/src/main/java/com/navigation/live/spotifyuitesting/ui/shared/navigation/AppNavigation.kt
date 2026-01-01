package com.navigation.live.spotifyuitesting.ui.shared.navigation

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.navigation.live.spotifyuitesting.ui.screens.create_account.CreateAccount
import com.navigation.live.spotifyuitesting.ui.screens.home_screen.HomeScreen
import com.navigation.live.spotifyuitesting.ui.screens.login_in.LoginScreen
import com.navigation.live.spotifyuitesting.ui.screens.sign_up.SignUp
import com.navigation.live.spotifyuitesting.ui.screens.splash.SplashScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppRoutes.Splash.route,
        modifier = Modifier.background(Color.Black),
        enterTransition = {
            slideInHorizontally(initialOffsetX = { 1000 }) + fadeIn()
        },
        exitTransition = {
            slideOutHorizontally(targetOffsetX = { -1000 }) + fadeOut()
        },
        popEnterTransition = {
            slideInHorizontally(initialOffsetX = { -1000 }) + fadeIn()
        },
        popExitTransition = {
            slideOutHorizontally(targetOffsetX = { 1000 }) + fadeOut()
        }
    ) {
        composable(AppRoutes.Splash.route) {
            SplashScreen(
                signup = {
                    navController.navigate(AppRoutes.Signup.route)
                },
                login = {
                    navController.navigate(AppRoutes.Login.route)
                }
            )
        }
        composable(AppRoutes.Signup.route) {
            SignUp(
                onBack = {
                    navController.popBackStack()
                },
                onEmailClick = {
                    navController.navigate(AppRoutes.CreateAccount.route)
                }
            )
        }
        composable(AppRoutes.Login.route) {
            LoginScreen(
                onBack = {
                    navController.popBackStack()
                },
                onEmailClick = {
                    navController.navigate(AppRoutes.CreateAccount.route)
                }
            )
        }
        composable(AppRoutes.CreateAccount.route) {
            CreateAccount(
                onBack = {
                    navController.popBackStack()
                },
                onNext = {
                    navController.navigate(AppRoutes.Home.route)
                })
        }
        composable(AppRoutes.Home.route) {
            HomeScreen()
        }

    }
}