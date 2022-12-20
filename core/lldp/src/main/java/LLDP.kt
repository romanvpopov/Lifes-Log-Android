package com.example.core.lldp

import android.content.SharedPreferences
import com.example.feature.events_api.EventsFeatureApi
import com.example.feature.health_api.HealthFeatureApi
import com.example.feature.home_api.HomeFeatureApi
import com.example.feature.money_api.MoneyFeatureApi
import com.example.feature.sport_api.SportFeatureApi
import com.example.feature.settings_api.SettingsFeatureApi
import java.sql.Connection

object LLDP {
    private lateinit var homeFeatureApi: HomeFeatureApi
    private lateinit var eventsFeatureApi: EventsFeatureApi
    private lateinit var moneyFeatureApi: MoneyFeatureApi
    private lateinit var sportFeatureApi: SportFeatureApi
    private lateinit var healthFeatureApi: HealthFeatureApi
    private lateinit var settingsFeatureApi: SettingsFeatureApi
    private lateinit var prefs: SharedPreferences
    private lateinit var con: Connection

    fun getPrefs(): SharedPreferences = prefs
    fun setPrefs(prfs: SharedPreferences) {prefs = prfs}
    fun getCon(): Connection = con
    fun setCon(cn: Connection) {con = cn}

    fun provideImpl(
        homeFeatureApi: HomeFeatureApi,
        eventsFeatureApi: EventsFeatureApi,
        moneyFeatureApi: MoneyFeatureApi,
        sportFeatureApi: SportFeatureApi,
        healthFeatureApi: HealthFeatureApi,
        settingsFeatureApi: SettingsFeatureApi,
    ) {
        LLDP.homeFeatureApi = homeFeatureApi
        LLDP.eventsFeatureApi = eventsFeatureApi
        LLDP.moneyFeatureApi = moneyFeatureApi
        LLDP.sportFeatureApi = sportFeatureApi
        LLDP.healthFeatureApi = healthFeatureApi
        LLDP.settingsFeatureApi = settingsFeatureApi
    }
    fun homeFeature(): HomeFeatureApi = homeFeatureApi
    fun eventsFeature(): EventsFeatureApi = eventsFeatureApi
    fun moneyFeature(): MoneyFeatureApi = moneyFeatureApi
    fun sportFeature(): SportFeatureApi = sportFeatureApi
    fun healthFeature(): HealthFeatureApi = healthFeatureApi
    fun settingsFeature(): SettingsFeatureApi = settingsFeatureApi
}