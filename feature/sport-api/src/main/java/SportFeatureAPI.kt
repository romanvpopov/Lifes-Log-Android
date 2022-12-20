package com.example.feature.sport_api

import com.example.core.feature_api.FeatureApi

interface SportFeatureApi : FeatureApi {
    fun sportRoute(): String
}