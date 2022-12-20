package com.example.feature.money_api

import com.example.core.feature_api.FeatureApi

interface MoneyFeatureApi : FeatureApi {
    fun moneyRoute(): String
}