package com.example.feature.settings.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.settings_api.SettingsFeatureApi

class SettingsFeatureImpl : SettingsFeatureApi {

    private val route = "settings"
    override fun settingsRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            SettingsScreen(modifier,
                {navController.navigate("login")},
                {navController.navigate("events")})
        }
    }
}