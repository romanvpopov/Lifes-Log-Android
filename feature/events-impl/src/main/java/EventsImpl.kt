package com.example.feature.events_impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.feature.events_api.EventsFeatureApi

class EventsFeatureImpl: EventsFeatureApi {

    private val route = "events"

    override fun eventsRoute() = route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route) {
            EventsScreen(modifier = modifier)
        }
    }
}