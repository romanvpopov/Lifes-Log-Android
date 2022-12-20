package com.example.feature.settings_api

import com.example.core.feature_api.FeatureApi

interface SettingsFeatureApi: FeatureApi {
    fun settingsRoute(): String
}