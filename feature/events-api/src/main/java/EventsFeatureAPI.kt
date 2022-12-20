package com.example.feature.events_api

import com.example.core.feature_api.FeatureApi

interface EventsFeatureApi : FeatureApi {
    fun eventsRoute(): String
}