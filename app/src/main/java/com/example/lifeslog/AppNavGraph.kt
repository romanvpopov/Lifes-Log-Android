package com.example.lifeslog

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.core.feature_api.register
import com.example.core.lldp.LLDP


@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = LLDP.homeFeature().homeRoute()
    ) {
        register(
            LLDP.homeFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            LLDP.eventsFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            LLDP.moneyFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            LLDP.sportFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            LLDP.healthFeature(),
            navController = navController,
            modifier = modifier
        )
        register(
            LLDP.settingsFeature(),
            navController = navController,
            modifier = modifier
        )
    }
}
