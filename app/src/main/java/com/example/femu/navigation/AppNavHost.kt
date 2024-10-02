package com.example.femu.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.femu.ui.theme.screens.login.LoginScreen

import com.example.femu.ui.theme.screens.signup.SignupScreen
import com.example.femu.ui.theme.screens.about.AboutScreen
import com.example.femu.ui.theme.screens.account.AddAccountScreen
import com.example.femu.ui.theme.screens.account.ViewAccountScreen
import com.example.femu.ui.theme.screens.home.HomeScreen
import com.example.femu.ui.theme.screens.map.MapScreen
import com.example.femu.ui.theme.screens.products.AddProductsScreen
import com.example.femu.ui.theme.screens.products.ViewProductsScreen
import com.example.femu.ui.theme.screens.taskmanager.AddTaskScreen
import com.example.femu.ui.theme.screens.taskmanager.ViewTaskScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_LOGIN
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }


        composable(ADD_TASK){
            AddTaskScreen(navController = navController)
        }
        composable(VIEW_TASKS){
            ViewTaskScreen(navController = navController)
        }

        composable(ADD_ACCOUNT){
            AddAccountScreen(navController = navController)
        }
        composable(VIEW_ACCOUNT){
            ViewAccountScreen(navController = navController)
        }
        composable(MAP){
            MapScreen(navController = navController)
        }


    }
}