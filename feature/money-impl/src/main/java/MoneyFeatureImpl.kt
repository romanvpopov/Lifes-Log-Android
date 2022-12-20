package com.example.feature.money_impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.money_api.MoneyFeatureApi

class MoneyFeatureImpl : MoneyFeatureApi {

    private val route = "money"

    override fun moneyRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            MoneyScreen(modifier = modifier)
        }
    }
}