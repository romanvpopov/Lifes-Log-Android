package com.example.feature.health_api

import com.example.core.feature_api.FeatureApi

interface HealthFeatureApi : FeatureApi {

    fun healthRoute(): String
}