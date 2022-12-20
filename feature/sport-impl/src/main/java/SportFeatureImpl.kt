package com.example.feature.sport_impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.sport_api.SportFeatureApi

class SportFeatureImpl : SportFeatureApi {

    private val route = "sport"

    override fun sportRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            SportScreen(modifier = modifier)
        }
    }
}