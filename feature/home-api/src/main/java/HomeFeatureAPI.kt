package com.example.feature.home_api

import com.example.core.feature_api.FeatureApi

interface HomeFeatureApi : FeatureApi {
    fun homeRoute(): String
}