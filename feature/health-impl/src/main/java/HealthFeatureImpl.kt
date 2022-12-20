package com.example.feature.health_impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.health_api.HealthFeatureApi

class HealthFeatureImpl : HealthFeatureApi {

    private val route = "health"

    override fun healthRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            HealthScreen(modifier = modifier)
        }
    }
}